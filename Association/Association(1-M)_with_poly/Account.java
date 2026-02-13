import java.lang.*;

public class Account
{
	private int id;
	private double amount;
	
	public Account()
	{
		System.out.println("Empty Cons. for Account");
	}
	
	public Account(int id,double amount)
	{
		this.id=id;
		this.amount=amount;
		System.out.println("Pera Cons. for Account");
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	
	public void setAmount(double amount)
	{
		this.amount=amount;
	}
	
	public int getId()
	{
		return id;
	}
	
	
	public double getAmount()
	{
		return amount;
	}
	
	public void details()
	{
		System.out.println("Id: "+id+"\n"+"Amount: "+amount);
	}
	
}