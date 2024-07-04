package Assignment01;


	class SavingsAccount extends BankAccount {
	    private static final double WITHDRAWAL_LIMIT = 1000.00;

	    public SavingsAccount(double balance) {
	        super(balance);
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount > WITHDRAWAL_LIMIT) {
	            System.out.println("Withdrawal amount exceeds the limit of " + WITHDRAWAL_LIMIT);
	        } else if (amount > 0 && amount <= balance) {
	            balance -= amount;
	            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
	        } else {
	            System.out.println("Invalid withdrawal amount.");
	        }
	    }
	}



