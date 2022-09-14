import java.lang.Math;
public class Lab {
	public static void main(String[] args){
		// Создаём массив f длиной 9, тип данных long
		long f[]=new long[9];
		for (int i=0;i<9;i++){
			// В цикле присваиваем элементам массива f их значения, при этом переводя задаваемое число из int в long
			f[i]=(long)(i*2+5);
		}
		// Создаём массив x длиной 12, тип данных double
		double x[]=new double[12];
		for (int i=0;i<12;i++){
			// В цикле присваиваем элементам массива x их значения, при этом используя random входящий в библиатеку Math
            double y=Math.random();
			x[i]=y*17-7;        	
		}
		// Создаём двумерный массив с размерами 9 на 12, тип данных double
		double[][] c=new double[9][12];
		for (int i=0;i<9;i++){
			for (int j=0;j<12;j++){
				// Проходим по циклу задавая значение каждому элементу массива с
				double u=(x[j]+1.5)/17;
				// Проверяем равнство f[i] к 19
				if (f[i]==19){
					// Задаём значение всем элементам c[i][j], при которых f[i]==19, используя данную нам формулу
					double d=(double)Math.pow(Math.atan(u)*(Math.asin(u+3/4)),3);
					c[i][j]=(double)Math.pow(d,(Math.atan(1/Math.pow(Math.E,Math.abs(x[j])))));
				} else{
					// Проверяем равнство f[i] к 11, 13, 15 и 21
					if (f[i]==11 || f[i]==13 || f[i]==15 || f[i]==21){
						// Задаём значение всем элементам c[i][j], при которых f[i]==11 или f[i]==13 или f[i]==15 или f[i]==21, используя данную нам формулу
						c[i][j]=(double)Math.pow((Math.asin(u/3)-0.5)/Math.pow(Math.E,Math.tan(x[j])),2);
					} else{
						// Задаём значение всем элементам c[i][j], не заданым ранее, используя данную нам формулу
						c[i][j]=(double)Math.tan(Math.tan(2*Math.pow((x[j]-4),2)));
					}
				}
				// Округляем значения элементов c[i][j] до 3 знаков после запятой
				System.out.print(String.format("%.3f",c[i][j])+" ");
			}
			// Перевод строки
			System.out.println();
		}
	}
}