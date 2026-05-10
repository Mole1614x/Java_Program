package Array;

import java.util.Scanner;

public class Sum {
	public static int sumnum(int num) {
		int sum = 0;
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = s.nextInt();
		int summ = sumnum(num);
		System.out.println("The Required Sum is:" + summ);
		s.close();
	}
}
