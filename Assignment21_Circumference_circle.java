package Scanner_class;

import java.util.Scanner;

public class Assignment21_Circumference_circle 
{

	public static void main(String[] args) 
	{
		final double pi =3.14;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Radius of circle");
		int r = s1.nextInt();
		double circumference = 2*pi*r;
		
		System.out.println("area of circle is="+circumference);
		s1.close();
	}

}
