/* Write a Java programming to create a banking system with three classes - Bank, Account, SavingsAccount, and CurrentAccount. The
bank should have a list of accounts and methods for adding them. Accounts should be an interface with methods to deposit, withdraw,
calculate interest, and view balances. SavingsAccount and CurrentAccount should implement the Account interface and have their own
unique methods. */

import java.util.*;

// Account interface
interface Account {
    void deposit(double amount);

    void withdraw(double amount);

    void calculateInterest();

    double getBalance();
}

// SavingsAccount class implementing Account
class SavingsAccount implements Account {
    private double balance;
    private double interestRate;

    public SavingsAccount(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds!");
        }
    }

    @Override
    public void calculateInterest() {
        balance += balance * interestRate;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    // Unique method for SavingsAccount
    public void addInterest() {
        calculateInterest();
        System.out.println("Interest added to the savings account.");
    }
}

// CurrentAccount class implementing Account
class CurrentAccount implements Account {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance -= amount;
        } else {
            System.out.println("Exceeded overdraft limit!");
        }
    }

    @Override
    public void calculateInterest() {
        // Current account does not earn interest
        System.out.println("Current account does not earn interest.");
    }

    @Override
    public double getBalance() {
        return balance;
    }

    // Unique method for CurrentAccount
    public void applyOverdraft() {
        System.out.println("Overdraft applied to the current account.");
    }
}

// Bank class
class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Other methods for managing the bank can be added here
    public List<Account> getAccounts() {
        return accounts;
    }
}

// Main class to test the banking system
class Q4 {
    public static void main(String[] args) {
        // Creating instances of Bank, SavingsAccount, and CurrentAccount
        Bank bank = new Bank();
        SavingsAccount savingsAccount = new SavingsAccount(0.05); // 5% interest rate
        CurrentAccount currentAccount = new CurrentAccount(500); // $500 overdraft limit

        // Adding accounts to the bank
        bank.addAccount(savingsAccount);
        bank.addAccount(currentAccount);

        // Depositing and withdrawing from accounts
        savingsAccount.deposit(1000);
        currentAccount.deposit(2000);

        savingsAccount.withdraw(200);
        currentAccount.withdraw(1500);

        // Calculating interest for SavingsAccount
        savingsAccount.calculateInterest();
        savingsAccount.addInterest();

        // Viewing balances
        System.out.println("Savings Account Balance: " + savingsAccount.getBalance());
        System.out.println("Current Account Balance: " + currentAccount.getBalance());
    }
}