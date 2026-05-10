package oops;

import java.util.ArrayList;
import java.util.Scanner;

class car{
	int carid;
	String model;
	double rentperday;
	ArrayList<car> al = new ArrayList<car>();
	public car(int carid, String model, double rentperday) {
		//super();
		this.carid = carid;
		this.model = model;
		this.rentperday = rentperday;
	}
	car()
	{
		
	}
	
	// add car
	
	void addcar(Scanner s) {
		
		System.out.println("Enter no of cars ");
		int n=s.nextInt();
		for(int i=0;i<n;i++) {
		System.out.println("Enter car id");
		int id = s.nextInt();
		s.nextLine();
		System.out.println("Enter model name");
		String m = s.nextLine();
		System.out.println("Enter rent days");
		double d = s.nextDouble();
		
		al.add(new car(id, m, d));
	}
	}
	
	
	// display car
	
	
	void displaycar(){
		for(car c:al)
		{
		System.out.println("The CAR ID is :" + c.carid);
		System.out.println("The Model is :" + c.model);
		System.out.println("The  Rent Per Day is :" + c.rentperday);
		
		
	}
	}
	
	
	void rent(double days) {
		double totalrent=0;
		for(car c:al)
		{
		 totalrent = days*c.rentperday;
		System.out.println("The total rent is:" + totalrent);
		}
		
		
	
	}
	
	
	
}







public class carrentalsystem {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		car c = new car();
		while(true) {
		System.out.println("MENU");
		System.out.println("1. Add Car");
		System.out.println("2. Display Car");
		System.out.println("3. Calculate Rent");
		System.out.println("4. Exit");
		
		int choice = s.nextInt();
		
		switch(choice) {
			case 1:{
				
				System.out.println("You Entered 1. Add Car");
				c.addcar(s);
				break;
				
			}
			case 2:{
				System.out.println("You Entered 2. Display car");
				c.displaycar();
				break;
			}
			case 3:{
				System.out.println("You Entered 3. Calculate Rent");
				System.out.println("Enter number of days:" );
				double day = s.nextDouble();
				c.rent(day);
				
				break;
			}
			case 4:{
				System.out.println("You Entered 4. Exit");
				System.out.println("Good Bye!");
				System.exit(0);
				
			}
		}
	}
}





}