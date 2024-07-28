package supar_and_this_calling;

class A
{
	A()
	{
		System.out.println("A");
	}
 }

class c extends A
{
	c(int a, int b)
	{	
		super();
		System.out.println("C");
	}
}

public class Assignment27_super_calling extends c
{
	Assignment27_super_calling()
	{
		//Super calling statement can be called implicitly and explicitly, explicitly in case of parameterized and implicitly in case of non parameterized
		super(10,10); 
	}
	public static void main(String[] args)
	{
		System.out.println("this is main method");
		new Assignment27_super_calling();

	}

}
