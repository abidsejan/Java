import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		Account a1=new Account(111,557597);
		
		Account s1=new SavingAccount(222,3500,8.5F);
		
		Account f1=new FixedAccount(333,4500,5);
		
		FixedAccount f2=new FixedAccount(444,6500,9);
		
		Customer c1=new Customer("Mushi",5);
		
		c1.insertAccount(a1);
		c1.insertAccount(s1);
		c1.insertAccount(f1);
		c1.insertAccount(f2);
		
		c1.details();
		
		
		
		//c1.removeAccount(a2);
		
		//c1.details();
	}
}