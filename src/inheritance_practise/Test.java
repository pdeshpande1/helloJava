package inheritance_practise;

public class Test
{
		
		 public static void main(String []args)
		{
		   /* parttime_Emloyee pe1= new parttime_Emloyee();
			employee pe2= new parttime_Emloyee();
			employee pe3=new employee();*/
			
			
			/*pe1.Employee_id();
			pe1.monthly_Salary();
			
			pe2.Employee_id();
			pe2.monthly_Salary();
			
			pe3.monthly_Salary();
			
			Fulltime_employee p1 = new Fulltime_employee();
			parttime_Emloyee p2 = new parttime_Emloyee();
			parttime_Emloyee p3= new Fulltime_employee();
	It is required to create an object with base class return reference when we can access base class methods with derived class own object		
			
			p1.hireme();//derived class cannot access private methods
			p2.hireme();
			parttime_Emloyee.tax_pay();*/
			
			//create object of base class reference
			
			parttime_Emloyee p2 = new Fulltime_employee();
			Fulltime_employee f= new Fulltime_employee();
			
			
			
			
			System.out.println(p2.sum= (p2.a+p2.b));
			
			p2.monthly_Salary();
			f.baseclass();
			p2.tax_pay();
			p2.supclass();
			p2.total();
			
			
			
			f.monthly_Salary();
			f.fireme();
			
			//employee e1= new employee();
			//e1.monthly_Salary();
			
			
			
			
			
			//Can access instance variable of parent class using object reference of child class Inside static methods.
		}

}