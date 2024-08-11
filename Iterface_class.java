package Interface;

interface GrandParent
{
	void method1();
	void method2();
}

abstract class parent_class implements GrandParent
{
	static void method3()
	{
		System.out.println("method3");
	}
	void method4()
	{
		System.out.println("method4");
	}
	
}
public class Iterface_class extends parent_class
{
	public void method1() 
	{
		System.out.println("method1");
		
	}
	
	public void method2()
	{
		System.out.println("method2");
		
	}

	public static void main(String[] args)
	{
		Iterface_class p1 = new Iterface_class();
		p1.method1();
		p1.method2();
		method3();
		p1.method4();
		
		
	}
}
