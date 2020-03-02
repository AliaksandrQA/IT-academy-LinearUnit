package by.epam.courses.Linear;

/* Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа.*/

public class LinearTask21 {
	
public static void solution() {
		
		double x = 123.456;
		
		double n = (int)x; // избавляемся от дробной части
		double m = n / 1000; // перенос целой части вправо
		double y = (x - n) * 1000; // перенос дробной части влево // (123.456 - 123) * 1000 = 456
		double result = m + y; // конечный итог
		
		
        
		System.out.println("n =" +" "+ n);
		System.out.println("m =" +" "+ m);
		System.out.println("y =" +" "+ y);
		System.out.println(result);
		
	}
}


