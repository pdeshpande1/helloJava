package collections_Practise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linked_list_practise 
{
   public static void main(String []args)
   {
	   LinkedList<String> list = new LinkedList<String>();
	   
	list.add("Anubhav");
   	list.add("Prachi");
   	list.add("Anubhav");
   	list.add("sda");
   	list.add("Smita");
   	list.add("Milind");
   	list.add("Anubhav");
   	
   	System.out.println(list);
   	
   	//Iterate through all elements with for each loop

   	for (String ls:list)
   	{
   		System.out.println(ls);
   	}
   	
	//Iterate through all elements with iterator
   	
   	Iterator<String> it= list.iterator();
   	
   	while(it.hasNext())
   	{
   		System.out.println(it.next());
   	}
   	
   	//sort in reverse order
   	
   	Collections.sort(list, Collections.reverseOrder());
   	System.out.println(list);
   	
   	list.offerFirst("aaa");
   	list.addLast("ccc");
   	System.out.println(list);
   	
   	
   	//Verify if any particular element exists in Linked list
   	
   	if(list.contains("Smita"))
   	{
   		System.out.println("List contains Smita");
   		System.out.println(list.indexOf("Anubhav"));
   		System.out.println(list.lastIndexOf("Anubhav"));
   	}
   	//convert linked list to arraylist
   	
   	ArrayList<String> str= new ArrayList<String>(list);
   	System.out.println(str);
   	
   	if(str.isEmpty())
   	{
   		System.out.println("ArrayList is empty");
   	}
   	else
   		System.out.println(str);
   }
}
