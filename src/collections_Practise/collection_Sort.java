package collections_Practise;

import java.util.ArrayList;
import java.util.Collections;


public class collection_Sort
{
	
	ArrayList<String> list= new ArrayList<String>();
	
	public static void main(String []args)
	{
		collection_Sort cs= new collection_Sort();
		cs.add_Names();
		
		Collections.sort(cs.list);
		
		System.out.println(cs.list);
		
		//sort in reverse order
		
		Collections.sort(cs.list, Collections.reverseOrder());
		
		System.out.println(cs.list);
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
}
