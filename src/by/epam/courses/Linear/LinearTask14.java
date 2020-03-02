package by.epam.courses.Linear;

// Вычислить длину окружности и площадь круга одного и того же заданного радиуса R

public class LinearTask14 {
public static void solution() {
		
		int radius; 
		double square;
		double length;
		
		radius = 3;
		square = Math.PI * (radius * radius);
		length = Math.PI * 2 * radius;
		
		System.out.println("Square ="+" "+ square);
		System.out.println("Lenghth ="+" "+ length);
}

}
