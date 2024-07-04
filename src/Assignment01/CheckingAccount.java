package Assignment01;


	class CheckingAccount extends BankAccount {
	    private static final double WITHDRAWAL_FEE = 1.50;

	    public CheckingAccount(double balance) {
	        super(balance);
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount > 0 && (amount + WITHDRAWAL_FEE) <= balance) {
	            balance -= (amount + WITHDRAWAL_FEE);
	            System.out.println("Withdrew: " + amount + ". Fee: " + WITHDRAWAL_FEE + ". New balance: " + balance);
	        } else {
	            System.out.println("Invalid withdrawal amount or insufficient funds.");
	        }
	    }
	}


