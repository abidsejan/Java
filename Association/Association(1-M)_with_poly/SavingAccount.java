import java.lang.*;

public class SavingAccount extends Account
{
	private float ir;
	
	public SavingAccount()
	{
		System.out.println("Empty Cons. for SavingAccount");
	}
	
	public SavingAccount(int id,double amount,float ir)
	{
		super(id,amount);
		this.ir=ir;
		System.out.println("Pera Cons. for FixedAccount");
	}
	
	public void setIr(float ir)
	{
		this.ir=ir;
	}
	
	public float getIr()
	{
		return ir;
	}
	
	public void details()
	{
		super.details();
		System.out.println("Interest Rate: "+ir);
		
	}
	
}
