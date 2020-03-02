package by.epam.courses.Linear;

//Найти площадь кольца, внутренний радиус которого равен r, а внешний — R (R> r)

public class LinearTask23 {
public static void solution() {
		
		double externalR;
		double internarR;
		double square;
		
		externalR = 3.3;
		internarR = 1.2;
		
		square = Math.PI * (externalR * externalR - internarR * internarR );
		System.out.println("площадь = "+" "+ square);
	}

}


