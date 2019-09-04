package chapter5proj;

//5.7

import java.text.NumberFormat;

public class Account3 implements Lockable {
	private NumberFormat fmt = NumberFormat.getCurrencyInstance();
	private final double RATE = 0.035;  // interest rate of 3.5%
	private int acctNumber, keyAccount;
	private double balance;
	private String name;
	public boolean LOCKED;
	
	public Account3 (String owner, int account, double initial) {
		name = owner;
		acctNumber = account;
		balance = initial;
		keyAccount = 0;
	}
	
	public double deposit (double amount) {
		if(!LOCKED) {
			if (amount < 0){
				System.out.println ();
		        System.out.println ("Error: Deposit amount is invalid.");
		        System.out.println (acctNumber + " " + fmt.format(amount));
		    }
		    else
		    	balance = balance + amount;
		}
		else
			System.out.println("Error: Locked");
	    return balance;
	}
	public double withdraw (double amount, double fee) {
		if(!LOCKED) {
			amount += fee;
		    if (amount < 0) {
		       System.out.println ();
		       System.out.println ("Error: Withdraw amount is invalid.");
		       System.out.println ("Account: " + acctNumber);
		       System.out.println ("Requested: " + fmt.format(amount));
		    }
		    else
		    	if (amount > balance){
		    		System.out.println ();
		    		System.out.println ("Error: Insufficient funds.");
		    		System.out.println ("Account: " + acctNumber);
		    		System.out.println ("Requested: " + fmt.format(amount));
		    		System.out.println ("Available: " + fmt.format(balance));
		    	}
		    	else
		    		balance = balance - amount;
		}
		else
			System.out.println("Error: Locked");
	    return balance;
	}
	public double addInterest () {
		if(!LOCKED)
			balance += (balance * RATE);
		else
			System.out.println("Error: Locked");
		return balance;
	}
	public double getBalance () {
		if(!LOCKED)
			return balance;
		else {
			System.out.print("Error: Locked");
			return 0;
		}
   }
   public int getAccountNumber () {
	   if(!LOCKED)
		   return acctNumber;
	   else {
		   System.out.print("Error: Locked");
		   return 0;
	   }
   }
   public String toString () {
	   if(!LOCKED)
		   return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
	   else {
		   System.out.print("Error: Locked");
		   return null;
	   }
   }
	   
	public void setKey(int key) {
		if(!LOCKED)
			keyAccount = key;
	}

	public void lock(int key) {
		if(key == keyAccount)
			LOCKED = true;
		else
			System.out.println("Wrong key");
	}

	public void unlock(int key) {
		if(key == keyAccount)
			LOCKED = false;
		else
			System.out.println("Wrong key");
	}

	public boolean locked() {
		return LOCKED;
	}
}
