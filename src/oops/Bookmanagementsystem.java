package oops;
import java.util.*;
import java.util.ArrayList;

class Book{
	int bookid;
	String title;
	String author;
	ArrayList<Book> al = new ArrayList<Book>();
	public Book(int bookid, String title, String author) {
//		super();
		this.bookid = bookid;
		this.title = title;
		this.author = author;
	}
	
	
	// Addbook
	
	public Book() {
		// TODO Auto-generated constructor stub
	}


	void Addbook(Scanner s) {
		System.out.println("Enter the number of books:");
		int num = s.nextInt();
		s.nextLine();
		for(int i=0;i<num;i++) {
			System.out.println("Enter BookId");
			int bookid = s.nextInt();
			s.nextLine();
			System.out.println("Enter Title");
			String Title = s.nextLine();
			System.out.println("Enter Author");
			String Author = s.nextLine();
			
			al.add(new Book(bookid,Title,Author));
		}
	}
	
	
	// display
	
	
	void display() {
		for(Book b:al) {
		System.out.println("The book id is:" + b.bookid);
		System.out.println("The Title of book is:" + b.title);
		System.out.println("The Authot of book is:" + b.author);
		}
}	
	// search
	
	void search(Scanner s) {
		System.out.println("Enter the book name:");
		String h = s.nextLine();
		
		boolean found = false;
		for(Book b:al) {
			if(b.title.equalsIgnoreCase(h)) {
				System.out.println("Book Found:");
                System.out.println("ID: " + b.bookid);
                System.out.println("Title: " + b.title);
                System.out.println("Author: " + b.author);
                found = true;
			}else {
				System.out.println("Book Not Found!");
			}
		}
	}
}





public class Bookmanagementsystem {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Book b = new Book();
		while(true) {
		System.out.println("Reception");
		System.out.println("1.Add Book");
		System.out.println("2.Display Book");
		System.out.println("3. Search By Title");
		System.out.println("4.Exit");
		
		System.out.println("Enter your choice:");
		int choice = s.nextInt();
		s.nextLine();
		
		switch(choice) {
		
		case 1:{
			System.out.println("You chose Add Book");
			b.Addbook(s);
			break;
		}
		case 2:{
			System.out.println("You chose Display Books");
			b.display();
			break;
		}
		case 3:{
			System.out.println("You chose search Book:");
			b.search(s);
			break;
		}
		case 4:{
			System.out.println("Exit");
			System.exit(0);
		}
		default:
			System.out.println("Invalid choice");
		}
		
	}
	
	
}
}
