package Scanner_class;

import java.util.Scanner;

public class Assignment24_Circumference_of_trapezium
{

	public static void main(String[] args)
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a = s1.nextInt();	
				
		System.out.println("Enter value of b");
		int b = s1.nextInt();
		
		System.out.println("Enter value of h");
		int h =s1.nextInt();
		
		double circum = (a+b)*h/2;
		System.out.println("Circumference of trapezium ="+circum );
		
		s1.close();
	}

}
