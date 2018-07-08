//Important interview program
//REverse string and reverse each word of string

package string_practise;
import java.util.Scanner;


public class pratise_reversestring 
{
    
	public static void main (String[] args)
	{
		String str,rev="";
		int j, i;
		boolean o;
		
		@SuppressWarnings("resource")
		Scanner in= new Scanner(System.in); //'in' is an object of scanner class
		
		System.out.println("Please enter the line/string");
		str= in.nextLine(); //this method accepts input on ne line
	    //str=in.next() ;// this method accepts the input on same line 
	    //System.out.println("The entered line is "+str);
		
		j= str.length();
		
		//reverse the input string
		/*here charAt(i)fetches the character at given index. + is used to concatenate all characters.
		if not used every time characters will get replaced in rev string. */
		
		for (i=j-1;i>=0;i--)
		{
			rev= rev + str.charAt(i);
			
		}
		
		System.out.println("The reverse of input string is ="+rev);
		
		o= str.contentEquals(rev);
		if (o==true)
		
		{
			System.out.println("The input string is palindrome");
		}
		else
			{
			System.out.println("The input string is not palindrome");
			}
			
	}
}
