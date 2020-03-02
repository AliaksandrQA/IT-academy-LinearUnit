package by.epam.courses.Linear;

// // Составить программу перевода радианной меры угла в градусы, минуты и секунды

public class LinearTask28 {
	
public static void solution() {
		
		double initRad;
		double initDegr;
		
		
		initRad = 0.12;
        initDegr = initRad * 180 / Math.PI;

        int degrees = (int) initDegr;

        double temp = (initDegr - degrees) * 60;
        int minutes = (int) temp;

        double seconds = (temp - minutes) * 60;

       
        System.out.println(degrees + " гр. " + minutes + " мин. " + seconds + " c.");
      
	}
}

