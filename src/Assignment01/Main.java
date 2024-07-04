package Assignment01;

public class Main {
	public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(2000);
        BankAccount checking = new CheckingAccount(2000);

        System.out.println("Savings Account:");
        savings.deposit(500);
        savings.withdraw(1200);
        savings.withdraw(800);

        System.out.println("\nChecking Account:");
        checking.deposit(500);
        checking.withdraw(2300);
        checking.withdraw(1000);
    }
}


