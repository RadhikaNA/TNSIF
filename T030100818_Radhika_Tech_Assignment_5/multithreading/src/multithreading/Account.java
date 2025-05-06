package multithreading;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
public class Account {
	private int accountNumber;
    private double balance;
    private final Lock lock = new ReentrantLock();

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        lock.lock();
        try {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " deposited $" + amount + ". New balance: $" + balance);
        } finally {
            lock.unlock();
        }
}
    public void withdraw(double amount) {
        lock.lock();
        try {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " withdrew $" + amount + ". New balance: $" + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " attempted to withdraw $" + amount + " but insufficient balance!");
            }
        } finally {
            lock.unlock();
        }
    }

    public double getBalance() {
        return balance;
    }
}