package collections_Practise;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hash_Set_practise 
{
	public static void main(String []args)
	{
		Set<String> list=new HashSet<String>();
		
		//add values to Hashset
		
	 	list.add("Anubhav");
    	list.add("Prachi");
    	list.add("Anubhav");
    	list.add("sda");
    	list.add("Smita");
    	list.add("Milind");
    	list.add("Anubhav");
    	list.add("Prachi");
    	
    	//print hashset
    	
    	System.out.println(list);
    	
    	//Iterate through all elements
    	
    	Iterator it= list.iterator();
    	
    	while(it.hasNext())
    	{
    		System.out.println(it.next());
    	}
    	
    	System.out.println(list.size());
    	
    	//empty an hashset
    	
    	//list.removeAll(list);
    	
    	if(list.isEmpty())
    	{
    		System.out.println("list is empty");
    	}
    	
    	//create a new HashSet with same elements
    	
    	HashSet<String> list1= new HashSet<String>(list);
    	
    	//using clone method
    	
    	HashSet<String> list2= (HashSet<String>) list1.clone();
    	
    	System.out.println(list2);
    	
    	System.out.println(list2);
    	
    	//Create another hashset for comparison
    	
    	HashSet<String> st= new HashSet<String>();
    	HashSet<String> result_set= new HashSet<String>();
    	
    	st.add("Prachi");
    	st.add("Anubhav");
    	st.add("Smita");
    	st.add("Milind");
    	st.add("gygy");
    	st.add("ewrwe");
    	
    	//Compare list2 and st and put matching elements to another hashset
    	
    	for(String str:st)
    	{
    		if(list2.contains(str))
    		{
    			result_set.add(str);
    		}
    	}
    	
    	if(result_set.isEmpty())
    	{
    		System.out.println("result_set is empty");
    	}
    	else
    	System.out.println(result_set);
	}
	
	
}
