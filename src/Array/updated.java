package Array;

import java.util.Scanner;

public class updated {
	public static String EvenOddcheck(int num) {
		if(num%2==0) {
			return "Even";
		
		}else {
			return "Odd";
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = s.nextInt();
		String result = EvenOddcheck(num); 
		System.out.println("The number is :" + result);
		s.close();
	}
}
