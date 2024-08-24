package Exception_handelling;

public class StringOutofBound
{

	public static void main(String[] args) 
	{
		
		String s1 = "Disha";
		String output1 = "";
		
		
		for 
		(int i=s1.length(); i>=0; i--) 
		{
			try
			{
			char c1 = s1.charAt(i);
			output1 =  output1 +c1;	
			}
			catch (java.lang.StringIndexOutOfBoundsException e)
			{
				System.out.println("Exception Handled");
			}
			
			
		}
		
			
		System.out.println("Reverse String--> "+ output1);
			
	}

}
