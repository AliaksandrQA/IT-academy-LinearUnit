package by.epam.courses.Linear;

//Дан прямоугольник, ширина которого в 2 раза меньше длины. Найти площадь прямоугольника.

public class LinearTask7 {

	public static void solution() {
		double width;
		double length;
		double square;
		
		length = 8;
		
		width = length / 2;
		
		square = length * width;
		
		System.out.println("Площадь прямоугольника равна ="  +  square);
		
		
	}
}
