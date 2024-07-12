package Assignments;

public class Assignment6_localvariable
{
	static void add()
	{
		// local variable example, scope is within the method only
		int a =10; 
		int b =20;
		int c = a+b;
		System.out.println("sum="+c);
	}
	public static void main(String[] args) 
	{
		
		add();
	}

}
