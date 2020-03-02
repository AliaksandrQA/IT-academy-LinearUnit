package by.epam.courses.Linear;

//Три сопротивления R1 R2, и R3 соединены параллельно. Найдите сопротивление соединения

public class LinearTask30 {
	
public static void solution() {
		
		double r1;
		double r2;
		double r3;
		double resistance;
		
		r1 = 0.2;
		r2 = 0.7;
		r3 = 0.3;
		
		
		resistance = 1 / (1 / r1 + 1 / r2 + 1 / r3);
		
		System.out.println("Сопротивление = " + resistance);
	}

}
