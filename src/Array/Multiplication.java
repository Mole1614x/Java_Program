package Array;

import java.util.Scanner;

public class Multiplication {
	public static void Table(int num) {
		for(int i=1;i<=10;i++) {
			int total = num*i;
			System.out.println(num + "X" + i + "=" + total);
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = s.nextInt();
		Table(num);
		s.close();
	}
}
