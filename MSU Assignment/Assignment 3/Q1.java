/* Create a class named Account. The Account object represent a bank account that has a balance(as an argument).
Write a program that creates an account with a balance of 100.0, deposits 20.0 in it, and finally prints the balance. */

import java.util.*;

class Account {
	int bal;

	Account(int b) {
		System.out.println("Account is created...");
		System.out.println("Available balance is " + b);
		bal = b;
	}

	public void deposit(int amt) {
		bal = bal + amt;
		System.out.println(amt + " is deposits in account...available balance is " + bal);
	}
}

class Q1 {
	public static void main(String args[]) {
		Account bank_Account = new Account(150);
		bank_Account.deposit(20);
	}
}