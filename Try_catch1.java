package Exception_handelling;

public class Try_catch1 {

	public static void main(String[] args) 
	{
		try
		{
			int c= 1/0;
			System.out.println(c);
		}
		
		catch (ArithmeticException a1)
		{
			System.out.println("Exception Handelling done" );
		}

	}

}
	