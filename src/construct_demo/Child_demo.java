package construct_demo;

public class Child_demo extends Construct_practise 
{
	int a=5;
	int sum;
	
	public Child_demo()
	{
		
		System.out.println("I am in child classn HOHOHOHO");
	}
	
	public  void  SUM()
	{
		int a=2;
		sum=this.a+a;
		System.out.println(sum);
	}
	
	public static void main(String []args)
	{
		Child_demo cd= new Child_demo();
		//Construct_practise cp= new Child_demo();
		
		cd.SUM();
		cd.getdata();
	
	}
}
