package Practice;

import java.util.Scanner;

//public class phase6 {
////	static void EvenOdd(int n) {
////		if(n%2==0) {
////			System.out.print("The number is Even");
////		}
////		else {
////			System.out.print("The number is Odd");
////		}
////	}
//	static String eo(int n) {
//		if(n%2==0) {
//			return "Even";
//		}
//		else {
//			return "Odd";
//		}
//	}
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the value of n:");
//		int n = s.nextInt();
//		System.out.println("The number is :" + eo(n));
//		
//		s.close();
//	}
//}


//public class phase6 {
//	static int sum(int n) {
//		int sum=0;
//		for(int i=1;i<=n;i++) {
//			sum=sum+i;
//		}return sum;
//	}
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the value of n:");
//		int n = s.nextInt();
//		System.out.println("The sum of the number is :" + sum(n));
//		s.close();
//	}
//
//}

//public class phase6 {
//	static int max(int a, int b, int c ) {
//		if(a>b & a>c) {
//			return a;
//		}else if(b>c & b>a) {
//			return b;
//		}else {
//			return c;
//		}
//	}
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the value of m:");
//		int m = s.nextInt();
//		System.out.println("Enter the value of n:");
//		int n = s.nextInt();
//		System.out.println("Enter the value of o:");
//		int o = s.nextInt();
//		System.out.println("The greatest between three is:" + max(m,n,o));
//		s.close();
//	}
//}


//public class phase6{
//	static int factorial(int n) {
//		int fact=1;
//		for(int i=1;i<=n;i++) {
//			fact=fact*i;
//		}
//		return fact;	
//	}
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the value of n:");
//		int n = s.nextInt();
//		System.out.println("The factorial is:" + factorial(n));
//		s.close();
//	}
//}

public class phase6{
	
	static int fibo(int n) {
		int a=0,b=1;
		int sum = 0;
		for(int i=1;i<=n;i++) {
		System.out.print(a + " " );
			sum=a+b;
			a=b;
			b=sum;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = s.nextInt();
		int a=0,b=1;
		fibo(n);
		s.close();
	}
}
