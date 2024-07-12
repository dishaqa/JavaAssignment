package Assignments;

public class Assignment7_globalvariable {
	// global variable : scope is within whole class
	int a=10;
	int b=20;	
	static double c;
	void add()
	{
		int sum = a+b;
		System.out.println("first number" + a );
		System.out.println("second number" + b );
		System.out.println("total of two number ="+sum);
		
		
	}

	public static void main(String[] args)
	{
		Assignment7_globalvariable a1 = new Assignment7_globalvariable();
		a1.add();
		System.out.println("global variable use inside the main method with default value of double: value is"+ c);
	}

} 