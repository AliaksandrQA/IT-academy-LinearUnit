package by.epam.courses.Linear;

//// Заданы координаты трёх вершин треугольника. Найдите его периметр и площадь

public class LinearTask13 {
	public static void solution() {
		
		 double x1 = 6.0;
		 double y1 = 4.0;
		 
		 double x2 = 8.0;
	     double y2 = 9.0;
	     
	     double x3 = 14.0;
	     double	y3 = 8.0;
	     
	     
		double side_a = (Math.sqrt(Math.pow(x2 - x1, 2)) + Math.pow(y2 - y1, 2));
		double side_b = (Math.sqrt(Math.pow(x3 - x2, 2)) + Math.pow(y3 - y2, 2));
		double side_c = (Math.sqrt(Math.pow(x3 - x1, 2)) + Math.pow(y3 - y1, 2));
		
		
		double perimetr = (side_a + side_b + side_c);
		
		double half_perimetr = perimetr / 2;
		
		double square = Math.sqrt(half_perimetr *(half_perimetr - side_a) * (half_perimetr - side_b) * (half_perimetr - side_c));
		
		System.out.println("Периметр треугольника равен =" + " "+ perimetr );
		System.out.println("Площадь треугольника равна =" + " "+square);
		
		
	}

}
