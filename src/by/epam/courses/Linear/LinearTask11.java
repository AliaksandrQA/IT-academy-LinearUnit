package by.epam.courses.Linear;

//Вычислить периметр и площадь прямоугольного треугольника по длинам 2-х катетов

public class LinearTask11 {

public static void solution() {
		
		int a;
		int b;
		int per;
		int square;
		
		a = 4;
		b = 3;
		
		per = (a + b) * 2;
		square = (a * b);		
		
		System.out.println("Периметр  треугольника равен"+" "+ per);
		System.out.println("Площадь  треугольника равна"+" "+ square);
		
	}

}
