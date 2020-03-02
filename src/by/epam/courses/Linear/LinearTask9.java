package by.epam.courses.Linear;

// // Вычислить значения по формуле ( все значения принимают действительные значения)

public class LinearTask9 {
	
public static void solution() {
		
		double a;
		double b;
		double c;
		double d;
		double temp1;
		double temp2;
		double result;
		
		a = 2;
		b = 7;
		c = 9;
		d = 6;
		
		temp1 = (a/c) * (b /d); 
		temp2 = ((a * b) - c) / (c * d);
		result = temp1 - temp2;
		
		
		System.out.println(result);
		
		
		
	}
}
