package collections_Practise;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hash_practise 
{
	//declare an arraylist variable
	
    ArrayList<String> list= new ArrayList<String>();
    HashMap<Integer,String> map=new HashMap<Integer, String>();
    int flag;
    
    //add names in arraylist
    
    public static void main(String args[])
    {
    	Hash_practise hp =new Hash_practise ();
    	hp.add_Names();
    	hp.verify_Duplicates();
    	hp.display_Names();
    	
    }
    
    void add_Names()
    {
    	list.add("Anubhav");
    	list.add("Prachi");
    	list.add("Anubhav");
    	list.add("sda");
    	list.add("Smita");
    	list.add("Milind");
    	list.add("Anubhav");
    	list.add("Prachi");
    	
    	
    }
    
    void verify_Duplicates()
    {
       int i,j;
       int size= list.size();
       System.out.println(size);
       
       for(i=0;i<size;i++)
       {
    	   
    	   
    	   flag=0;
    	   
    	   for(j=i+1;j<size;j++)
    	   {
    		   if(list.get(i).equals(list.get(j)))
    		   {
    			 flag++;   
    		   }
    	   }
    	   if(flag>0)
    	   {
    		   String str=list.get(i);
    		   map.put(flag, str);
    		   System.out.println(str);
    		   System.out.println(flag);
    	   }
    	   
       }
    }
    
   void display_Names()
   {
	  for(Map.Entry m:map.entrySet())
	  {
		  System.out.println(m.getValue()+" "+ m.getKey());
	  }
   }
}
