package oops;

import java.util.ArrayList;
import java.util.Scanner;

class Account{
	int accNo;
	String name;
	double balance;
	public Account(int accNo, String name, double balance) {
//		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	
	
	// Deposit Money
	
	void deposit(double amount) {
		double bal = balance+amount;
		System.out.println("Amount to be deposited:" + bal);
		System.out.println("Deposit Completed!");
	}
	
	// Withdraw Money
	
	
	void withdraw(double amount) {
		if(balance>=amount) {
			System.out.println("Wait for withdrawl..." + amount + "Deducted");
			System.out.println("Remaining Balance:" + (balance-amount));
		}else {
			System.out.println("Insufficient Funds!");
		}
	}
	
	// Display
	
	void display() {
		System.out.println("Account Number:" + accNo);
		System.out.println("Name:" + name);
		System.out.println("Current Balance:" + balance);
	}
	
	
	
}

public class BankAccountSystem {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Account> al = new ArrayList<Account>();
		while(true) {
		System.out.println("  				Welcome				");
		System.out.println("1.Create Account:");
		System.out.println("2. Display Accounts");
		System.out.println("3.Deposit:");
		System.out.println("4.Withdraw:");
		System.out.println("5. Exit");
		System.out.print("6.Enter choice: ");
		
		//System.out.println("Enter the Amount:");
		int opt = s.nextInt();	
		switch(opt) {
		
		case 1: {
			 System.out.print("Enter Account Number: ");
             int id = s.nextInt();

             s.nextLine(); // clear buffer
             System.out.print("Enter Name: ");
             String n = s.nextLine();

             System.out.print("Enter Initial Balance: ");
             double b = s.nextDouble();

             Account acc = new Account(id, n, b);
             al.add(acc);

             System.out.println("Account Created!");
             break;
		
		}
        case 2:
            if (al.isEmpty()) {
                System.out.println("No Accounts Found!");
            } else {
                for (Account account : al) {
                    account.display();
                }
            }
            break;

        case 3:
            System.out.print("Enter Account Number: ");
            int depId = s.nextInt();

            for (Account account : al) {
                if (account.accNo == depId) {
                    System.out.print("Enter Amount to Deposit: ");
                    double amt = s.nextDouble();
                    account.deposit(amt);
                }
            }
            break;

        case 4:
            System.out.print("Enter Account Number: ");
            int widId = s.nextInt();

            for (Account account : al) {
                if (account.accNo == widId) {
                    System.out.print("Enter Amount to Withdraw: ");
                    double amt = s.nextDouble();
                    account.withdraw(amt);
                }
            }
            break;

        case 5:
            System.out.println("Thank you!");
            s.close();
            System.exit(0);

        default:
            System.out.println("Invalid Choice!");

		}
		
		//s.close();
		}
	}
}
