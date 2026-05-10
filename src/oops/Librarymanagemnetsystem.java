package oops;
import java.util.*;
import java.util.Scanner;

class Library{
	int bookId;
	String title;
	String author;
	boolean isIssued;
	ArrayList<Library> al = new ArrayList<Library>();
	public Library(int bookId, String title, String author, boolean isIssued) {
//		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.isIssued = isIssued;
	}
	
	public Library() {
		// TODO Auto-generated constructor stub
	}

	// Add Book
	
	
	void Addbook(Scanner s) {
		System.out.println("Enter number of books to be added:");
		int n = s.nextInt();
		
		s.nextLine();
		
		for(int i=0;i<n;i++) {
			System.out.println("Enter BookID:");
			int bookId = s.nextInt();
			
			s.nextLine();
			
			System.out.println("Enter Title:");
			String title = s.nextLine();
			
			System.out.println("Enter Author:");
			String author = s.nextLine();
			
			s.nextLine();
			
			System.out.println("Enter Issued:");
			
			boolean isIssued = s.equals(bookId);
			
			al.add(new Library(bookId,title,author,isIssued));
			
			
		}
	}
	
	// display
	
	
	void display() {

		for(Library L : al){
			System.out.println("The BookId is:" + L.bookId);
			System.out.println("The Tile is:" + L.title);
			System.out.println("The Author is:" + L.author);
			System.out.println("Date Issued  is:" + L.isIssued);
		}
	}
	
	//issue	
	void issuebook(Scanner s) {
		System.out.println("Enter BookId");
		int bookId = s.nextInt();

		boolean found = false;
		
		for(Library L : al) {
			if(L.bookId == bookId) {
				found = true;
				
				if(!L.isIssued) {
					L.isIssued = true;
					System.out.println("Book issued successfully");
				}else {
					System.out.println("Book Already Issued");
				}
				
			
			}
		}
		
		if(!found ) {
			System.out.println("Book not found!");
		}
		
	}
	
	
	//return
	void returnbook(Scanner s) {
		System.out.println("Enter BookID to return:");
		int id = s.nextInt();
		
		boolean found = false;
		
		for(Library L: al) {
			if(L.bookId == id) {
				found = true;
				
				if(L.isIssued) {
					L.isIssued = false;
					System.out.println("Book Returned Successfully");
				}else {
					System.out.println("Book was not issued");
				}
			}
		}
		
		if(!found) {
			System.out.println("Book not found");
		}
		
	}
	
	
	//search
	
	void search(Scanner s) {
		System.out.println("Enter book Title:");
		s.nextLine();
		String title = s.nextLine();
		
		boolean found = false;
		
		for(Library L: al) {
			if(L.title.equalsIgnoreCase(title)) {
				System.out.println("Book Found:");
	            System.out.println("ID: " + L.bookId);
	            System.out.println("Title: " + L.title);
	            System.out.println("Author: " + L.author);
	            System.out.println("Status: " + (L.isIssued ? "Issued" : "Available"));
	            found = true;
				
			}
		}
		
		if(!found) {
			System.out.println("Book Not Found");
		}
		
		
	}
	
	
}







public class Librarymanagemnetsystem {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		Library L = new Library();
		
		while(true) {
			System.out.println("Reception:");
			System.out.println("1. Add Books");
			System.out.println("2. Display Book");
			System.out.println("3. Issue Book");
			System.out.println("4. Return Book");
			System.out.println("5. Search Book");
			System.out.println("6. Exit");
			System.out.println("Enter your choice(1-6)");
			int choice = s.nextInt();
			s.nextLine();
			
			switch(choice) {
			
			case 1: {
				System.out.println("You Entered Choice 1.");
				L.Addbook(s);
				break;
			}
			case 2: {
				System.out.println("You Entered your choice 2.");
				L.display();
				break;				
			}
			case 3:{
				System.out.println("You Entered your choice 3:");
				L.issuebook(s);
				break;
			}
			case 4:{
				System.out.println("You Entered your choice 4:");
				L.returnbook(s);
				break;
			}
			case 5:{
				System.out.println("You Entered your choice 5:");
				L.search(s);
				break;
			}

			case 6:{
				System.out.println("You Entered your choice 6:");
				System.exit(0);
			}
			
			default:{
				System.out.println("Invalid Choice!");
			}
			
			}
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
