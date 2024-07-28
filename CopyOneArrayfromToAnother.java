package Array;

import java.util.Arrays;

public class CopyOneArrayfromToAnother {

	public static void main(String[] args) {
	double esalary[] =new double[3];
	double msalary[]=new double[3];
	
	esalary[0]=12123;
	esalary[1]=5879;
	esalary[2]=78797;
	
	for (int i=0;i<3;i++)
	{
		msalary[i] = esalary[i];
	}
	System.out.println(Arrays.toString(msalary));
	}

}
