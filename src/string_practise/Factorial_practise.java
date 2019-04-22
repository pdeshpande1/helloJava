package string_practise;

public class Factorial_practise 
{
	int n;
	int sum=0;
	
	public int fact(int n)
	{
		if (n==0)
		 return 1;
		 
		 else return n*fact(n-1);
	}
	public static void main(String args[])
	{
		Factorial_practise fp= new Factorial_practise();
		System.out.println(fp.sum= fp.fact(5));	
	}
}
