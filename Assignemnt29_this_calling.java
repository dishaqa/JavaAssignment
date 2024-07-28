package supar_and_this_calling;


public class Assignemnt29_this_calling 
{
	Assignemnt29_this_calling()
	{
		this(4);
		System.out.println("this is 1");
	}
	
	Assignemnt29_this_calling(int a)
	{
		this(22.2,33.3);
		System.out.println("this is 2");
	}
	
	Assignemnt29_this_calling(double b,double c)
	{
		
		System.out.println("this is 3");
	}

public static void main(String[] args) 
{
	new Assignemnt29_this_calling();
}
}

