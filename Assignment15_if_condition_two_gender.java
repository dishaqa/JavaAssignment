package Assignments;

public class Assignment15_if_condition_two_gender 
{
	
	public static void main(String[] args)
	{
		char gen1 = 'M';
		int age;
		age =59;
		
		if (gen1 == 'F')
		{
			System.out.println("Travelling is free in the bus");
		}
		else
		{
			if (age<=12)
			{
				System.out.println("Ticket will be half");
			}
			else if (age>12 && age<=59)
			{
				System.out.println("Full ticket");
			}		
			else
			{
				System.out.println("Seniour sitizen ticket");
			}
		}
	}

}
