package inheritance_practise;

public class D2
{
	void shape()
	{
		System.out.println("shape of sqauare");
	}
	
	public static void main(String args[])
	{
		B d=new D1();
		d.shape();
		d.area();
		
		
		
		
		D1 d2= new D1();
		d2.shape();
		d2.volume();
		
		
		//D1 d3= new D2();
		
		
	}
}
