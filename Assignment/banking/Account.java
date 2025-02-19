import java.util.ArrayList;
import java.util.List;

public class Account {
    private String accountHolderName;
    private String accountNumber;
    private double balance;
    private List<String> transactionHistory;
    private static final double INTEREST_RATE = 0.05;

    public Account(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.transactionHistory = new ArrayList<>();
        logTransaction("Account created with initial balance: " + balance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Deposit amount must be greater than zero.");
            return;
        }
        balance += amount;
        logTransaction("Deposited: " + amount);
        System.out.println("New Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Withdrawal amount must be greater than zero.");
            return;
        }
        if (amount > balance) {
            System.out.println("Error: Insufficient funds.");
            return;
        }
        balance -= amount;
        logTransaction("Withdrawn: " + amount);
        System.out.println("New Balance: " + balance);
    }

    public void addInterest() {
        double interest = balance * INTEREST_RATE;
        balance += interest;
        logTransaction("Interest added: " + interest);
        System.out.println("New Balance: " + balance);
    }

    public void transfer(Account destinationAccount, double amount) {
        if (amount <= 0) {
            System.out.println("Error: Transfer amount must be greater than zero.");
            return;
        }
        if (amount > balance) {
            System.out.println("Error: Insufficient funds.");
            return;
        }
        balance -= amount;
        destinationAccount.deposit(amount);
        logTransaction("Transferred: " + amount + " to account " + destinationAccount.getAccountNumber());
        System.out.println("New Balance: " + balance);
    }

    public void printTransactionHistory() {
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }

    private void logTransaction(String transaction) {
        transactionHistory.add(transaction);
    }

    public void getAccountHolderInfo() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Transaction History: " + transactionHistory);
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
