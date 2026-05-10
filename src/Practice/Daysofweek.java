package Practice;

import java.util.Scanner;

public class Daysofweek {
	public static String week(String day) {
	
		switch(day) {
		case "1":
			return "Monday";
		case "2":
			return "Tuesday";
		case "3":
			return "Wednesday";
		case "4":
			return "Thursday";
		case "5":
			return "Friday";
		case "6":
			return "Saturday";
		case "7":
			return "Sunday";
		case "8":
			return "Exit";
		default:
			return "Invalid Day";
	}
		
		}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("Enter your Choice(1-7)");
			String day = s.next();
			
			System.out.println("Today is :" + week(day));
			if (day=="8") {
				System.out.println("Exiting..");
				break;
			}
			
		}
		
	}
}
