package oops;

import java.util.Scanner;

class Student{
	int id;
	String name;
	double marks;
	
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("-------------------");
    }

}

public class StudentManagementSystem {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Student[] students = new Student[5];
		int count=0;
		
		while(true) {
			System.out.println("\n1.Add Student:");
			System.out.println("2.Display Students:");
			System.out.println("3.Exit:");
			
			int choice = s.nextInt();
			
			if (choice == 1) {
				if(count < students.length) {
					students[count]  = new Student();
					
					System.out.println("Enter id:");
					students[count].id=s.nextInt();
					
					s.nextLine();
					
					System.out.println("Enter name:");
					students[count].name=s.nextLine();
					
					s.nextLine();
					
					System.out.println("Enter id:");
					students[count].marks=s.nextDouble();
					count++;
				} else {
					System.out.println("Array full!");
				}
				
			}
			else if(choice == 2) {
				for(int i=0;i<count;i++) {
					students[i].display();
				}
				
				}
			else if(choice == 3) {
				System.out.println("Good bye!");
				break;
			}
		}
		
		
	}
}

