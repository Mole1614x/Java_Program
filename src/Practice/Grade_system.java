package Practice;

import java.util.Scanner;

public class Grade_system {

	public static String grade(int marks) {

		switch(marks / 10) {
		case 10:
		case 9:
			return "A";
		case 8:
			return "B";
		case 7:
			return "C";
		case 6:
			return "D";
		default:
			return "F";
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		while(true) {
			System.out.println("Enter your Marks:");
			int marks = s.nextInt();

			System.out.println("Credited Grade: " + grade(marks));
		}
	}
}
