package by.epam.courses.Linear;

/* Дано значение a. 
 * Не используя никаких функций и никаких операций, кроме умножения, получить значение а
 * 8  * за три операции и а10 за четыре операции. */ 

public class LinearTask27 {
public static void solution() {
		
		int a;
		int b;
		
		a = 3;
		b = 2;
		
		a = a * a * a;
		a = a * a * 3;
		a = a * 3;
		
		System.out.println("a в восьмой степени"+" "+ a);
		
		b = b * b;
		b = b * b;
		b = b * 2;
		b = b * b;
		System.out.println("b в десятой степени"+" "+ b);
	}
}


