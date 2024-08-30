package Collection;
import	java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;

public class Collection1 
{

	public static void main(String[] args)
	{
	Collection c1 = new ArrayList();

	c1.add("Age");
	c1.add("Name");
	c1.add("Name");
	c1.add("Name");
	c1.add(null);
	c1.add(null);
	c1.add(null);
	c1.add(39);
	c1.add(false);
	c1.add(8.8);
	
	System.out.println(c1);
	
	
	
	Collection c2 = new ArrayList();
	c2.add("Rice");
	c2.add("Sugar");
	c2.addAll(c1);
	System.out.println(c2);
	
	boolean b1 = c2.equals(c1);
	System.out.println(b1);
	
	boolean b2 = c1.isEmpty();
	System.out.println(b2);
	
	//c1.clear();
	//System.out.println(c1);
	
	boolean b3 = c2.containsAll(c1);
	System.out.println(b3);
			
	c1.remove(39);
	System.out.println(c1);
	
	c2.removeAll(c1);
	System.out.println(c2);
	
	c1.clear();
	System.out.println(c1);
	
	c1.add(39);
	c1.add(39); // check duplicates are accepting
	c1.add("disha");
	c1.add(""); // check accepting NULL
	c1.add("");
	System.out.println(c1); // check order of insertion
	
	}
	
	
	

}
