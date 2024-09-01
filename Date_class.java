package Date_class;

import java.util.Date;

public class Date_class
{

	public static void main(String[] args)
	{
	Date d1 = new Date();
	long date1 = d1.getTime();
	System.out.println(date1);
	
	Date d2 = new Date();
	String s1= d2.toString();
	System.out.println(s1);
	String month = s1.substring(4, 7);
	System.out.println("Month --> "+ month);
	
	String date2 = s1.substring(8, 10);
	System.out.println("Date --> "+ date2);
	
	String year = s1.substring(s1.length()-4);
	System.out.println("Year --> "+ year);
	
	String dateformate1 = date2.concat(month).concat(year);
	System.out.println(dateformate1);
	
	String dateformate2 = date2.concat("/").concat(month).concat("/").concat(year).concat("/");  
	System.out.println(dateformate2);
	
	Date_class d9 = new Date_class();
	System.out.println(d9.getClass());
	
	}

}
