//import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		Account a1=new Account(111,56799);
		Account a2=new Account(222,87569);
		Account a3=new Account(333,98123);
		Customer c1=new Customer("Mr. x",5);
		c1.insertAccount(a1);
		c1.insertAccount(a2);
		c1.insertAccount(a3);
		c1.details();
		
		c1.removeAccount(a2);
		c1.details();
		c1.updateAccount(a3, 0, 0);
		c1.details();
		
	}
}