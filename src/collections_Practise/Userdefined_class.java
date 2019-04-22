package collections_Practise;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.ListIterator;




public class Userdefined_class 
{
    public static void main(String []args)
    {
    	Student s= new Student("Swati",1,100);
    	Student s1= new Student("Prachi",2,100);
    	Student s2= new Student("Anibhav",3,100);
    	
    	ArrayList<Student> al=new ArrayList<Student>();
    	
    	al.add(s);
    	al.add(s1);
    	al.add(s2);
    	
    	//System.out.println(al);
    	
    	//TRaversing through arraylist
    	
    	/*Iterator<Student>itr=al.iterator();
    	
    	while(itr.hasNext())
    	{
    		Student st=itr.next();
    		System.out.println(st.marks+" "+st.name+" "+st.roll_No);
    	}*/
    	for(Student st:al)
    	{
    		System.out.println(st.marks+" "+st.name+" "+st.roll_No);
    	}
    	
    	/*ListIterator<Student> itr=al.listIterator();
    	
    	while(itr.hasPrevious())
    	{
    		Student st=itr.previous();
    		System.out.println(st.marks+" "+st.name+" "+st.roll_No);
    	}*/
    	
    	for (int i=0;i<al.size();i++)
    	{
    		System.out.println(al.get(i));
    	}
    }
}
