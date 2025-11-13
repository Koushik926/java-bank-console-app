# Java Bank Console Application

## Description
A console-based banking application built with Java that demonstrates Object-Oriented Programming (OOP) concepts including encapsulation, classes, and methods. This beginner-friendly project provides a complete banking system with account management capabilities.

## Features
- 💼 Create new bank accounts
- 💰 Deposit money into accounts
- 💸 Withdraw money with balance validation
- 📊 Check account balance
- 📋 View all accounts in the system
- 🔒 Encapsulation with private attributes
- ✅ Input validation and error handling

## Technologies Used
- **Java**: Core programming language
- **OOP Concepts**: Classes, Objects, Encapsulation, Methods
- **ArrayList**: Dynamic data structure for account storage
- **Scanner**: User input handling

## Project Structure
```
java-bank-console-app/
├── BankAccount.java        # Account class with encapsulation
├── BankApplication.java    # Main application with menu system
└── README.md              # Project documentation
```

## Installation & Setup

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Any Java IDE (Eclipse, IntelliJ, VS Code) or terminal/command prompt

### Steps

1. **Clone the repository**
```bash
git clone https://github.com/Koushik926/java-bank-console-app.git
cd java-bank-console-app
```

2. **Compile the Java files**
```bash
javac BankAccount.java BankApplication.java
```

3. **Run the application**
```bash
java BankApplication
```

## Usage

### Main Menu
When you run the application, you'll see:

```
==================================================
  WELCOME TO JAVA BANK CONSOLE APPLICATION
==================================================

--------------------------------------------------
           BANK MENU
--------------------------------------------------
1. Create New Account
2. Deposit Money
3. Withdraw Money
4. Check Balance
5. View All Accounts
6. Exit
--------------------------------------------------
```

### Example Operations

#### 1. Create New Account
```
Enter your choice (1-6): 1

=== Create New Account ===
Enter account holder name: John Doe
Enter account type (Savings/Checking): Savings
Enter initial deposit amount: $1000

✓ Account created successfully!
Account Number: ACC1000
Account Holder: John Doe
Initial Balance: $1000.0
```

#### 2. Deposit Money
```
Enter your choice (1-6): 2

=== Deposit Money ===
Enter account number: ACC1000
Enter deposit amount: $500
Successfully deposited: $500.0
New balance: $1500.0
```

#### 3. Withdraw Money
```
Enter your choice (1-6): 3

=== Withdraw Money ===
Enter account number: ACC1000
Enter withdrawal amount: $300
Successfully withdrawn: $300.0
New balance: $1200.0
```

#### 4. Check Balance
```
Enter your choice (1-6): 4

=== Check Balance ===
Enter account number: ACC1000

=== Account Information ===
Account Number: ACC1000
Account Holder: John Doe
Account Type: Savings
Balance: $1200.0
=========================
```

#### 5. View All Accounts
```
Enter your choice (1-6): 5

=== All Bank Accounts ===

--------------------------------------------------------------------------------
Acc Number   Holder Name              Type            Balance        
--------------------------------------------------------------------------------
ACC1000      John Doe                 Savings         $1200.00       
ACC1001      Jane Smith               Checking        $2500.00       
--------------------------------------------------------------------------------
```

## OOP Concepts Demonstrated

### 1. **Encapsulation**
- Private attributes (accountNumber, accountHolderName, balance, accountType)
- Public getter methods for controlled access
- Data hiding and protection

### 2. **Classes and Objects**
- `BankAccount` class represents a bank account entity
- Multiple account objects can be created
- Each object maintains its own state

### 3. **Methods**
- `deposit()`: Adds money to account
- `withdraw()`: Removes money with validation
- `displayAccountInfo()`: Shows account details
- `getBalance()`, `getAccountNumber()`, etc.: Accessor methods

### 4. **Constructors**
- Parameterized constructor for initializing account objects
- Ensures all accounts start with valid data

## Code Highlights

### BankAccount Class
```java
public class BankAccount {
    // Encapsulation - private attributes
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private String accountType;
    
    // Constructor
    public BankAccount(String accountNumber, String accountHolderName, 
                      double initialBalance, String accountType) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.accountType = accountType;
    }
    
    // Methods for operations
    public void deposit(double amount) { ... }
    public boolean withdraw(double amount) { ... }
    public void displayAccountInfo() { ... }
}
```

### BankApplication Class
- Main application with menu-driven interface
- ArrayList for storing multiple accounts
- Scanner for user input
- Switch-case for menu navigation
- Input validation methods

## Error Handling

- ✅ Validates withdrawal amounts against balance
- ✅ Prevents negative deposits/withdrawals
- ✅ Handles invalid account numbers
- ✅ Input type validation (int, double)
- ✅ Account not found messages

## Sample Session

```bash
$ java BankApplication

==================================================
  WELCOME TO JAVA BANK CONSOLE APPLICATION
==================================================

# Create first account
1. Create New Account
   → Account ACC1000 created with $1000

# Deposit money
2. Deposit Money
   → Deposited $500, New balance: $1500

# Withdraw money
3. Withdraw Money
   → Withdrawn $300, New balance: $1200

# View all accounts
5. View All Accounts
   → Shows table with all account details

# Exit
6. Exit
   → Thank you for using Java Bank!
```

## Learning Objectives

This project helps you learn:
- ✅ Java fundamentals and syntax
- ✅ Object-Oriented Programming principles
- ✅ Encapsulation and data hiding
- ✅ ArrayList and collections
- ✅ User input handling with Scanner
- ✅ Menu-driven console applications
- ✅ Error handling and validation

## Future Enhancements
- Add inheritance with SavingsAccount and CheckingAccount subclasses
- Implement interest calculation for savings accounts
- Add transaction history tracking
- Implement file-based persistence
- Add account authentication/PIN
- Generate account statements

## Contributing
Feel free to fork this repository and submit pull requests for improvements!

## License
This project is open-source and available for educational purposes.

## Author
**Koushik926**
- GitHub: [@Koushik926](https://github.com/Koushik926)

## Acknowledgments
- Built as a learning project to demonstrate Java OOP concepts
- Perfect for beginners learning Java programming
- Demonstrates real-world application of encapsulation and classes
