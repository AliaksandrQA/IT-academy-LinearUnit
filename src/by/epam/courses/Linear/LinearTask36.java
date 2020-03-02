package by.epam.courses.Linear;

//Найти частное произведений четных и нечетных цифр четырехзначного числа

public class LinearTask36 {
	
public static void solution() {
		
		int number;		
		int a,b,c,d;
		int even = 1;		
		int odd = 1;
		double div;
		
		number = 8946;

			a = number%10; // находим крайнее число // 4 
			
			if (a%2 == 0 ) {
				even = even * a;
			} 
			else {
				odd = odd * a;
			}
			
			number = number/10; // 123
			
			b = number%10; // находим крайнее число // 3
			
			if (b%2 == 0 ) {
				even = even * b;
			} 
			else {
				odd = odd * b;
			}
			
			number = number/10; // 12
			
			c = number%10; // находим крайнее число // 2
			
			if (c%2 == 0 ) {
				even = even * c;
			} 
			else {
				odd = odd * c;
			}
			
			number = number/10; // 1
			
			d = number%10;

			if (d%2 == 0 ) {
				even = even * d;
			} 
			else {
				odd = odd * d;
			}
			
			System.out.println("Произведение четных цифр ="+" "+ even);		
			System.out.println("Произведение нечетных цифр ="+" "+ odd);		
		
				
			
			
			
			
			div = even/odd;
			
			System.out.println("Частное произведений четных и нечетных цифр четырехзначного числа = "+" "+ div);
		}
}

