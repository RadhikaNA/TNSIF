package multithreading;



public class BankingSystem {
	 public static void main(String[] args) {
		 Account account = new Account(101, 1000); // Initial balance: $1000

	        // Creating multiple threads for concurrent transactions
	        Thread t1 = new Thread(new Transaction(account, true, 500), "Customer 1");
	        Thread t2 = new Thread(new Transaction(account, false, 300), "Customer 2");
	        Thread t3 = new Thread(new Transaction(account, false, 700), "Customer 3");
	        Thread t4 = new Thread(new Transaction(account, true, 1000), "Customer 4");

	        // Start the threads
	        t1.start();
	        t2.start();
	        t3.start();
	        t4.start();

	        // Join threads to ensure execution completes before printing final balance
	        try {
	            t1.join();
	            t2.join();
	            t3.join();
	            t4.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        System.out.println("Final account balance: $" + account.getBalance());
	    }
}