package multidimensional_Arrays;

// Try to debug the code
public class Minimum_number
{
	int a[][]= {{5,4,10},{3,6,9},{21,11,7}};
	
	int min_Num= a[0][0];
	
	public void Min_Num()
	{
		for (int i=0; i<3;i++)
		{
			for (int j=0; j<3;j++)
			{
				if(a[i][j]<min_Num)
				{
					min_Num=a[i][j];
				}
			}
		}
		
		System.out.println(min_Num);
	}
	
	public static void main(String []args)
	{
		Minimum_number mn= new Minimum_number();
		
		mn.Min_Num();
	}
}
