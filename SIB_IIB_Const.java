package Basic_java;

public class SIB_IIB_Const

{
	static    //SIB
	{
	System.out.println("SIB");
	}
	SIB_IIB_Const()       	//constructor
	{
	System.out.println("Constructor");
	}
	SIB_IIB_Const(int a)       //constructor
	{
	System.out.println("Constructor 1");
	}
	{                    //IIB
	System.out.println("IIB");
	}
	{                    //IIB
	System.out.println("IIB 2");
	}
	public static void main(String[] args) 
	{
	System.out.println("main method");
	new SIB_IIB_Const();
	new SIB_IIB_Const(1);
	}
	

}
