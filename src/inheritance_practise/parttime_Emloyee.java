package inheritance_practise;

public class parttime_Emloyee extends employee
{
	int a=100;
	int b=200;
	int sum;
	
	public parttime_Emloyee() {
		System.out.println("parttime_Emloyee Cotrnct");
	}
	
	public void hireme() {
		System.out.println(""
				+ "YAY!! I am hired");
	} 
	
	public void fireme() {
		System.out.println(""
				+ "HAHA!! I am on contract.");
	} 

	/*public void monthly_Salary()
	{
		System.out.println("Iam in Part time employee class ");
	}*/

	public void total()
	{
		
		sum= super.a+ super.b;
		System.out.println(sum);
	}
	
	public void supclass()
	{
		this.monthly_Salary();
	}
}


