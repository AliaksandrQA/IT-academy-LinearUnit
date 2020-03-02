package by.epam.courses.Linear;

//Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации.

public class LinearTask34 {
	
public static void solution() {
		
		long a = 1234567891122336L;
		
		double kBytes = a / Math.pow(2, 10);
        double mBytes = a / Math.pow(2, 20);
        double gBytes = a / Math.pow(2, 30);
        double tBytes = a / Math.pow(2, 40);
        double pBytes = a / Math.pow(2, 50);

        System.out.println(a + " байт");

        System.out.println(kBytes + " Кб");
        System.out.println(mBytes + " Мб");
        System.out.println(gBytes + " Гб");
        System.out.println(tBytes + " Тб");
        System.out.println(pBytes + " Пб");
	}

}
