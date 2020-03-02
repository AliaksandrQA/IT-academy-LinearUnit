package by.epam.courses.Linear;

/* Составить программу для вычисления пути, пройденного лодкой, если ее скорость в стоячей воде v км/ч, скорость
течения реки v1 км/ч, время движения по озеру t1 ч, а против течения реки — t2 ч.*/

public class LinearTask31 {
	
	public static void solution() {
		
	    double v; // скорость в стоячей воде
        double v1; // скорость  течения реки v1
        double t1; // время движения по озеру t1
        double t2; // время движения против течения реки
        
        double pathway;
        
	
        v = 18.0;
        v1 = 3.0;
        t1 = 3.5;
        t2 = 2.2;
        
        pathway =  t1 * v + t2 * (v - v1);
        
        System.out.println("Путь = " + pathway);
        
        
        
        
}

}
