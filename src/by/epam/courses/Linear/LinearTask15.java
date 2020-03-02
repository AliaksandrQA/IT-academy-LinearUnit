package by.epam.courses.Linear;

// // Написать программу, которая выводит на экран первые четыре степени числа п

public class LinearTask15 {
	public static void solution() {
		 
		 double res = 1f; 
		 
		 
		 for (int i = 1; i < 5; i++)
		 {
		    res = Math.pow(Math.PI, i);
		 
		 System.out.println(" число п в степени " + i + " = "+ res );
				
	}

}
}
