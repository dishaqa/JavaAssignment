package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class List1 {

	public static void main(String[] args) 
	{
		List l1 = new ArrayList();
		//l1.add("Disha");
		l1.add(12);
		l1.add(30);
		l1.add(30); // duplicate
		//l1.add("");
		//l1.add(null); //null
		//l1.add(12.2);
		l1.add(800);
		l1.add(123);
		Collections.sort(l1);
		System.out.println(l1);

		Iterator i1 = l1.iterator();
		
		while (i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
		ListIterator i2 = l1.listIterator();
		// forward iteration
		System.out.println("Forwarward iteration");
		while(i2.hasNext())
		{
		System.out.println(i2.next());	
		}
		System.out.println("Backward iteration");
		// backward iteration
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
		
		
	}

}
