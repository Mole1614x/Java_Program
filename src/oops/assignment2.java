package oops;

class student{
	int id;
	String name;
	static double marks;
	public student(int id, String name, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	void display() {
		System.out.println("The id of Student:" + id);
		System.out.println("The name of Student:" + name);
		System.out.println("The marks of Student:" + marks);
	}

	
	static void calculateGrade() {
		if(marks>=75) {
			System.out.println("Distinction");
		}else if(marks >=60 && marks<=74) {
			System.out.println("First Class");
		}else if(marks >=50 && marks<=59) {
			System.out.println("Second class");
		}else {
			System.out.println("Fail");
		}
	}
	
	
}




public class assignment2 {
	
	public static void main(String[] args) {
		student s = new student(1,"Anmol",99);
		s.display();
		s.calculateGrade();
	}
	

}
