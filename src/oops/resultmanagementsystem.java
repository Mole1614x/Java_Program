package oops;
import java.util.*;
import java.util.Scanner;

class Student{
	int id;
	String name;
	double marks;
	ArrayList<Student> al = new ArrayList<Student>();
	public Student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	// Add student
	
	void addstudent(Scanner s) {
		System.out.println("Enter the number of students:");
		int st = s.nextInt();
		
		s.nextLine();
		
		for(int i=0;i<st;i++) {
			System.out.println("Enter Student ID:");
			int id = s.nextInt();
			
			s.nextLine();
			
			System.out.println("Enter Name:");
			String name = s.nextLine();
			
			System.out.println("Enter Marks:");
			double marks = s.nextDouble();
			
			s.nextLine();
			
			al.add(new Student(id,name,marks));
			
		}
		
	}
	
	// Display
	
	void Display() {
		for(Student ele:al) {
			System.out.println("Student Id:" + ele.id );
			System.out.println("Name of Student:" + ele.name);
			System.out.println("Marks:" + ele.marks);
		}
		
		
		
	}
	
	// Result
	
	   void calculateResult() {
	        for (Student ele : al) {  // ✅ loop through list
	            System.out.print("Student: " + ele.name + " → ");
	            if (ele.marks >= 40) {
	                System.out.println("Pass");
	            } else {
	                System.out.println("Fail");
	            }
	        }
	    }

	//find Topper
	
	   void Topper() {
	        if (al.isEmpty()) { // ✅ FIXED
	            System.out.println("No students available!");
	            return;
	        }

	        Student top = al.get(0);

	        for (Student ele : al) {
	            if (ele.marks > top.marks) {
	                top = ele;
	            }
	        }	
}



public class resultmanagementsystem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Student stu = new Student();
		
		while(true) {
	
		System.out.println("Student Portal");
		System.out.println("1. Add Student");
		System.out.println("2. Display Students");
		System.out.println("3. Show Result (Pass/Fail)");
		System.out.println("4. Find Topper");
		System.out.println("5. Exit");
		
		System.out.println("Enter your choice(1-5):");
		int choice = s.nextInt();
		
		s.nextLine();
		
		
		switch(choice) {
			case 1 :{
				System.out.println("You Pressed 1. Add Students");
				stu.addstudent(s);
				break;
			}
			case 2:{
				System.out.println("You Pressed 2. Display Students");
				stu.Display();
				break;
			}
			case 3:{
				System.out.println("You Pressed 3. Show Result");
				stu.calculateResult();
				break;
				}
			case 4:{
				System.out.println("You Pressed 4. Find Topper");
				stu.Topper();
				break;
			}
			case 5:{
				System.out.println("Exit");
				System.exit(0);
				}
			}
			
		}
		
	 }
}
}
