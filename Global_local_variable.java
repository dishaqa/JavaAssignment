package Basic_java;

public class Global_local_variable 
{
	static double pi = 3.14;
	int leap_yea_day = 366;
	public static void main(String[] args) 
	{
		
		System.out.println(pi);
		Global_local_variable v1 = new Global_local_variable(); // static variable
		System.out.println(v1.leap_yea_day); // glocal non static variable
	}

}
