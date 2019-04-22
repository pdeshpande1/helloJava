package collections_Practise;

import java.util.ArrayList;
import java.util.ListIterator;
//import java.util.LinkedList;

public class Student1
{
	public static void main(String []args)
	   {
		   ArrayList<String> list = new ArrayList<String>();
		   
		list.add("Anubhav");
	   	list.add("Prachi");
	   	list.add("Anubhav1");
	   	list.add("sda");
	   	list.add("Smita");
	   	list.add("Milind");
	   	list.add("Anubhav");
	   	
	   	System.out.println(list);
	   	
	   	
	   		
	   		//System.out.println(list.get(2));
	   		
	   		ListIterator <String> itr= list.listIterator();
	   		
	   		while(itr.hasNext())
	   		{
	   			System.out.println(itr.next());
	   		}
	   		
	   		
	   		while(itr.hasPrevious())
	   		{
	   			System.out.println(itr.previous());
	   		}
	   	
	   }
	
	
	   	
}
