package string_practise;
import java.util.Scanner;

//To print the index of a given number

public class practise_Printindexnos
{
	 int s[]={10,20,3,9,8,5};
	 int x;
	
	

	public static void main(String[] args)
	{
	    //System.out.println("The array numbers are 3,5,8,9,10,20");
	    System.out.println("Please enter a number to find index position");
	    practise_Printindexnos pi= new practise_Printindexnos();
	    Scanner sc= new Scanner (System.in);
	    pi.x= sc.nextInt();
	    sc.close();
	    
	    //System.out.println("The entered number is " + pi.x);
	    pi.indexof_Nos();
	    
	    
	}

	  public void indexof_Nos ()
	  {
		  int i=0;
		  int flag=-1;
		  
		  for(i=0;i<s.length;i++)
		  {
			  if(x==s[i])
			  {
				  flag=i;
				  break;
			  } 
			  
		  }
		  
		  if (flag!=-1)
		  {
			  System.out.println("The index of given number is " + flag);
		  }
		  else{  System.out.println ("Sorry number not found");}
	  }
	  
}
