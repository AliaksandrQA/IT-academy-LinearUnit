package by.epam.courses.Linear;

//Известна длина окружности. Найти площадь круга, ограниченного этой окружностью

public class LinearTask20 {
public static void solution() {
		
		double l;
		
		double radius;
		double square;
		
		l = 3.7;
		
		radius = l/(2*3.14);
		square = 3.14 * radius * radius;
		
		System.out.println("Площадь круга = "+" "+ square);
		
	}
}



/* r:=l/(2*PI);
   s:=PI*r*r;*/


