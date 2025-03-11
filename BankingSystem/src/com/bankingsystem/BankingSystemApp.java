package com.bankingsystem;

import java.util.List;
import java.util.Scanner;

public class BankingSystemApp {
    public static void main(String[] args) {
        BankingService service = new BankingServiceImpl();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nBanking System");
            System.out.println("1. Add Customer");
            System.out.println("2. Add Account");
            System.out.println("3. Add Beneficiary");
            System.out.println("4. Add Transaction");
            System.out.println("5. Find Customer by ID");
            System.out.println("6. List all Accounts of a Customer");
            System.out.println("7. List all Transactions of an Account");
            System.out.println("8. List all Beneficiaries of a Customer");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: // Add Customer
                    System.out.print("Enter Customer ID: ");
                    int customerId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter Contact No.: ");
                    String contact = scanner.nextLine();

                    service.addCustomer(new Customer(customerId, name, address, contact));
                    System.out.println("Customer added successfully!");
                    break;

                case 2: // Add Account
                    System.out.print("Enter Account ID: ");
                    int accountId = scanner.nextInt();
                    System.out.print("Enter Customer ID: ");
                    int accCustomerId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Account Type (Saving/Current): ");
                    String accountType = scanner.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double balance = scanner.nextDouble();

                    service.addAccount(new Account(accountId, accCustomerId, accountType, balance));
                    System.out.println("Account added successfully!");
                    break;

                case 3: // Add Beneficiary
                    System.out.print("Enter Beneficiary ID: ");
                    int beneficiaryId = scanner.nextInt();
                    System.out.print("Enter Customer ID: ");
                    int benCustomerId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Beneficiary Name: ");
                    String benName = scanner.nextLine();
                    System.out.print("Enter Beneficiary Account Number: ");
                    String benAccNumber = scanner.nextLine();
                    System.out.print("Enter Beneficiary Bank Details: ");
                    String benBankDetails = scanner.nextLine();

                    service.addBeneficiary(new Beneficiary(beneficiaryId, benCustomerId, benName, benAccNumber, benBankDetails));
                    System.out.println("Beneficiary added successfully!");
                    break;

                case 4: // Add Transaction
                    System.out.print("Enter Transaction ID: ");
                    int transactionId = scanner.nextInt();
                    System.out.print("Enter Account ID: ");
                    int transAccId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Transaction Type (Deposit/Withdraw): ");
                    String transType = scanner.nextLine();
                    System.out.print("Enter Transaction Amount: ");
                    double amount = scanner.nextDouble();

                    service.addTransaction(new Transaction(transactionId, transAccId, transType, amount));
                    System.out.println("Transaction added successfully!");
                    break;

                case 5: // Find Customer by ID
                    System.out.print("Enter Customer ID: ");
                    int searchCustomerId = scanner.nextInt();
                    Customer foundCustomer = service.findCustomerById(searchCustomerId);
                    System.out.println(foundCustomer != null ? foundCustomer : "Customer not found.");
                    break;

                case 6: // List all Accounts of a Customer
                    System.out.print("Enter Customer ID: ");
                    int listAccCustomerId = scanner.nextInt();
                    List<Account> customerAccounts = service.getAccountsByCustomerId(listAccCustomerId);

                    System.out.println("Accounts for Customer ID: " + listAccCustomerId);
                    for (Account acc : customerAccounts) {
                        System.out.println(acc);
                    }
                    break;

                case 7: // List all Transactions of an Account
                    System.out.print("Enter Account ID: ");
                    int listTransAccId = scanner.nextInt();
                    List<Transaction> accountTransactions = service.getTransactionsByAccountId(listTransAccId);

                    System.out.println("Transactions for Account ID: " + listTransAccId);
                    for (Transaction txn : accountTransactions) {
                        System.out.println(txn);
                    }
                    break;

                case 8: // List all Beneficiaries of a Customer
                    System.out.print("Enter Customer ID: ");
                    int listBenCustomerId = scanner.nextInt();

                    List<Beneficiary> customerBeneficiaries = service.getBeneficiariesByCustomerId(listBenCustomerId);

                    if (customerBeneficiaries.isEmpty()) {
                        System.out.println("No beneficiaries found for Customer ID: " + listBenCustomerId);
                    } else {
                        System.out.println("Beneficiaries for Customer ID: " + listBenCustomerId);
                        for (Beneficiary ben : customerBeneficiaries) {
                            System.out.println(ben);
                        }
                    }
                    break;


                case 9: // Exit
                    System.out.println("Thank you for using Banking System!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
