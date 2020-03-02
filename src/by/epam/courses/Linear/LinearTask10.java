package by.epam.courses.Linear;

//Вычислить значение выражения по формуле (все переменные принимают действительные значения)

public class LinearTask10 {
public static void solution() {
		
		double x;
		double y;
		double result;
		double temp;
		x = 60;
		y = 90;
		
		temp = Math.sin(x) + Math.cos(y) / Math.cos(x) - Math.sin(y);
		temp = temp * Math.tan(x*y);
		result = Math.toRadians(temp);
		
		System.out.println("Значение ="+" "+ result);
		
		
	}

}
