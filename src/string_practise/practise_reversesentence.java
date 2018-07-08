// Reverse words in a sentence

/*package string_practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class practise_reversesentence 
{
    String word="";
    ArrayList<String> arrayOfWords= new ArrayList<String>();
    ArrayList<String> revSent=new ArrayList<String>();
   
    
    public static void main(String[] args)
    {
    	practise_reversesentence pr= new practise_reversesentence ();
    	System.out.println("Please enter any sentence");
    	
    	Scanner in= new Scanner(System.in);
    	pr.word=in.nextLine(); //as word is a instance variable declared in class, we need object of class to pass input to variable.
    	in.close();
    	//String word=in.nextLine();//here word is not declared in class not instance variable, so we directly declared and passed input to it.we didnt need object of class to access it. 
    	pr.revSentence(); //if word had been local variable we had to pass it to method
    	
    }
    
    public void revSentence()
    {
    	int i,j,k;
    	
    	
    	String myWord[]= word.split(" "); //split returns string array, so define myWord as string array
    	//String revSent[] =new String[9];
    	
    	System.out.println("The input statement is "+word);
    	
    	//Convert string array myWord to array list type
    	
       arrayOfWords=new ArrayList<String>(Arrays.asList(myWord));//(ArrayList<String>) converts myWord String array to Array list
       k=arrayOfWords.size();
    	
    	for(i=k-1;i>=0;i--)
    	{
    		
    		revSent.add(arrayOfWords.get(i));	    		
    	}
    	 	
    	String myWord1[] = revSent.toArray();
    	
    	System.out.println("The reverse of input statement is"+myWord1);
    	
    }
    
}*/
