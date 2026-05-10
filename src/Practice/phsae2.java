package Practice;

import java.util.Scanner;

public class phsae2 {
	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the value of n:");
//		int n = s.nextInt();
//		
		
		//Print 1 to N numbers
		
//		for(int i=1;i<=n;i++) {
//			System.out.println(i);
//		}
//		
		
		//Sum of n numbers
		
//		int sum = 0;
//		for(int i=0;i<=n;i++) {
//			
//			sum= sum+i;
//		
//		}
//		System.out.println("Final_sum: " + sum);
		
		//Multiplication Table 
		
//		for(int i=1;i<=10;i++) {
//			System.out.println(n + "X" + i + "=" +(n*i));
//		}
//		int i=1;
//		while(i<=10) {
//			System.out.println(n + "X" + i + "=" +(n*i));
//			i++;
//	
		
		//Factorial
//		int fact=1;
//		for(int i=1;i<=n;i++) {
//			fact = (fact*i);
//			
//		}
//		System.out.println("The factorial on number is:" + fact);
		
		// Count numbers
//		int count = 0;
//
//		while(n != 0) {
//		    n = n / 10;   // remove last digit
//		    count++;      // increase count
//		}
//
//		System.out.println("The number count is: " + count);
		
		//Reverse number
        
//		int rev = 0;
//		while(n!=0) {
//			int rem = n%10;
//			rev = rev*10+rem;
//			n=n/10;
//			
//		}
//
//		System.out.println("Reversed number: " + rev);
		
//		Armstrong Number
		
//		int temp =n;
//		int sum = 0,rem=0;
//		while(n!=0) {
//			rem = n%10;
//			n = n/10;
//			sum = sum +rem*rem*rem;
//		}
//		if(temp == sum) {
//			System.out.print("Number" + " " + temp + " " + "is" + "Armstrong");
//		}else {
//			System.out.print("The number is not armstrong");
//		}
		
//		Strong Number
		
//		int temp =n;
//		int sum=0;
//		while(n!=0) {
//			int rem = n%10;
//			
//				int fact =1;
//				for(int i=1;i<=rem;i++) {
//					fact = fact*(i);
//				}
//			sum = sum+ fact;
//			n = n/10;
//		}
//			if(temp == sum) {
//				System.out.println("Strong Number");
//			}else {
//				System.out.println("Not a strong Number:");
//			}
//		
		
//	Prime Number
		
//		int count =0;
//		for(int i=1;i<=n;i++) {
//			if(n%i==0) {
//				count++;
//			}
//		}
//		if(count == 2) {
//			System.out.println("Prime");
//		}else {
//			System.out.println("Not Prime");
//		}
		
// Fibonacci
		
		
//	 int a =0,b=1;
//	 int sum=0;
//	 for(int i=0;i<n;i++) {
//		 System.out.print(a + " ");
//		 sum = a+b;
//		 a=b;
//		 b=sum;
//	 }
//	 System.out.print(a + "" + b + "" +  sum);
	 
	
//	Sum of array
		
		int a[] = {1,2,3};
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum = sum+a[i];
		}
		System.out.println("Final_Sum:" + sum);
		
		
		
//		s.close();
	}
}


//Palindrome

//package Practice;
//
//import java.util.Scanner;
//
//public class Palindrome {
//
//    static void checkPalindrome(String str) {
//        String rev = "";
//
//        for(int i = str.length() - 1; i >= 0; i--) {
//            rev = rev + str.charAt(i);
//        }
//
//        if(str.equals(rev)) {
//            System.out.println("Palindrome");
//        } else {
//            System.out.println("Not Palindrome");
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//
//        System.out.println("Enter a string:");
//        String str = s.nextLine();
//
//        checkPalindrome(str);
//
//        s.close();
//    }
//}