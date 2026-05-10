package nsnathanpractice;

import java.util.Scanner;

/*public class assignment1 {
			public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the lenghth:");
			double length = s.nextDouble();
			System.out.println("Enter the Width");
			double width = s.nextDouble();
			System.out.println("The Area of Rectangle is:" + (length*width));
			s.close();
			}
}*/

/*public class assignment1{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Temperature in Celsius:");
		double celsius = s.nextDouble();
		double F = (((celsius)*9/5)+32);
		System.out.println("The Temperature in Fahrenheit is:" + F );
		s.close();
		
	}
}*/


/*public class assignment1{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Marks in Physics:");
		int P = s.nextInt();
		System.out.println("Enter the Marks in Chemistry:");
		int c = s.nextInt();
		System.out.println("Enter the Marks in Maths:");
		int m = s.nextInt();
		s.close();
		System.out.println("The Average of Marks is:" + ((P+c+m)/3));
	}
	
}*/

/*public class assignment1{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number a:");
		int a = s.nextInt();
		System.out.println("Enter number b");
		int b = s.nextInt();
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("The Swapped Numbers are:" + " a: " + a + " b: " + b);
		s.close();
	}
}*/

/*public class assignment1{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Price:");
		double p = s.nextDouble();
		System.out.println("Enter the Discount:");
		double d = s.nextDouble();
		//double di = s.nextDouble();
		double di = (p*(d/100));
		System.out.println("The Discounted price is:" + (p - di));
		s.close();
	}
}*/

/*public class assignment1{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Name:");
		String name = s.next();
		System.out.println("Enter the Marks:");
		int marks = s.nextInt();
		if (marks>=40) {
			System.out.println("You Pass!");
		}else {
			System.out.println("You fail!");
		}
		s.close();
	}
}*/

/*public class assignment1{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = s.nextInt();
		if(n%2==0) {
			System.out.println("Number is Even");
		}else {
			System.out.println("Number is Odd");
		}
		s.close();
	}
}
*/


/*public class assignment1{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = 10;
		int b = 12;
		if (a>b) {
			System.out.println("A is Greater");
		}else {
			System.out.println("B is Greater");
		}
		s.close();
	}
}
*/

/*public class assignment1{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Principle:");
		double p = s.nextDouble();
		System.out.println("Enter the Rate:");
		double r = s.nextDouble();
		System.out.println("Enter the Time:");
		double t = s.nextDouble();
		
		double SI = ((p*r*t)/100);
		System.out.println("The Simple interest is:" + SI);
		
		if (SI>=5000) {
			System.out.println("The Simple Interest is High");
		} else {
			System.out.println("The Simple Interest is Low");
		}
		
		s.close();
	}
}
*/


/*public class assignment1{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Age:");
		int age = s.nextInt();
		if(age<12) {
			System.out.println("Child");
		}else if(age ==19) {
			System.out.println("Teen");
			
		}else {
			System.out.println("Adult");
		}
	}
}
*/


/*public class assignment1{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Salary:");
		double sal = s.nextDouble();
		System.out.println("Enter Bonus:");
		double bon = s.nextDouble();
		double ne = (sal+bon);
		
		
		if(sal>5000) {
			System.out.println("You got hike:" + ne);
		}else  {
			System.out.println("Credited Salary" + sal);
		}
		s.close();
	}
}

*/

/*
public class assignment1{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the charachter:");
		char ch = s.next().charAt(0);
		
		if(ch >= 'A' && ch <='Z') {
			System.out.println("You Entered the Uppercase");
		}else {
			System.out.println("You Entered a Lowercase");
		}
		s.close();
	}
}
*/
/*
public class assignment1{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = s.nextInt();
		if(num < 0) {
			System.out.println("You Entered a negative Number:");
		}else if(num > 0) {
			System.out.println("You Entered a Positive Number:");
		}else {
			System.out.println("You Entered a zero:");
		}
		s.close();
	}
}
*/

/*
public class assignment1{
	public static void main(String[] args) {
		int age = 18;
		if(age<=18) {
			System.out.println("Eligible For Voting.");
		}else  {
			System.out.println("Not Eligible for Voting");
		}
	}
}
*/


/*public class assignment1{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the unit:");
		double unit = s.nextDouble();
		if (unit<=100) {
			System.out.println("The Bill is:" + (100*1));
		}else if(unit<=200){
			System.out.println("The Bill is:" + (100+(unit-100)*2));
		}else if(unit<=300) {
			System.out.println("The Bill is:" + (100+200+(unit-200)*3));
		}else {
			System.out.println("The Bill is:" + (100+200+300+(unit-300)*4));
		}
		s.close();
	}
}
*/

/*public class assignment1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = s.nextInt();
        int num=2;
        for(int i=0;i<=n;i++){
            System.out.println(num + "X" + i + "=" + (num*i));
        }
    }
}
*/


/*public class assignment1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.println("Enter the value of n:");
//        int n = s.nextInt();
        int num=2;
        int i = 0;
        while(i<=10){
            System.out.println(num + "X" + i + "=" + (num*i));
            i++;
        }
    }
}*/

/*public class assignment1{
	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for(int j=1;j<=5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}*/

/*public class assignment1{
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 || j==1 || i == 4 || j == 5 ) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}System.out.println();
		}
	}
}
*/



/*public class assignment1{
	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n;i++) {
			//inner loop space printing
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			// inner Loop space print
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
*/

//public class assignment1{
//	public static void main(String[] args) {
//		int n=4;
//		int m=5;
//		for(int i=1;i<=n;i++) {
//			//inner loop space printing
//			for(int j=1;j<=m;j++) {
//				if(i==1 || j==1 || i==n || j==m) {
//					
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			// inner Loop space print
////			for(int k=1; k<=i; k++) {
////				System.out.print("*");
////			}
//			System.out.println();
//		}
//	}
//}

public class assignment1{
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		int n=5;
		for (int i=n; i>=1;i--) {
			for (int j=1; j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	  
	        int num =5;
	        for(int i=1; i<=num;i++){
	            for(int j=1;j<=num-i;j++){
	                System.out.print(" ");
	            }
	            for (int k=1;k<=i;k++){
	            	System.out.print("*" + " ");
	            }
	            System.out.println();
	        }
	        int nu =5;
	        for(int i=nu; i>=1;i--){
	            for(int j=1;j<=nu-i;j++){
	                System.out.print(" ");
	            }
	            for (int k=1;k<=i;k++){
	            	System.out.print("*" + " ");
	            }
	            System.out.println();
	        }
	    }
	}
	

