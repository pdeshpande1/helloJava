package Inheritance_diff_pkg;

import inheritance_practise.*;
import construct_demo.Child_demo;

//Try to create objects for the inherited classes for imported package and verify concept of inheritance outside declared pkg

public class Inherit_diff_pkg extends Fulltime_employee
{
	public Inherit_diff_pkg() {
		System.out.println("Inherit_diff_pkg Constr");
	}
	public void add()
	{
		System.out.println("This methd adds");
	}
	
	public static void main (String []args)
	{
		//parttime_Emloyee p2 = new Fulltime_employee();
		Inherit_diff_pkg ip= new Inherit_diff_pkg();
		Child_demo cd= new Child_demo();
	
		//parttime_Emloyee ip1= new Inherit_diff_pkg();
		
		Fulltime_employee ip2= new Inherit_diff_pkg();
		//ip1.supclass();
		ip2.baseclass();
		ip2.Employee_id();
		ip2.fireme();
		ip2.fulltime_emp();
		ip2.hireme();
		ip2.monthly_Salary();
		ip2.supclass();
		ip2.total();
		cd.getdata();
	
		
		//main(null);
		
		/*ip1.Employee_id();
		ip1.fireme();
		ip1.fulltime_emp();
		ip1.hireme();ip1.monthly_Salary();
		ip1.supclass();
		ip1.supclass();
		ip1.total();*/
		
       // p2.tax_pay(); //tax pay method is declared as protected. So it cant be accessed in this class unless it is a derived class
		
	}
}
