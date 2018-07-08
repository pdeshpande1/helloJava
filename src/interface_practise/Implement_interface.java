package interface_practise;

public class Implement_interface implements Client_methods, Interface_practise_1
{
	public void Add_account()
	{
		System.out.println("This method adds new account");
	}
	
	public void Create_Trade()
	{
		System.out.println("This method creates new trade");
	}
	
	public int Apply_rates()
	{
		System.out.println("This method applies rates");
	}
	
	public void Apply_rates()
	{
		System.out.println("This method applies rates");
	}
	
	public void create_rebate()
	{
		System.out.println("This method calculates rebate");
	}
	
	public void Add_subaccount()
	{
		System.out.println("This method adds subaccount");
	}
	
	public static void main(String []args)
	{
		Implement_interface i2= new Implement_interface ();
		
		i2.Add_account();
		i2.Apply_rates();
		i2.Create_Trade();
		
	}

}

 
