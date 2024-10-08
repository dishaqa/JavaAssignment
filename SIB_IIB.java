package Basic_java;

public class SIB_IIB
{
	static
	{
	System.out.println("SIB"); // will execute first
	}
	
	static
	{
		System.out.println("sib2");
	}
	
	static
	{
		System.out.println("sib3");
	} 
	
	public static void main(String[] args) 
	{
		System.out.println("main method"); // will execute second while SIB is present
	}

}
