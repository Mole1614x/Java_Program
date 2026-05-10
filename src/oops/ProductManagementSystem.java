package oops;

import java.util.Scanner;

import Array.SI;

class product{
	int Pid;
	String Pname;
	double Price;
	int qty;
	public product(int pid, String pname, double price, int qty) {
//		super();
		Pid = pid;
		Pname = pname;
		Price = price;
		this.qty = qty;
		
	}
	
	double calculatetotalprice() {
		double totalprice = Price*qty;
		return totalprice;
	}
	
	
	void display() {
		System.out.println("1.Product ID:" + Pid);
		System.out.println("2.Product Name:" + Pname);
		System.out.println("3.Price:" + Price);
		System.out.println("4.Quantity:" + qty);
		System.out.println("5.Total Price:" + calculatetotalprice());
	}
	
}


public class ProductManagementSystem {
	private static double price;

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of products:");
		int detail = s.nextInt();
		
		
		System.out.println("Enter number of products");
		int n =  s.nextInt();
		
		product[] p= new product[n];
		
		for(int i=0;i<n;i++) {
		
		System.out.println("Enter the product_id: " );
		int Pid = s.nextInt();	
		
		s.nextLine();
		
		System.out.println("Enter the Product_name:");
		String Pname = s.nextLine();
		
		System.out.println("Enter the Price:");
		double Price = s.nextDouble();
		
		System.out.println("Enter the Quantity:");
		int qty = s.nextInt();
		
		
		System.out.println("Enter the Product_name:");
		double Total_Price = calculatetotalprice();
		
		
		p[i] = new product(Pid, Pname, price, qty); 

		
		}
			
			
	        System.out.println("\n--- Employee Details ---");
	        for (int i = 0; i < n; i++) {
	            p[i].display();
	        }
		
	        s.close();

	}

	private static double calculatetotalprice() {
		// TODO Auto-generated method stub
		return 0;
	}
}
