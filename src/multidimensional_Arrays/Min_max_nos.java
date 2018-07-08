package multidimensional_Arrays;

/* 5 4 10        5  4  10
 * 3 6  9        3  6  9
 * 2 7  1        21 11 7 */
 
//Print minimum noa in array and also print the max nos in the column having minimum number

public class Min_max_nos 
{
   int a[][]= {{5,4,10},{3,6,9},{21,11,7}};
	
	int min_Num= a[0][0];
	int row, col;
	int max_nos;
	
	public void Min_Num()
	{
		for (int i=0; i<3;i++)
		{
			for (int j=0; j<3;j++)
			{
				if(a[i][j]<min_Num)
				{
					min_Num=a[i][j];
					col=j; //col=2
					//row=i;
					
				}
			}
		}
		System.out.println("minimum nos is " + min_Num);
	}
	
	public void max_col_nos()
	{
		max_nos= a[0][col];
		
		for (int i=0; i<a.length; i++)
		{
					if(a[i][col]>=max_nos)
					{
						max_nos=a[i][col];//max no=9
						
					}
		}

		
		
		System.out.println("maximum nos in col of min mos is " +max_nos);
	}
	
	public static void main(String []args)
	{
		Min_max_nos mnx = new Min_max_nos();
		
		mnx.Min_Num();
		mnx.max_col_nos();
		
	}
}
