// BankApplication.java - Main application with menu system
import java.util.Scanner;
import java.util.ArrayList;

public class BankApplication {
    private static ArrayList<BankAccount> accounts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static int accountCounter = 1000;
    
    public static void main(String[] args) {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("  WELCOME TO JAVA BANK CONSOLE APPLICATION");
        System.out.println("=".repeat(50) + "\n");
        
        boolean running = true;
        
        while (running) {
            displayMenu();
            int choice = getIntInput("Enter your choice (1-6): ");
            
            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    checkBalance();
                    break;
                case 5:
                    viewAllAccounts();
                    break;
                case 6:
                    System.out.println("\nThank you for using Java Bank! Goodbye!\n");
                    running = false;
                    break;
                default:
                    System.out.println("\nInvalid choice! Please try again.\n");
            }
        }
        
        scanner.close();
    }
    
    private static void displayMenu() {
        System.out.println("\n" + "-".repeat(50));
        System.out.println("           BANK MENU");
        System.out.println("-".repeat(50));
        System.out.println("1. Create New Account");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Check Balance");
        System.out.println("5. View All Accounts");
        System.out.println("6. Exit");
        System.out.println("-".repeat(50));
    }
    
    private static void createAccount() {
        System.out.println("\n=== Create New Account ===");
        
        scanner.nextLine(); // Clear buffer
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter account type (Savings/Checking): ");
        String type = scanner.nextLine();
        
        double initialDeposit = getDoubleInput("Enter initial deposit amount: $");
        
        if (initialDeposit < 0) {
            System.out.println("\nInitial deposit cannot be negative!");
            return;
        }
        
        String accountNumber = "ACC" + (accountCounter++);
        BankAccount newAccount = new BankAccount(accountNumber, name, initialDeposit, type);
        accounts.add(newAccount);
        
        System.out.println("\n✓ Account created successfully!");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + name);
        System.out.println("Initial Balance: $" + initialDeposit);
    }
    
    private static void deposit() {
        System.out.println("\n=== Deposit Money ===");
        
        scanner.nextLine(); // Clear buffer
        System.out.print("Enter account number: ");
        String accNum = scanner.nextLine();
        
        BankAccount account = findAccount(accNum);
        
        if (account != null) {
            double amount = getDoubleInput("Enter deposit amount: $");
            account.deposit(amount);
        } else {
            System.out.println("\nAccount not found!");
        }
    }
    
    private static void withdraw() {
        System.out.println("\n=== Withdraw Money ===");
        
        scanner.nextLine(); // Clear buffer
        System.out.print("Enter account number: ");
        String accNum = scanner.nextLine();
        
        BankAccount account = findAccount(accNum);
        
        if (account != null) {
            double amount = getDoubleInput("Enter withdrawal amount: $");
            account.withdraw(amount);
        } else {
            System.out.println("\nAccount not found!");
        }
    }
    
    private static void checkBalance() {
        System.out.println("\n=== Check Balance ===");
        
        scanner.nextLine(); // Clear buffer
        System.out.print("Enter account number: ");
        String accNum = scanner.nextLine();
        
        BankAccount account = findAccount(accNum);
        
        if (account != null) {
            account.displayAccountInfo();
        } else {
            System.out.println("\nAccount not found!");
        }
    }
    
    private static void viewAllAccounts() {
        System.out.println("\n=== All Bank Accounts ===");
        
        if (accounts.isEmpty()) {
            System.out.println("No accounts found!\n");
            return;
        }
        
        System.out.println("\n" + "-".repeat(80));
        System.out.printf("%-12s %-25s %-15s %-15s%n", "Acc Number", "Holder Name", "Type", "Balance");
        System.out.println("-".repeat(80));
        
        for (BankAccount acc : accounts) {
            System.out.printf("%-12s %-25s %-15s $%-14.2f%n", 
                acc.getAccountNumber(), 
                acc.getAccountHolderName(), 
                acc.getAccountType(), 
                acc.getBalance());
        }
        
        System.out.println("-".repeat(80) + "\n");
    }
    
    private static BankAccount findAccount(String accountNumber) {
        for (BankAccount acc : accounts) {
            if (acc.getAccountNumber().equals(accountNumber)) {
                return acc;
            }
        }
        return null;
    }
    
    private static int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input! " + prompt);
            scanner.next();
        }
        return scanner.nextInt();
    }
    
    private static double getDoubleInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.print("Invalid input! " + prompt);
            scanner.next();
        }
        return scanner.nextDouble();
    }
}
