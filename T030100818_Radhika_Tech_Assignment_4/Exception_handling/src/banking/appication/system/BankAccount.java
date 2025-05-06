package banking.appication.system;

public class BankAccount {
	private int accountNumber;
	private double balance ;
	
	public BankAccount() {
		super();
		
	}

	public BankAccount(int accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	//Method to deposit money
	public void deposit(double amount) throws InvalidAmountException{
		if(amount<=0) {
			throw new InvalidAmountException("Depositamount must be greater than zero");
				
		}
		balance +=amount;
		System.out.println("Succesfully deposited : $" +amount);
	}
	// Methods to withdraw money
	public void withdraw(double amount) throws InsufficientFundsException,InvalidAmountException{
		if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds. Available balance:$ " + balance);
        }
        balance -= amount;
        System.out.println("Successfully withdrawn: $" + amount);
    }
	// Methods to withdraw money
	public void displayBalance(){
		System.out.println("Account Number :" + accountNumber + ",Balance : $" +balance);
		
	}
}
