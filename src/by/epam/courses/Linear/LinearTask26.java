package by.epam.courses.Linear;

//Найти площадь треугольника, две стороны которого равны а и b, а угол между этими сторонами у

public class LinearTask26 {
	
	public static void solution () {
		double a = 5.5, b = 4.4;
        double g = 0.8;
        double square = a * b * Math.sin(g) / 2.0; 
        System.out.println("площадь треугольника = " + square);
	}
}

