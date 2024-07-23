package inheritance;
class Amazon
{
	static void loginwithmobileno()
	{
		System.out.println("Login with mobile number"); //non static method of parent
	}
	
	void registration()
	{
		System.out.println("Registration");//static method of parent
	}
	
}

public class Assignment25_Single_level_inheritance extends Amazon	
{
	void loginwithemail()
	{
		System.out.println("Login with email");//non static method of child
	}
	static void dataadd()
	{
		System.out.println("data add"); //static method of child
	}
	
	public static void main(String[] args)
	{
		dataadd();
		loginwithmobileno();
		Assignment25_Single_level_inheritance d1 = new Assignment25_Single_level_inheritance();
		d1.registration();
		d1.loginwithemail();
	}

}
