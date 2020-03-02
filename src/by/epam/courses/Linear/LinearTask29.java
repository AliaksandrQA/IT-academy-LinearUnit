package by.epam.courses.Linear;

//Найти (в радианах в градусах) все углы треугольника со сторонами а, b, с

public class LinearTask29 {
	
	public static void solution() {
		double a;
		double b;
		double c;
		double x;
		double y;
		
		a = 3.0;
		b = 4.0;
		c = 3.0;
		
		double cornerA = (Math.sqrt(b)+ Math.sqrt(c) - Math.sqrt(a)) / (2 * b *c);
		x = Math.cos(a);
		
		double cornerB = (Math.sqrt(a) + Math.sqrt(c) - Math.sqrt(b)) / (2 * a * c);
		y = Math.cos(b);
				
		double cornerC = 180 - x - y;
		
		System.out.println("сторона угла a "+" "+ cornerA);
		System.out.println("сторона угла b "+" "+ cornerB);
		System.out.println("сторона угла c "+" "+ cornerC);
	}

}
