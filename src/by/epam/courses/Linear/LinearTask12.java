package by.epam.courses.Linear;

//Вычислить расстояние между двумя точками с данными координатами (x1,y1) и (x2,y2)

public class LinearTask12 {
	public static void solution() {
		  double x1;
		  double y1;
		  double x2;
		  double y2;
		 // double distance;
		  double temp;
		  
		  
		  x1 = 3.4;
		  x2 = 8.5;
		  y1 = 4;
		  y2 = 0.7;
		
		
		//distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
		  
		 temp = Math.pow((x2 - x1),2);
		 temp = temp + Math.pow((y2 - y1),2);
		 temp = Math.sqrt(temp);
		  
		
		System.out.println("Расстояние между двумя точками равно = "+" "+temp);
		
	}

}
