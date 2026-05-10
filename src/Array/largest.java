package Array;

import java.util.Scanner;

public class largest {
	public static void Large(int a , int b , int c) {
		if(a>b && a>c) {
			System.out.print("Number 1 is Greater");
		}else if(b>a && b>c) {
			System.out.print("Number 2 is Greater");
		}else {
			System.out.print("Number 3 is Greater");
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number 1:");
		int num1 = s.nextInt();
		System.out.print("Enter number 2:");
		int num2 =s.nextInt();
		System.out.print("Enter number 3:");
		int num3 = s.nextInt();
		Large(num1,num2,num3);
		s.close();
	}
}
