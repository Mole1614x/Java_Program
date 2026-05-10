package Practice;

import java.util.Scanner;

//public class phase5 {
//	// Reverse String
//	static void rev(String str) {
//		for(int i=str.length()-1;i>=0;i--) {
//			System.out.print(str.charAt(i));
//		}
//	}
//	
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the value in String:");
//		String str = s.nextLine();
//		rev(str);
//		s.close();
//		}
//	}

//Palindrome string

//public class phase5{
//	
//	static void pal(String str) {
//		String rev = "";
//		for(int i=str.length()-1;i>=0;i--) {
//			 rev= rev+str.charAt(i);
//		}
//		System.out.println("Reversed:" +rev);
//
//		if (rev.equals(str)){
//			System.out.print("Palindrome");
//		}else {
//			System.out.print("Not Palidrome");
//		}
//		
//	}
//	
//	
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.print("Enter the string:");
//		String str = s.nextLine();
//		pal(str);
//		s.close();
//	}
//}


//Count vowels


//public class phase5{
//	
//	static void count(String ch) {
//		int count=0;
//		for(int i=0;i<ch.length();i++) {
//			char c =ch.charAt(i);
//			
//			  if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
//		               c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
//		                count++;
//		            }
//		        }
//
//		        System.out.println("Number of vowels: " + count );
//		}
//	
//	
//	
//	
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.print("Enter the words to check:");
//		String ch = s.nextLine();
//		count(ch);
//		s.close();
//	}
//}
//


//Remove spaces


//
//public class phase5{
//
//	
//	static void spaces(String str) {
//		System.out.println("The entered string: " + str.trim());
//	}
//	
//	
//	
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the String:");
//		String str = s.nextLine();
//		spaces(str);
//		s.close();
//	}
//}
//


//Anagram check


public class phase5{
	
	static void check(String str1,String str2) {
		int n = str1.length();
		int m = str2.length();
		
		if(n!=m) {
			System.out.println("Not Anagram");
			return;
		}
		
	       // Step 2: convert to char arrays
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
		
		
		
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j < n - i - 1; j++) {

                if(a[j] > a[j + 1]) {
                    char temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }

                if(b[j] > b[j + 1]) {
                    char temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
            }
        }

        // Step 4: compare
        for(int i = 0; i < n; i++) {
            if(a[i] != b[i]) {
                System.out.println("Not Anagram");
                return;
            }
        }

        System.out.println("Anagram");
        
        
        
        
        
        
        
        
        
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String 1:");
		String str1 = s.nextLine().toLowerCase();
		System.out.println("Enter String 2:");
		String str2=s.nextLine().toLowerCase();
		check(str1,str2);
		s.close();
	}
}














