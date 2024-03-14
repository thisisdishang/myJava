/* Write a Java program to demonstrate user defined exception, your program throws an exception whenever balance amount is below Rs 1000,
bank details must account number, account user name and balance amount. */

public class Q13 {
    public static void main(String[] args) {
        Bank bank = new Bank(1000, "Jarvis", "1472583698");
        bank.debit(500);
        try {
            if (bank.getBalance() < 1000)
                throw new Exception("Insufficient balance");
            bank.debit(1000);
            System.out.println(bank.getUserName() + " " + bank.getAccountNumber() + " " + bank.getBalance());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Bank {
    int balance;
    String userName;
    String accountNumber;

    Bank(int balance, String userName, String accountNumber) {
        this.balance = balance;
        this.userName = userName;
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void debit(int amount) {
        balance = balance - amount;
    }
}