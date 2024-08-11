package Exception_handelling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner_Class_Exception_handelling_InputMismatch 
{

	public static void main(String[] args)
	{
		
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter your Age");
		try 
		{
		int age = s1.nextInt();
		}
		
		catch (InputMismatchException a1)
		{
			System.out.println("Hey please check the input and add it properly");
			Scanner s2 =new Scanner(System.in);
			int age = s2.nextInt();
			//s2.close();
		}
		Scanner s3 =new Scanner(System.in);
		System.out.println("Enter your Name");
		String name = s3.next();
		
	}

}
