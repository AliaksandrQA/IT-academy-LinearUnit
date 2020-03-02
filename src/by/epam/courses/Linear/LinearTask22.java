package by.epam.courses.Linear;

/* Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное
значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.*/

public class LinearTask22 {
public static void solution() {
		
		int currentTime;
		int hours;
		int minutes;
		int seconds;
		
		currentTime  = 4080; // секунды

        hours = (currentTime / 3600); // нахожу значение  1-го часа 

        minutes = (currentTime - (hours * 3600))/60; // нахожу значение в минутах
         
        

        seconds = (currentTime - (hours * 3600)) - (minutes * 60); // нахожу значение в секундах

       
        System.out.println("Длительность равна" +" "+ hours + " ч. " + minutes + " мин. " + seconds + " c.");
       
		
	}
}
