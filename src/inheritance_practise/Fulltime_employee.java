package inheritance_practise;

public class Fulltime_employee extends parttime_Emloyee
{
	
	public Fulltime_employee() {
		System.out.println("Fulltime_employee Constr");
	}
	
	public void fireme() {
		System.out.println("Geez!! I am fired");
	} 
	
	public void hireme() {
		System.out.println(""
				+ "WHAT!! I am already hired");
	} 
	
	public void monthly_Salary()
	{
		System.out.println("I am in full time class");
	}
	
	public void fulltime_emp()
	{
		System.out.println("I am full time employee");
	}
	
	public void baseclass()
	{
		
		super.monthly_Salary();
	}
	
	public static void main(String []args)
	{
		
		parttime_Emloyee pe= new Fulltime_employee();
		
		Fulltime_employee fe= new Fulltime_employee();
		
		parttime_Emloyee pe1= new parttime_Emloyee();
		
		employee  e1= new employee ();
		
		//fe.fulltime_emp();
		//pe.fireme(); //here since object is of parent class reference, fireme method will get override
		//pe1.fireme();//here the object is of base class, so base class method will be called and wont get override
		
		e1.monthly_Salary();
		fe.monthly_Salary();
		pe.monthly_Salary();
		pe1.monthly_Salary();
		
		
		
		
	}
	
}
