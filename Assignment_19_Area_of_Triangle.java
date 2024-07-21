package Scanner_class;

import java.util.Scanner;

public class Assignment_19_Area_of_Triangle 
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("Enter Hight");
		double hight = s1.nextDouble();
		System.out.println("Enter base");
		double base = s1.nextDouble();
		
		double area = (base*hight)/2;
		System.out.println("Area of Triangle is = "+area);
		
		s1.close();

	}

}
