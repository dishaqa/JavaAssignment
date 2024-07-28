package Array;

import java.util.Scanner;

public class Assignment39_CheckGivenNumberisPartofArray {

	public static void main(String[] args) {
		int rollno[] = new int[4];
		rollno[0]=100;
		rollno[1]=200;
		rollno[2]=300;
		rollno[3]=400;
		
		
		Scanner s1 = new Scanner(System.in);
		int a= s1.nextInt();
		for (int i=0;i<4;i++)
		{
			
			if (a==rollno[i])
			{
				System.out.println("given number is part of Array At the index position "+i);
			}
			
			else 
			{
				System.out.println("given number is not part of Array");
			}
			s1.close();
		}

	}

}
