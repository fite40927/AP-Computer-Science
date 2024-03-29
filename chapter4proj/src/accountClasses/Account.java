package accountClasses;

import java.text.NumberFormat;

public class Account {
	private NumberFormat fmt = NumberFormat.getCurrencyInstance();
	private final double RATE = 0.035;  // interest rate of 3.5%
	private int acctNumber;
	private double balance;
	private String name;

	public Account (String owner, int account, double initial){
		name = owner;
		acctNumber = account;
		balance = initial;
	}
	
	public static boolean transfer(double amount, double fee, Account from, Account to) {
		if(from.balance + fee < amount || amount < 0)
			return false;
		
		from.withdraw(amount, fee);
		to.deposit(amount);
		return true;
	}
 
	public double deposit (double amount){
		if (amount < 0)  {
			System.out.println ();
			System.out.println ("Error: Deposit amount is invalid.");
			System.out.println (acctNumber + " " + fmt.format(amount));
		}
		else
			balance = balance + amount;
		return balance;
	}
 
	public double withdraw (double amount, double fee) {
		amount += fee;
		if (amount < 0) {
			System.out.println ();
			System.out.println ("Error: Withdraw amount is invalid.");
			System.out.println ("Account: " + acctNumber);
			System.out.println ("Requested: " + fmt.format(amount));
      }
      else {
    	  if (amount > balance) {
    		  System.out.println ();
    		  System.out.println ("Error: Insufficient funds.");
    		  System.out.println ("Account: " + acctNumber);
    		  System.out.println ("Requested: " + fmt.format(amount));
    		  System.out.println ("Available: " + fmt.format(balance));
    	  }
    	  else
    		  balance = balance - amount;
      }
		return balance;
	}
 
	public double addInterest () {
		balance += (balance * RATE);
		return balance;
	}
 
	public double getBalance () {
		return balance;
	}
 
	public int getAccountNumber () {
		return acctNumber;
	}

	public String toString () {
		return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
	}
}