package Scanner_class;

import java.util.Scanner;

public class Assignment16_accept_two_numbers
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Please enter value of a:");
		int a = s1.nextInt();
		System.out.println("Please enter value of b:");
		int b = s1.nextInt();
		int c = a+b;
		System.out.println("sum of two number a+b is ="+c);
		int d = a-b;
		System.out.println("sbtraction of two number a-b is ="+d);
		int e = a*b;
		System.out.println("Multiplication of two number a*b is ="+e);
		int f = a/b;	
		System.out.println("division of two number a/b is ="+f);
		int g = a%b;
		System.out.println("Modulas(reminder) of two number a%b is ="+g);
		s1.close();
	}
	

}
