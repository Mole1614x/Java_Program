package Practice;

import java.lang.reflect.Array;
import java.util.Scanner;


// Sum of array

//public class phase4 {
//	public static void main(String[] args) {
//		int arr[] = new int[5];
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the value in arr[]:");
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = s.nextInt();
//			
//		}
//		int sum =0;
//		for(int i=0;i<arr.length;i++) {
//			sum =sum+arr[i];
//		}
//		System.out.println("The sum of n numbers is: " + sum);
//		s.close();
//	}
//}




//public class phase4{
//	static int ar(int arr[]) {
//		int sum = 0;
//		for(int i=0;i<arr.length;i++) {
//			sum=sum+arr[i];
//		}return sum;
//	}
//	public static void main(String[] args) {
//		int arr[] =new int[5];
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the value in arr[]:");
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=s.nextInt();
//		}
//		System.out.println("The sum of n numbers is:" + ar(arr));
//	}
//  }




// MAX/MIN


//public class phase4{
//	static void maxx(int arr[]) {
//		int max = arr[0];
//		int min =arr[0];
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max) {
//				max = arr[i];
//			}
//			if (min > arr[i]) {
//				min = arr[i];
//			}
//		}
//		System.out.println("Max: " + max);
//		System.out.println("Min: " + min);
//	}
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int arr[] = new int[5];
//		System.out.print("Enter the value in array:");
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=s.nextInt();
//		}
//		maxx(arr);
//		s.close();
//	}
//}



//  Reverse an array

//public class phase4{
//	
//	static void rev(int arr[]) {
//		
//		for(int i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i] + " ");
//		}
//		
//	}
//	
//	
//	
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int arr[] = new int[5];
//		System.out.println("Enter the value in n:");
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = s.nextInt();
//		}
//		rev(arr);
//		s.close();
//	}
//}

//Search Element

//public class phase4 {
//	
//	static void search(int arr[],int key) {
//		boolean found = false;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i] == key) {
//				System.out.println("The Searched value:" + i + " " +arr[i]);
//				found=true;
//				break;
//			}
//		}
//		if(!found) {
//			System.out.println("Element not found");
//		}
//	}
//	
//	
//	
//	
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		System.out.println("Enter the numbers in array:");
//		int arr[] = new int[7];
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = s.nextInt();
//		}
//		System.out.print("Enter element to search: ");
//        int key = s.nextInt();
//        search(arr, key);
//		s.close();
//	}
//}
//











// Second Largest number



//public class phase4{
//	
//	
//	static void second(int arr[]) {
//		Scanner s = new Scanner(System.in);
//		int n=arr.length;
//		for(int i=0;i<n-1;i++) {
//			for(int j=0;j<n-i-1;j++) {
//				if(arr[j]>arr[j+1]) {
//					int temp = arr[j];
//					arr[j]=arr[j+1];
//					arr[j+1]=temp;
//				
//				}
//			}
//			
//		}
//		System.out.println("Second Largest: " + arr[n - 2]);
//	}
//	
//	
//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int arr[] = new int[5];
//		System.out.println("Enter the value for Searching:");
//		for(int i=0;i<arr.length;i++) {
//			arr[i] = s.nextInt();
//		}
//		second(arr);
//		s.close();
//	}
//
//} 



// Remove duplicates

//
//public class phase4{
//	
//	static void remove(int arr[]) {
//		for(int i=0;i<arr.length;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if (arr[i] == arr[j]) {
//					arr[j] = -5;
//					
//				}
//			}
//		}
//		// print unique elements
//        System.out.println("Array after removing duplicates:");
//        for(int i=0;i<arr.length;i++){
//        	if(arr[i]!= -5) {
//        		System.out.print(arr[i] + " ");
//        	}
//        }
//	}
//	
//	public static void main(String[] args) {
//	Scanner s = new Scanner(System.in);
//	System.out.println("Enter the values in array:");
//	int arr[] = new int[5];
//	for(int i=0;i<arr.length;i++) {
//		arr[i]=s.nextInt();
//	}
//	remove(arr);
//	s.close();
//	}
//}
//
//



// Bubble Sort



















