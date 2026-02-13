//import java.lang.*;

public class SavingAccount extends Account
{
	private float ir;
	
	public SavingAccount()
	{
		System.out.println("Empty for SavingAcc");
	}
	
	public SavingAccount(int id,double balance,float ir)
	{
		super(id,balance);
		this.ir=ir;
		System.out.println("pera for SavingAcc");
	}
	
	public void setIr(float ir)
	{
		this.ir=ir;
	}
	
	public double getIr()
	{
		return ir;
	}
	public void calCulation(int x){
		
	}
	public void details()
	{
		super.details();
		System.out.println("Ir: "+ir);

	}
	
	
}