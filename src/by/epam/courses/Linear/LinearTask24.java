package by.epam.courses.Linear;

// // Найти площадь равнобедренной трапеции с основаниями а и b и углом α при большем основании а.

public class LinearTask24 {
 public static void solution() {
		 
		 double a;
		 double b;
		 double alpha;
		 double square;
		 
		 a=3;
		 b=2;
		 alpha=Math.PI/4;
		 
		 square = (a+b)*(a-b)*Math.tan(alpha)/4;
		 
		 
		 System.out.println("площадь ="+" "+ square);
	 }
}

