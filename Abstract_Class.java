package Abstratction;
abstract class Grand_Parent //abstract class
{
	 abstract void add();
	 abstract void substraction();
	 static void multi()
	 {
		 int a =10;
		 int b= 20;
		 System.out.println(a*b);
		 
	 }
}
class parent extends Grand_Parent	// con class
{
	 static void div()
	 {
		 int a =10;
		 int b= 20;
		 System.out.println(b/a);
		 
	 }
	void add() 
	{
		int a =10;
		int b= 20;
		System.out.println(b+a);
		
	}
	void substraction() 
	{
	
		int a =10;
		int b= 20;
		System.out.println(b-a);
	}
}

public class Abstract_Class extends parent // con class
{
	
	public static void main(String[] args)
	{
		parent p1 = new parent();
		p1.add();
		p1.substraction();
		div();
		multi();
		
		

	}

}
