//import java.lang.*;

public class Customer implements OpBank
{
	private String name;
	private Account accounts[];
	
	public Customer()
	{
		System.out.println("Empty Cons. for Customer");
	}
	
	public Customer(String name,int size)
	{
		this.name=name;
		accounts=new Account[size];
		System.out.println("Pera Cons. for Customer");
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void insertAccount(Account acc)
	{
		int flag=0;
		for(int i=0;i<accounts.length;i++)
		{
			if(accounts[i]==null)
			{
				accounts[i]=acc;
				flag=1;
				break;
			}
		}
			if(flag==1)
		{
			System.out.println("Object Inserted");
		}
		else
		{
			System.out.println("Object Not Inserted");
		}
		
	}
	
	public void removeAccount(Account acc)//acc=a2
	{
		int flag=0;
		for(int i=0;i<accounts.length;i++){
			if(accounts[i]==acc)
			{
				accounts[i]=null;
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Account Removed");
		}
		else
		{
			System.out.println("Not Removed");
			
		}
		
		
	}
	public void updateAccount(Account acc,int id, double balance){
        int flag=0;
        for(int i=0;i<accounts.length;i++){
            if(accounts[i]==acc){
                accounts[i].setId(id);
                accounts[i].setBalance(balance);
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Accounts Updated");
        }
        else{
            System.out.println(" Not Updated");
        }
    }
	
	
	public void details()
	{
		System.out.println("Name: "+name);
		for(int i=0;i<accounts.length;i++)
		{
			if(accounts[i]!=null)
			{
				accounts[i].details();
			}
		}
	}
	
	public void methodExtra()
	{
		
	}
	
	
	
}