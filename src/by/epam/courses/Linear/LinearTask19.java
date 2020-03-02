package by.epam.courses.Linear;

//Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту, радиусы вписанной и описанной окружностей.
public class LinearTask19 {
	
public static void solution() {
		
		
		double a;
		double square;
		double height;
		double inscribedRadius;
		double circumscribedRadius;
		
		a = 3.6;
		
		square = Math.pow(a, 2) * Math.sqrt(3)/4;
		
		height = a * Math.sqrt(3)/2;
		
		inscribedRadius = a * Math.sqrt(3) / 6;
		
		circumscribedRadius = a * Math.sqrt(3) / 3;
		
		System.out.println("Площадь треугольника = " + " "+ square);
		System.out.println("Высота треугольника = " + " "+ height);
		System.out.println("Радиус вписаннной окружности треугольника = " + " "+ inscribedRadius);
		System.out.println("Радиус описанной окружности треугольника = " + " "+ circumscribedRadius);
	}
}


/* square:= a*a*sqrt(3)/4;

height:=a*sqrt(3)/2;

radius1:=a*sqrt(3)/6;

radius2:=a*sqrt(3)/3; */

