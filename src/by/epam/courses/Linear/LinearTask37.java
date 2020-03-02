package by.epam.courses.Linear;

/*Составить линейную программу, печатающую значение true, если указанное высказывание является истинным, и
false — в противном случае:*/ 

public class LinearTask37 {
	
	public static void solution() {
		
		////////////////// point one ////// Целое число N является четным двузначным числом
		
		
		int x;
		x = 69;
		
		if ( x/100 ==0 && x % 2 ==0) {
			System.out.println("true");
			System.out.print("Целое число " + x + " является четным двузначным числом.");
		}
		else {
			System.out.println("false");
			System.out.println("Целое число " + x + " не является четным двузначным числом.");
		}
		
		//////////////////point two ////// Сумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр.
		
		
		int y;
		int firstTwo;
		int lastTwo;
		
		y = 1032; 
		firstTwo = (y /1000) + (y /100) %10;
		lastTwo = (y %100) / 10 + ( y % 10);
		
		if ( firstTwo==lastTwo) {
			System.out.println("true");
			System.out.println("Сумма двух первых цифр равна сумме двух последних");
		}
		else {
			System.out.println("false");
			System.out.println("Сумма двух первых цифр не равна сумме двух последних");
		}
		

		//////////////////point three  ////// Сумма цифр данного трехзначного числа N является четным числом
		
		int z;
		int commonValue;
		int singleSum;
		
			
		z = 123;
		
		singleSum = 0;
		commonValue = z;
		
		for (int i = 0; i < 3; i ++) {
			
			singleSum = singleSum +(commonValue %10);
			commonValue = commonValue /10;
			
			
		}
			if (singleSum % 2 == 0 ) {
				System.out.println("true");
				System.out.println("Сумма цифр трехзначного числа " + singleSum + " является четным числом.");
			}
			else {
				System.out.println("false");
				System.out.println("Сумма цифр трехзначного числа " + singleSum + " не является четным числом.");
			}
		
		
			//////////////////point four  ////// Точка с координатами (х, у) принадлежит части плоскости, лежащей между прямыми х= т, х= п (т<п)
		
		
			int x1;
	        int y2;
	        int m;
	        int n;
		
	        x1 = 1;
	        y2 = 1;
	        m = 2;
	        n = 3;
	        
	        if (x1 >= m && x1 <= n) {
	            System.out.print("true");
	            System.out.println("Точка с координатами принадлежит части плоскости");
	            
	        }
	        else{
	            System.out.println("false");
	            System.out.print("Точка с координатами не принадлежит части плоскости");

	        }
		
	        //////////////////point five  ////// Квадрат заданного трехзначного числа равен кубу суммы цифр этого числа.
	        
	        double square;
	        double singleVal;
	        double commonVal;
	        
	        square = 444;
	        singleVal = 0;
	        commonVal = square;
	        
	        for ( int i = 0; i < 3; i++) {
	        	
	        	singleVal = singleVal + (commonVal%10);
	        	commonVal = commonVal/10;
	        }
	        if ( Math.pow(square, 2)==Math.pow(singleVal, 3)) {
	        	System.out.print("true");
	            System.out.println("Квадрат трехзначного числа " + square + " равен кубу суммы цифр этого числа");

	        }
	        else {
	            System.out.println("false");
	            System.out.println("Квадрат трехзначного числа " + square + " не равен кубу суммы цифр этого числа");


	        }
		
	        //////////////////point six  ////// Треугольник со сторонами а,b,с является равнобедренным.

	        double a;
	        double b;
	        double c;
	        
	        a = 2.0;
	        b = 3.0;
	        c = 3.0;
	        
	        if ((a == b && a!= c) || (a ==c && a !=b) || (b == c && b != a)) {
	        	System.out.print("true");
	        	System.out.println("Треугольник со сторонами " + a + ", " + b + ", " + c + " является равнобедренным");
	        }
	        else {
	        	System.out.println("false");
	        	System.out.println("Треугольник со сторонами " + a + ", " + b + ", " + c + " не является равнобедренным");
	        }
	        
	        //////////////////point seven  ////// Сумма каких-либо двух цифр заданного трехзначного натурального числа N равна третьей цифре
	        
	        int x7; 
	        int digit1;
	        int digit2;
	        int digit3;
	        int temp;
	                               
	        x7 = 654;
	        
	        temp = x7;
	        
	        digit1 = temp % 10;
	        temp = temp / 10;
	        digit2 = temp % 10;
	        temp =temp /10;
	        digit3 = temp % 10;
	        
	        if (digit1 + digit2 == digit3 || digit1 + digit3 == digit2 ||  digit3 + digit2 == digit1) {
	            System.out.print("true");
	            System.out.println("Сумма двух цифр заданного трехзначного натурального числа N равна третьей цифре");
	       
	        }
	        else {
	            System.out.print("false");
	            System.out.println("Сумма двух цифр заданного трехзначного натурального числа N не равна третьей цифре");


	        }
	        
	        //////////////////point eight  ////// Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4

	         int x8 = 16;
	         int st = 2;
	         
	         if ((x8 == 1) || (x8== st) || (x8 == st * st) || (x8 == Math.pow(x8, 3)) || ((x8 == Math.pow(st, 4)))) {
	             System.out.print("true: ");
	             System.out.println("Число " + x8 + " является степенью числа " + st );
	         }
	         else{
	             System.out.print("false: ");
	         }
	         
	         //////////////////point nine  ////// Заданное число N является степенью числа а (показатель степени может находиться в диапазоне от 0 до 4

	         double a9; 
	         double b9; 
	         double c9; 
	         double x9;
	         double y9; 
	         
	         a9 = 1.0;
	         b9 = 2.0;
	         c9 = -3.0;
	         x9 = 2.0;
	         y9 = 0.0;
	         
	         if (y9 == a9 * x9 * x9 + b9 * x9 + c9) {
	             System.out.print("true:");
	             System.out.println("График функции проходит через заданную точку");
	         }
	         else{
	             System.out.println("false");
	             System.out.print("График функции не проходит через заданную точку");
	         }
	}
}
