package Polimorphysm;
//run_time_polimerphism   is method overriding
// only non static method will override
// same method with same signature with different implementation
class method1
{
	void add(int a, int b)
	{
		System.out.println("do addition");
	}
	
	void mul(int c, int d)
	{
		System.out.println("do multiplication");
	}
}

public class run_time_polimerphism extends method1
{
	void add(int a, int b)
	{
		super.add(20, 20);
		a =10;
		b=20;
		
		int c = a+b;
		System.out.println("addition="+c);
	}
	
	void mul(int c, int d)
	{
		super.mul(555, 78);
		c=10;
		d=5;
		int e = c*d;
		System.out.println("Multilication="+e);
	}
	
	public static void main(String[] args) 
	{
		run_time_polimerphism r1 = new run_time_polimerphism();
		r1.add(10, 30);
		r1.mul(12, 30);
		

	}

}
