package by.epam.courses.Linear;

/* Текущее показание электронных часов: т ч (0 ≤ т ≤23) п мин (0 ≤ п ≤59) к с (0 ≤к ≤59). Какое время будут показывать
часы через р ч q мин r с?*/

public class LinearTask32 {

public static void solution() {
		
		
		int m; // час
		int n; // минута
		int k; // секунда
		int p; // час
		int q; // минута
		int c; // секунда
		
		m = 1;//текущее значение
		n = 56;//текущее значение
		k = 10;//текущее значение
		
		p = 6;//новое значение
		q = 4;//новое значение
		c = 01;//новое значение
		
		System.out.println("Текущее время " + m + " ч. " + n + " мин. " + k + " сек.");
		System.out.println("Прибавим " + p + " ч. " + q + " мин. " + c + " сек.");
		
		
		if(p <= 24 && p >=0 ) {
			
			p = p % 24;
			
			m = m + p;

		}
		else {
			m = m + p;
		}
		if(m >= 24) {
	
				m = m % 24;
					
		}
		
		n = q + n;
		
		if(n >= 60) {
			
			m = m + (n / 60);
			n = n % 60;
			
		}
		
		k = c + k;
		
		if( k >= 60) {
			
			n = n + (k / 60);
			k = k % 60;
		}
		
		System.out.println("На часах " + m + " ч. " + n + " мин. " + k + " сек.");
		
		System.out.println();
	}
}

