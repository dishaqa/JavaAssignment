package Collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Enumeration1
{

	public static void main(String[] args) 
	{
		Vector v1 = new Vector();
		v1.add(10);
		v1.add("soham");
		v1.add("zebra");
		v1.add(null);
		v1.add(33.3);
		
		
		//-----  check vector class can be iterated using Enumeration
		Enumeration e = v1.elements();
		System.out.println("using Elements-->");
		while (e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		
		//=== check if the vector class can be iterated using iterator
		
		Iterator i1 = v1.iterator();
		System.out.println("using Iterator-->");
		
		while (i1.hasNext())
		{
			System.out.println( i1.next());
		}
		
		// ------ check the vector class using list of iterator----
		
		ListIterator L1 = v1.listIterator();
		System.out.println("using List Iterator-->");
		while(L1.hasNext())
		{
		System.out.println(L1.next());
		}
		
		}

	}


