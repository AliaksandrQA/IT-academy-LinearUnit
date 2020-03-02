package by.epam.courses.Linear;

/* Вычислить корни квадратного уравнения ах2+ bх + с = 0 с заданными коэффициентами a, b и с (предполагается,
что а≠0 и что дискриминант уравнения неотрицателен).*/

public class LinearTask25 {
	
public static void solution() {
		
		double a;
		double b;
		double c;
		double disc;
		
		a = -2;
		b = 3;
		c = - 4;
		
		disc = Math.pow(b, 2) - (4* a *c);
		
		if (disc > 0) {
			double square1 =  (-b + Math.sqrt(disc)) / (2 * a);
			double square2 =  (-b - Math.sqrt(disc)) / (2 * a);
			System.out.println("Square1 ="+" "+ square1);
			System.out.println("Square2 ="+" "+ square2);
			
			
		} else if (disc ==0) {
			double square2 =  (-b - Math.sqrt(disc)) / (2 * a);
			System.out.println("Square2 ="+" "+ square2);
		}
		else {
		
		System.out.println("Корней нет");}
		
		
		
	}
}	


