package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection2 {

	public static void main(String[] args)
	{
		Collection c1 = new ArrayList();
		c1.add("Age");
		c1.add("Name");
		c1.add(39);
		c1.add(false);
		c1.add(8.8);
		System.out.println(c1);
		
		Iterator i1 = c1.iterator();
		
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		System.out.println(c1.size());
		
		boolean b1 = c1.contains("DIsha");
				System.out.println(b1);
	}

}
