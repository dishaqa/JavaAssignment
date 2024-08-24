package Type_Casting;

class parent
{
	static void parentadd()
	{
		System.out.println("Parent class static method add");
	}
	static void parentsub()
	{
		System.out.println("Parent class static method sub");
	}

	void parentmul()
	{
		System.out.println("Parent class non static method mul");
	}


	void parentdiv()
	{
		System.out.println("Parent class non static method div");
	}
	
}

public class Assignment_51_upcasting extends parent
{
	
	static void add()
	{
		System.out.println("child class static method add");
	}
	static void sub()
	{
		System.out.println("child class static method sub");
	}

	void mul()
	{
		System.out.println("child class non static method mul");
	}


	void div()
	{
		System.out.println("child class non static method div");
	}
	

	public static void main(String[] args) 
	{
		parent p1 = new Assignment_51_upcasting();
		//parent p1 = new Assignment_51_upcasting(); // Upcasting
		parentadd();
		p1.parentmul();
		p1.parentdiv();
		parentsub();
		
		Assignment_51_upcasting c1 = (Assignment_51_upcasting) p1; // down casting
		c1.div();
		c1.mul();
		add();
		sub();
		
		c1.parentdiv();
		c1.parentmul();
		parentadd();
		parentsub();
		
		
		
		
		
	}

}
