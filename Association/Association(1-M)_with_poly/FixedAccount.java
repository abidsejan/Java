import java.lang.*;

public class FixedAccount extends Account
{
	private int year;
	
	public FixedAccount()
	{
		System.out.println("Empty Cons. for FixedAccount");
	}
	
	public FixedAccount(int id,double amount,int year)
	{
		super(id,amount);
		this.year=year;
		System.out.println("Pera Cons. for FixedAccount");
	}
	
	public void setYear(int year)
	{
		this.year=year;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public void details()
	{
		super.details();
		System.out.println("Year: "+year);
	}
	
}