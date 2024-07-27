package String_functions;

public class Palindrom_string 
{

	public static void main(String[] args) 
	{
		
		String name;
		name="MOM";
		String output="";
		
		for(int i=name.length()-1;i>=0;i--)
		{
			char c1 = name.charAt(i);
			output = output+c1;
		}
		
		//System.out.println(output);
		if(name.equals(output))
		{
			System.out.println("The given name "+ name +" is palindrom");
		
		}
		
		else
		{
			System.out.println("The given name "+ name +" is not palindrom");
		}
		
	}

}
