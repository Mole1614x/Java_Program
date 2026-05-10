package Practice;

import java.util.Scanner;

public class phase1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Message" );
		String ch =s.nextLine();
		System.out.println("Hello World");
		
		System.out.println("Enter the number1:");
		int num1 = s.nextInt();
		System.out.println("Enter thr number 2:");
		int num2 = s.nextInt();
		int add = num1+num2;
		System.out.println("The Adddition of Two number is:" + add);
		
		if(num1%2==0) {
			System.out.println("The number is Even");
		}else {
			System.out.println("The number is odd");
		}
		if(num2<0) {
			System.out.println("positive");
		}else {
			System.out.println("Negative");
		}
		System.out.println("Enter Year:");
		int year = s.nextInt();
		
		if ((year%4 == 0 && year != 0) || (year % 400 == 0) ) {
			System.out.println("The entered year is leap ");
		}else {
			System.out.println("no leap");
		}
		s.close();
	}
}
