package by.epam.courses.Linear;

// // Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этих чисел.

public class LinearTask17 {
	
public static void solution() {
		
		double a;
		double b;
		double arithCube;
		double geometricMod;
		
		a = 2;
		b = 3;
		
		arithCube = (Math.pow(a,3) + Math.pow(b,3)) / 2;
		
		geometricMod = Math.sqrt(Math.abs(a) * Math.abs(b));
		
		System.out.println("среднее арифметическое кубов = "+" "+ arithCube);
		
		System.out.println("среднее геометрическое модулей = "+" "+ geometricMod);
	}
	
}

// sr1: = (a*a*a+b*b*b) / 2;

// sr2:=sqrt (abs (a) * abs (b)) 

