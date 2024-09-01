package Polimorphysm;




public class Compile_time_polymorphysm 
{
	// Compile_time_polymorphysm  is method overloading
	static void add()
	{
		System.out.println("message from add without parameterised");
	}
	
	static void add(int a)
	{
		System.out.println("message from add with parameterised static method");
	}
	
	void add(int a, char c)
	{
		System.out.println("message from add with parameterised non static method");
	}

	public static void main(String[] args)
	{
		add();
		add(10);
		
		Compile_time_polymorphysm  c1 = new Compile_time_polymorphysm();
		c1.add(15, 'c');
	}

}
