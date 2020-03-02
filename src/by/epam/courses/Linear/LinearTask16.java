package by.epam.courses.Linear;

//Найти произведение цифр заданного четырехзначного числа 

public class LinearTask16 {
	
public static void solution() {
		
		int number;
		int multi;
		
		number = 7459;
		multi = 1;
		
		for ( int i = 0; i < 4; i++) {
			
		multi = multi * (number % 10);
		number = number / 10;
			
		System.out.println("Произведение четырехзначного числа ="+" "+ multi);
			
			
		}
		
		
		
		/*number = 745;
		multi = 1;
		
		currentNumber = number % 10; // 745 / 10 = 5;
		
		multi = multi * currentNumber; // 1 * 5 = 5
		
		number = number / 10; // 745 / 10 = 74;
		
		currentNumber = number % 10; // 74 %10 = 4;
		
		multi = multi * currentNumber; // 5 * 4 // 20;
		
		number = number / 10; // 74 / 10 = 7
		
		multi = multi * number; // 20 * 7; 
		
		System.out.println(multi);*/
		
	}
}


