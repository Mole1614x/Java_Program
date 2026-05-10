package Array;

import java.util.Scanner;

public class max {
	public static  int Maximum(int a, int b) {
		
		if (a>b) {
			System.out.println("A is Greater");
			return a;
		}else {
			System.out.println("B is Greater");
			return b;
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of A:");
		int a = s.nextInt();
		System.out.println("Enter the value of B:");
		int b = s.nextInt();
		int sum = Maximum(a,b);
		System.out.println("The max_value is" + sum);
		s.close();
	}
}
