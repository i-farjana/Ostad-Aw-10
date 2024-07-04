package Assignment01;

public class BankAccount {
	 protected double balance;

	    public BankAccount(double balance) {
	        this.balance = balance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount + ". New balance: " + balance);
	        } else {
	            System.out.println("Deposit amount must be positive.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
	        } else {
	            System.out.println("Invalid withdrawal amount.");
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }
	}


