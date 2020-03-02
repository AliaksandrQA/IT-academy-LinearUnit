package by.epam.courses.Linear;

//В n малых бидонах 80 л молока. Скоьлко литров молока в m больших бидонах, если в каждом большом бидоне на 12 л больше чем в малом. 

public class LinearTask6 {
	
public static void solution() {
		
		int n;
		int m;
		int littlecan;
		int bigcan;
		int result;
		
		n = 4;
		m = 6;
		
		littlecan = 80/n; // 1 литр в 1 малом бидоне 
		
		bigcan = littlecan + 12; // 1 литр в 1 большом бидоне 
		
		result = bigcan * m; // итоговый результат
		
				
		System.out.println("Количестов литров в больших бидонах =" +" "+ result);
		
	}

}


