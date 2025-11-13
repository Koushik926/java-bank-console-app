// BankAccount.java - Base class representing a bank account
public class BankAccount {
    // Private attributes (Encapsulation)
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    
    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.accountType = accountType;
    }
    
    // Getter methods
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolderName() {
        return accountHolderName;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String getAccountType() {
        return accountType;
    }
    
    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    
    // Withdraw method
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: $" + amount);
            System.out.println("New balance: $" + balance);
            return true;
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
            return false;
        } else {
            System.out.println("Invalid withdrawal amount!");
            return false;
        }
    }
    
    // Display account information
    public void displayAccountInfo() {
        System.out.println("\n=== Account Information ===");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + balance);
        System.out.println("=========================\n");
    }
}
