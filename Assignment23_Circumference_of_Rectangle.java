package Scanner_class;

import java.util.Scanner;

public class Assignment23_Circumference_of_Rectangle 
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter length of rectangle");
		double length =s1.nextDouble();
		System.out.println("enter breth of rectangle");
		double breth =s1.nextDouble();
		
		double circm = 2*(length+breth);
		
		System.out.println("Circumference of Rectangle:" + circm);
		s1.close();

	}

}
