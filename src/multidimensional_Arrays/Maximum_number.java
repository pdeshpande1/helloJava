package multidimensional_Arrays;

public class Maximum_number
{
    int a[][]= {{5,4,10},{3,6,9},{21,11,7}};
	
	int max_Num= a[0][0];
	
	public void Max_Num()
	{
		for (int i=0; i<3;i++)
		{
			for (int j=0; j<3;j++)
			{
				if(a[i][j]>max_Num)
				{
					max_Num=a[i][j];
				}
			}
		}
		
		System.out.println(max_Num);
	}
	
	public static void main(String []args)
	{
		Maximum_number mn= new Maximum_number();
		
		mn.Max_Num();
	}
}
