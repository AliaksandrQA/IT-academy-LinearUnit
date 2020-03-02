package by.epam.courses.Linear;

//Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объём этого куба

public class LinearTask18 {
public static void solution() {
		
		double a;
		double squareArea;
		double totalSquare;
		double volCube;
		
		a = 4.1;
		
		squareArea = Math.pow(a, 2);
		totalSquare = 6 * squareArea;
		volCube = Math.pow(a, 3);
		
		System.out.println("площадь грани равна = "+ " "+ squareArea);
		System.out.println("площадь полной поверхности = "+ " "+ totalSquare);
		System.out.println("объём куба = "+ " "+ volCube);
	}
}


/* Sгр = a2

   Sполн = 6 * Sгр

   V = a3 */


