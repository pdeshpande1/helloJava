//Duplicate words in string and their occurences


package string_practise;
import java.util.ArrayList;
import java.util.Scanner;

public class duplicate_words
{
     String str="";
     String dup= new String(""); //str and dup object of string class
     
     public static void main(String []args)
     {     
        duplicate_words dw= new duplicate_words();
        Scanner in= new Scanner(System.in);//in is an object of scanner class
        System.out.println("Please enter the string");
        dw.str=in.nextLine(); //Scan the user input via in object of scanner class and put it to str
        in.close();    
        ArrayList<String> myWord = dw.split_string();
        dw.find_duplicate(myWord);
     }
     
     public ArrayList<String> split_string()
     {
    	 int i,j;
    	 String word="";
    	 
    	 
    	 j=str.length(); //here str is instance variable which can be accessed in nonstatic method.
    	 ArrayList<String> arrayOfWords = new ArrayList<String>();
    	 //List<Integer> arrayOfNum = new ArrayList<Integer>();
    	
    	
    	    //int k=0;
    	    for (i=0; i<j; i++)
    	    {
    	    	word=word + str.charAt(i);     //bread and bread
    	    	if ((str.charAt(i) == ' ')||(i==j-1))// here to verify white space'' is used."" means empty string
    	    	{
    			 arrayOfWords.add(word);
    			// k++;
    			 word ="";
    	    		
                }
        	 }   	
    	    //System.out.println(arrayOfWords);//It returns identity of array rather than its contents.
    	      //System.out.println(arrayOfWords.toString());
    	      
    	      return arrayOfWords;
		 
     }
     
     public void find_duplicate(ArrayList<String> myWord)
     {
    	 int i,j,k;
    	 k= myWord.size();
		 //System.out.println(k);
    	 
    	 for(i=0; i<k;i++)
    	 {
    		// System.out.println("in code");
    		 for(j=i+1;j<k; j++) //bread and butter
    		 {
    			 String a = myWord.get(i).trim();
    			 String b = myWord.get(j).trim();
    			 if(a.equals(b))
    			 {
    				 System.out.println(b);
    				 System.out.println("in code");
    			 }
    		 }
    	 }
    	 
     }
	
}
