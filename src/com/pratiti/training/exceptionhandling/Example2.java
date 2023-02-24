package com.pratiti.training.exceptionhandling;



class BankAccount {
	
	int acno;
	double balance;
	
	BankAccount(int acno,double balance)
	{
		this.acno=acno;
		this.balance=balance;
	}
	
	double  withdraw(double amount )  throws AccountException
	{
		if (amount>balance)
		{
			throw new AccountException("Insufficient Balance!");
		}
		else {
			balance -=amount;
			return balance;
		}
	}

}
class AccountException extends Exception{
	
       AccountException(String msg) {
		// TODO Auto-generated constructor stub
    	   super(msg);
	}
}

public class Example2 {
	
	public static void main(String[] args) {
		
		BankAccount p1=new BankAccount(23, 34550);
		try {
			double balance=p1.withdraw(320.90);
			System.out.println("Balance left :"+balance);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
