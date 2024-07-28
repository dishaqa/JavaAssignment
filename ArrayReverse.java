package Array;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args)
	{
		double oldarray[] =new double[3];
		double reverse_array[]=new double[3];
		
		oldarray[0]=12123;
		oldarray[1]=5879;
		oldarray[2]=78797;
		int k =0;
		for (int i=oldarray.length-1;i>=0;i--)
		{
			reverse_array[k] = oldarray[i];
			k++;
			//System.out.println(k);
		}
		System.out.println("OlsArray:"+Arrays.toString(oldarray));
		System.out.println("Reverse Array:"+Arrays.toString(reverse_array));
	}

}
