package non_Access_modifier;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import construct_demo.Child_demo;

public class Date_class extends Child_demo
{	
	
	public static void main(String []args)
	{
		Date d= new Date();
		//Date_class dc= new Date_class();
		
		System.out.println(d.toString());
		
	    Calendar cal = Calendar.getInstance();
			
	
		SimpleDateFormat sdf = new SimpleDateFormat("    mm/dd/yyyy hh:mm:ss");
		String date=sdf.format(d); 
		
		System.out.println(date);
		System.out.println(Calendar.DAY_OF_MONTH);
		System.out.println(Calendar.DAY_OF_YEAR);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.getTime());
		System.out.println(cal.get(Calendar.AM_PM));

		Date_class dc=new Date_class();
		dc.getdata();
	
		
		
	}
	

}
