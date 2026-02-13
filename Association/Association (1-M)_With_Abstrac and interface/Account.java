//import java.lang.*;

public abstract class Account
{
	private int id;
	private double balance;
	
	
	public Account()
	{
		System.out.println("Empty Cons. for Account");
	}
	
	public Account(int id,double balance)
	{
		this.id=id;
		this.balance=balance;
		System.out.println("Pera Cons. for Account");
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	
	public int getId()
	{
		return id;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	
	public abstract void calCulation(int x);
	
	
	public void details()
	{
		System.out.println("Id: "+id+"\n"+"Balance: "+balance);
	}
	
}