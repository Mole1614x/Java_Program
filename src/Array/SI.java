package Array;

import java.util.Scanner;

public class SI {
	public static double SI(double p,int r,int t) {
		
		double interest = ((p*r*t)/100);
		return interest;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Principle:");
		double principle = s.nextDouble();
		System.out.println("Enter RATE:");
		int rate = s.nextInt();
		System.out.println("Enter Time:");
		int time = s.nextInt();
		double Simple_Interest = SI(principle,rate,time);
		System.out.println("The Simple Interest is:" + Simple_Interest);
		s.close();
	}
}
