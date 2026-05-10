package Practice;

import java.util.Scanner;

public class switchcase {
	public static void casee(int choice) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of a");
		int a = s.nextInt();
		System.out.println("Enter the value of b");
		int b = s.nextInt();
		
		switch(choice) {
		case 1: {int add=(a+b);
				System.out.println("The Addition of two number is:" + add);
			break;}
		case 2:
				{int sub=(a-b);
				System.out.println("The Addition of two number is:" + sub);
				break;}
		case 3:
				{int mul=(a*b);
				System.out.println("The Addition of two number is:" +mul);
				break;}
		case 4:
				{int div=(a/b);
				System.out.println("The division of two number is:" +div);
				break;}
		case 5: 
				{System.out.println("Exit");
				System.exit(0);}
		default:
				System.out.println("Invalid Choice!");
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int choice;

		while(true) {
			System.out.println("\nEnter Your Choice(1-5)");
			System.out.println("1.Add  2.Sub  3.Mul  4.Div  5.Exit");
			
			choice = s.nextInt();

			if(choice == 5) {
				System.out.println("Exiting...");
				break;
			}

			casee(choice);
		}

		s.close();
	}
}
