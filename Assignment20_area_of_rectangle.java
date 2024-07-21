package Scanner_class;

import java.util.Scanner;

public class Assignment20_area_of_rectangle
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter length of rectangle");
		double length =s1.nextDouble();
		System.out.println("enter breth of rectangle");
		double breth =s1.nextDouble();
		
		double area = length*breth;
		
		System.out.println("area of rectangle:" + area);
		s1.close();
	}

}
