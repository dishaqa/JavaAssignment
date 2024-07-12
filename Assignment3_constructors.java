// Assignment 3 constructors
package Assignments;

public class Assignment3_constructors
{
	//non parameterize constructor
	Assignment3_constructors()
	{
		System.out.println("this is non parameterize constructor");
	}
	
	//parameterize constructor
	Assignment3_constructors(int a)
	{
		//a=2;
		System.out.println("this is number "+a+" , this is parameterize constructor");
	}

	public static void main(String[] args)
	{
		new Assignment3_constructors(); // call non parameterize constructor
		new Assignment3_constructors(2);
	}

}
