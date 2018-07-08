package string_practise;

//validate string prenet on webpage
// payment $100 done- verify if $ is present in the sentence
//String is an predefined class in java. Once all packages for java are installed we get access to string class and its methods.
public class practise1_validatestring 

{  
	 public static void main(String[] args)
	 {
		 String str1="PAYMENT $100 DONE";
		 String str ="payment $100 done "; //str is variable/object defined under String class.
		 String str2;
	    //String str1=new String ("payment $100 done");  //conventional way of declaring object            
		 System.out.println(str.length());//here we can directly access all methods under string class.Such way of creating object is only valid for string class
		 System.out.println(str.substring(4, 15));   
		 System.out.println(str.substring(10));
		 System.out.println(str.trim());
		 System.out.println(str.charAt(17));
		 //str2=str.charAt(17);
		 System.out.println(str.toUpperCase());
		 System.out.println(str.toUpperCase());
	 }
	 
}

