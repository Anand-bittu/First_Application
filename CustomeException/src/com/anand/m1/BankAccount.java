package com.anand.m1;

//custom Checked Exception :: InsufficientFundException
class InsufficientFundsException extends Exception{
	private double balance;
	private double withdrawalAmount;
	public InsufficientFundsException(String msg,double balance,double withdrawalAmount) {
	super(msg);
	this.balance=balance;
	this.withdrawalAmount=withdrawalAmount;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getWithdrawalAmount() {
		return withdrawalAmount;
	}
	public void setWithdrawalAmount(double withdrawalAmount) {
		this.withdrawalAmount = withdrawalAmount;
	}
}
public class BankAccount {
   private String accountNumber;
   private double balance;
   
   public BankAccount(String accountNumber,double balance) {
     this.accountNumber=accountNumber;
     this.balance=balance;
   }
	public void withDraw(double amount)throws InsufficientFundsException {
		if(amount>balance) {
			throw new InsufficientFundsException("InsufficientFunds Exc",balance, amount);
		}else {
			balance=balance-amount;
			System.out.println("Withdrawal of " + amount + " successful. Remaining balance: " + balance);
		}
	}
   public void deposit(double amount) {
	  balance=balance+amount;
	  System.out.println("Deposit of " + amount + " successful. New balance: " + balance);
   }
	public static void main(String[] args) {
         BankAccount ac=new BankAccount("accout1", 600);
         try {
         ac.withDraw(700);//throws InsufficentException
         ac.withDraw(300);
         }catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
         }
	}

}
