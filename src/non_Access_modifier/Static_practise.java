package non_Access_modifier;

//verify static variables and methods also comparison in static and instance variables

public final class Static_practise 
{
	 int a=2;
	static int sum;
	static int var=5;
	
	private  final int VARIABLE=15;// it is a private static constant
	
	final static String VARIABLE1;
	
	static
	{
		VARIABLE1="Geeks";
	}
	
	/*static void add()
	{
		sum=var*2;
		System.out.println(sum);
	}*/
	
	static void add()
	{	
		var=var+1;
		System.out.println(var);
	}
	
	public final void divide()
	{
		System.out.println("This method prints dividion of numbers");
	}

	public static void main(String []args)
	{
		
		add();
		System.out.println(var);
		
		
		
		Static_practise sp= new Static_practise();
		Static_practise sp1= new Static_practise();
		
		/*every object has its own copy of instance variable.here we have changed value of a for instance of sp object where as value 
		  of a remains same for sp1 object.*/
		
		sp.a=3;
		System.out.println(sp.a);
		System.out.println(sp1.a);		
		
		// here as we change value of var, its value for each object changes, thus it is same for objects.
		
		Static_practise.var= 10;
		
		System.out.println(sp.var);
		System.out.println(sp1.var);
		
		System.out.println(sp.VARIABLE);
		
		
	
	
	}

}
