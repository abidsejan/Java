public class Customer {
	private String name;
	private Account accounts[];
	
	public Customer() {
		System.out.println("Empty Cons. For Customer");
	}
	
	public Customer(String name,int size) {
		this.name=name;
		accounts=new Account[size];
		System.out.println("Pera Cons. For Customer");
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void insertAccount(Account acc) {
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
	
	public void removeAccount(Account acc) {
		int flag=0;
		for(int i=0;i<accounts.length;i++)
		{
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
		
		else{
			System.out.println("Not Removed");
		}
		
	}
	
	public void details() {
		System.out.println("Name: "+name);
		for(int i=0;i<accounts.length;i++)
		{
			if(accounts[i]!=null)
			{
				accounts[i].details();
			}
		}
	}	
}