//import java.lang.*;

public class FixedAccount extends Account
{
	private int year;
	
	public FixedAccount()
	{
		System.out.println("Empty for FixedAcc");
	}
	public FixedAccount(int id,double balance,int year)
	{
		super(id,balance);
		this.year=year;
		System.out.println("Pera for FixedAcc");
	}
	
	public void setYear(int year)
	{
		this.year=year;
	}
	
	public int getYear()
	{
		return year;
	}
	
	
	public void calCulation(int x)
	{
		//int z=x+10;
	}
	
	public void details()
	{
		super.details();
		System.out.println("Year: "+year);
	}
	
	
	
	
}