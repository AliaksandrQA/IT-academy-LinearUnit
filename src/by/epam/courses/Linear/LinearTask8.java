package by.epam.courses.Linear;

//Вычислить значение выражения по формуле ( только действительные значения)

public class LinearTask8 {
	
public static void solution() {
		
		double a;
		double b;
		double c;
		double temp;
		
		a = 4.6;
		b = 3.8;
		c = 2.7;
		
		temp = b +  Math.sqrt(b * b + 4 * a * c); // нахождение корня с помощью Math.sqrt
		
		temp = temp / (2 * a); // разность
		
		temp = temp - Math.pow(a, 3) * c; // возведение в степень 
		
		temp = temp + Math.pow(b, -2); // возведение в степень 
		
		System.out.println("result = " + temp); // финальное нахождение
		
		
	}
}
