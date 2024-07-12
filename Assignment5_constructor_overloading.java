package Assignments;

public class Assignment5_constructor_overloading
{
	Assignment5_constructor_overloading()
	{
		System.out.println("Non Parameterized constructor");
	}
	
	Assignment5_constructor_overloading(int a)
	{
		System.out.println("Parameterized constructor "+a);
	}
	
	Assignment5_constructor_overloading(int a,char b, boolean c)
	{
		System.out.println("Parameterized constructor "+a+" "+ b +" "+ c);
	}
	
	public static void main(String[] args)
	{
		new Assignment5_constructor_overloading();
		new Assignment5_constructor_overloading(10);
		new Assignment5_constructor_overloading(10,'R',true);
	}

}
