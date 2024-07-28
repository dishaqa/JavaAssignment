package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment38_TakeArrayFromScannerClass {

	public static void main(String[] args) 
	{
		double rollno[] = new double[4];
		Scanner s1 = new Scanner(System.in);
		
		for (int i=0;i<rollno.length; i++)
		{
		System.out.println("enter value of rollno "+(i+1));
		rollno[i] = s1.nextDouble();
		}
		
		System.out.println(Arrays.toString(rollno));
		s1.close();
	}

}
