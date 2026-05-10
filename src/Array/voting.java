package Array;

import java.util.Scanner;

public class voting {
	public static int Voting(int age) {
		
		if(age>=18) {
			System.out.println("You are Eligible for Voting!");
			return age;
		}else {
			System.out.println("You are not Eligible for Voting!");
		}
		return age;
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Age:");
		int age = s.nextInt();
		int Age = Voting(age);
		System.out.println("Your age is:" +Age);
		s.close();
	}
}
