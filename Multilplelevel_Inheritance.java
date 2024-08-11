package Interface;

interface A
{
	void add();
	void sub();
	
}
interface B
{
	void mul();
	void div();
}
public class Multilplelevel_Inheritance implements A,B
{
	public void mul() 
	{
		int a =10;
		int b =20;
		int mul = a*b;
		System.out.println("Multiplication "+ mul);
		
	}

	
	public void div() 
	{
		int c =100;
		int d =154003;
		double div = d/c;
		System.out.println("Division "+ div);
		
	}

	
	public void add() 
	{
		int a =10;
		int b =20;
		int add = a*b;
		System.out.println("addition "+ add);
		
	}

	
	public void sub()
	{
		int a =10;
		int b =20;
		int sub = b-a;
		System.out.println("Substraction"+ sub);
		
	}

	public static void main(String[] args)
	{
		Multilplelevel_Inheritance p1 = new Multilplelevel_Inheritance();
		p1.add();
		p1.sub();
		p1.mul();
		p1.div();

	}

	
	

}
