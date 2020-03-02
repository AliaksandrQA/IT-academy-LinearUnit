package by.epam.courses.Linear;

/* Дано действительное число х. Не пользуясь никакими другими арифметическими операциями, кроме умножения,
сложения и вычитания, вычислите за минимальное число операций:*/

public class LinearTask39 {
	
	public static void solution() {
		//2x 4 - 3х 3 + 4х2 - 5х + 6.
		
		double x; 
		double result;
		double x_4;
		double x_3; 
		double x_2; 
		
		
		x = 3.4;
		
		x_4 = Math.pow(x, 4);
		x_3 = Math.pow(x, 3);
		x_2 = Math.pow(x, 2);
		
		
		result = 2 * (x_4)- 3*(x_3) +  4*(x_2) - (5 * x) + 6;
		
		System.out.println("Значение ="+" "+ result);
	}
}

