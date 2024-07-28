package supar_and_this_calling;

class parent_class
{
	void login()
	{
		System.out.println("login with email");
	}
}	

public class Assignment28_method_overloading_with_super extends parent_class
{
	void login()
	{
	System.out.println("login with mobile");
	super.login();
	
	}
	public static void main(String[] args)
	{
		//new Assignment28_method_overloading_with_super().login();
		Assignment28_method_overloading_with_super m1 =new Assignment28_method_overloading_with_super();
		m1.login();		

	}

}
