package by.epam.courses.Linear;

/* Дано значение х. Получить значения -2х + 3х2 - 4х3 и 1 + 2х + 3х2 + 4х3. Позаботьтесь об экономии операций.*/

public class LinearTask40 {
	
public static void solution() {
		
		double x;
		double result1;
		double result2;
		double temp1;
		double temp2;
		
		x = 4.2;

        temp1 = 2 * x + 4 * x * x * x;
        temp2 = 3 * x * x;

        result1 = - temp1 + temp2;
        result2 = temp1 + temp2 + 1;
        
        System.out.println("Значение первого уравнения = "+" "+ result1 );
        System.out.println("Значение второго уравнения = "+" "+ result2 );
		
		
	}
}

