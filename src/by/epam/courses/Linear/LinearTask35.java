package by.epam.courses.Linear;

//Даны натуральные числа М и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N

public class LinearTask35 {
public static void solution() {
		
		double a = 745.145; 
		int x;
		double lowDigit;
		double higherDigit;
		
		x = (int)a; // избавляемся от правой части // 745
		lowDigit  = x%10; // находим остаток от деления // он будет равен 5 !!!
		
		a = a - x; // 745.145 - 745 = 0.145
		higherDigit = a * 10;  // 145
		higherDigit = (int)higherDigit; // приводим к int // 1 !!! отсекая всё лишнее
		
		
		System.out.println("старшая цифра дробной части = "+" "+ higherDigit);
		System.out.println("младшая цифра целой части = "+" "+ lowDigit);
	}

}
