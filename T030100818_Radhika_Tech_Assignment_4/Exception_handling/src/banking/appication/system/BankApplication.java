package banking.appication.system;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) throws InsufficientFundsException {
		Scanner sc=new Scanner(System.in);
		try {
            // Taking user input for account creation
            System.out.print("Enter account number: ");
            int accountNumber = sc.nextInt();
            System.out.print("Enter initial balance: ");
            double initialBalance = sc.nextDouble();
            
            BankAccount account = new BankAccount(accountNumber, initialBalance);
            account.displayBalance();
            
            // Performing transactions based on user input
            System.out.print("Enter deposit amount: ");
            double depositAmount = sc.nextDouble();
            account.deposit(depositAmount);
            
            System.out.print("Enter withdrawal amount: ");
            double withdrawAmount = sc.nextDouble();
            account.withdraw(withdrawAmount);
            
            account.displayBalance();
            
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction process completed.");
            sc.close();
        }
	}

}
