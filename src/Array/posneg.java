package Array;

import java.util.Scanner;

public class posneg {
	public static int pos(int num){
		if(num < 0) {
			System.out.println("Entered Number is Negative");
		}else if(num > 0){
			System.out.println("Enter Number is Positive");
			
		}else {
			System.out.println("Number is Zero");
		}
		return num;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = s.nextInt();
		int result = pos(num);
		s.close();
	}
}
