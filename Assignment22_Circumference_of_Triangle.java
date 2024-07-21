package Scanner_class;

import java.util.Scanner;

public class Assignment22_Circumference_of_Triangle {

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter value of a");
		int a = s1.nextInt();	
				
		System.out.println("Enter value of b");
		int b = s1.nextInt();
		
		System.out.println("Enter value of c");
		int c =s1.nextInt();
		
		double circum = a+b+c;
		System.out.println("Circumference of Triangle ="+circum );
		
		s1.close();
	}

}
