package inheritance_practise;


public class D1 extends B
{
	final int a;
	
	void shape()
	{
		System.out.println("Shape of triangle");
	}
	
	void volume()
	{
		
		System.out.println("class D1");
	}
	
	D1()
	{
		a=0;
		System.out.println("In D1");
	}
	D1(int x)
	{
		a=x;
		System.out.println(a);
		
	}
	
	public static void main(String args[])
	{
		B dew =new D1();
		D1 d1= new D1(10);
	    
		
		
	}
	
	
	
}

