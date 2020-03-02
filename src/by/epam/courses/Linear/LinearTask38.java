package by.epam.courses.Linear;

/*  Для данных областей составить линейную программу, которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае:*/

public class LinearTask38 {
	
public static void solution() {
		
		int x;
		int y;
		
		x = -1;
		y = -3;
		
		////////////////////////// point a
		
		if (y + Math.abs(x) <= 4 && y >= 0) {
			System.out.println("true");
		} 
		else {
			System.out.println("false");
		}
		
		/////////////////////////// point b
		
		if ((y >= 0 && y <= 4 && x >= - 2 && x <= 2) || (y >= - 3 && y <= 0 && x >= -4 && x <= 4)) {
			
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		/////////////////////////// point c
		if (((x * x + y * y <= 16) && y >= 0 && x >= 0) || ((x * x + y * y <= 25) && y <= 0 && x >= 0)){
            System.out.print("true");
        }
        else{
            System.out.print("false");
		
		}
	}
}

