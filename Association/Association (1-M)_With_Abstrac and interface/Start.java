//import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		//Account a1=new Account(111,56799); abstract class no object
		Account a2=new FixedAccount(222,7824,5);
		FixedAccount f1=new FixedAccount(333,5421,6);
		SavingAccount s1=new SavingAccount(444,98765,7.5F);
		
		Customer c1=new Customer("Mr. x",5);
		//c1.insertAccount(a1);
		c1.insertAccount(a2);
		c1.insertAccount(f1);
		c1.insertAccount(s1);
		c1.details();
		
		//c1.removeAccount(a2);
		//c1.details();
		
	}
}