/* Create an abstract class Account representing a generic bank account. Include methods for deposit, withdrawal,
and an abstract method for calculating interest. Implement two concrete subclasses: SavingsAccount and CheckingAccount
that extend the Account class. */

abstract class Account {
    protected double balance;

    // Constructor
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method for deposit
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
        displayBalance();
    }

    // Method for withdrawal
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds");
        }
        displayBalance();
    }

    // Abstract method for calculating interest
    public abstract void calculateInterest();

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    // Constructor
    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added: " + interest);
        displayBalance();
    }
}

class CheckingAccount extends Account {
    private double overdraftLimit;

    // Constructor
    public CheckingAccount(double initialBalance, double overdraftLimit) {
        super(initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    public void calculateInterest() {
        System.out.println("Checking account does not earn interest.");
    }

    public void withdraw(double amount) {
        if (amount > 0 && (balance - amount) >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or exceeding overdraft limit");
        }
        displayBalance();
    }
}

public class Q8 {
    public static void main(String[] args) {
        // Example usage
        SavingsAccount savingsAccount = new SavingsAccount(1000, 5);
        CheckingAccount checkingAccount = new CheckingAccount(1500, 500);

        savingsAccount.deposit(200);
        savingsAccount.calculateInterest();
        savingsAccount.withdraw(50);

        checkingAccount.deposit(300);
        checkingAccount.withdraw(200);
    }
}