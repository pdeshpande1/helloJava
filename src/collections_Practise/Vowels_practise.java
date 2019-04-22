package collections_Practise;

import java.util.HashMap;

public class Vowels_practise 
{
	String str="This is India";
	String vow = "aeiou";
	//String vow[]={"a","e","i","o","u"};
	
	HashMap<String,Integer> vowels= new HashMap<String,Integer>();
	
	public void add()
	{
		vowels.put("a", 0);
		vowels.put("e", 0);
		vowels.put("i", 0);
		vowels.put("o", 0);
		vowels.put("u", 0);
		System.out.println(vowels);
	}
	
	
	public void Vowels()
	{
		String str1= str.toLowerCase();
		
		for (int k=0; k<=str.length()-1;k++)
		{
			for (int j=0; j<vow.length();j++)
			{
				String s = Character.toString(str1.charAt(k));
				
				if(s==vow) //vow.indexOf(str1.charAt(k)) < 5
				{
				
					//int v = vowels.get(s);
					//vowels.put(s, v++);
					vowels.put(s, vowels.get(s)+1);
					System.out.println(vowels);
				}
		   }
	}
}
		
	public static void main(String []args)
	{
		Vowels_practise vp= new Vowels_practise();
		vp.add();
		vp.Vowels();
		
	}
}
