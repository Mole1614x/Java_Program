package Array;

import java.util.Scanner;

public class salary {
	public static void Salary_Check(double sal) {
		if (sal<20000) {
			System.out.println("Your Bonus Salary is " + (sal+(sal*0.10)));
		}else if(sal>20000 && sal<=50000){
			System.out.println("Your Bonus Salary is " + (sal+(sal*0.15)));
		}else if(sal>50000) {
			System.out.println("Your Bonus Salary is " + (sal+(sal*0.20)));
		}else {
			System.out.println("Fuck Off!");
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Salary:");
		double sal = s.nextDouble();
		Salary_Check(sal);
		s.close();
	}
}
