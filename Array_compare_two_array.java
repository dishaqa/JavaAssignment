package Array;
import java.util.Arrays;
public class Array_compare_two_array
{

	public static void main(String[] args)
	{
		int rollno1[]=new int[4];
		int rollno2[]= new int[4];
		
		rollno1[0]=14;
		rollno1[1]=15;
		rollno1[2]=16;
		rollno1[3]=17;
		rollno2[0]=14;
		rollno2[1]=15;
		rollno2[2]=16;
		rollno2[3]=171;
		
		boolean b1 = Arrays.equals(rollno1, rollno2);
		
		if (b1 == true)
		{
			System.out.println("Given Arrays are equal");
			System.out.println(b1);
		}
		
		else
		{
			System.out.println("something is wrong");
			System.out.println(b1);
		}
		
	}
}
