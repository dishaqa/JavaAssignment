package Scanner_class;

import java.util.Scanner;

public class Assignment17_Area_of_circle 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		final double pi =3.14;
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Radius of circle");
		int r = s1.nextInt();
		double radius = pi *r*r;
		
		System.out.println("Radius="+radius);
		s1.close();
	}

}
