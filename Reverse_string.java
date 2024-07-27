package String_functions;

public class Reverse_string {

	public static void main(String[] args) {
		String name = "SOHAM";
		String output ="";
		for (int i=name.length()-1;i>=0;i--)
		{
		char a1 = name.charAt(i);
		//System.out.print("the character at index "+i +" is-->");
		output=output+a1;
		
		}
		System.out.println(output);
	}

}
