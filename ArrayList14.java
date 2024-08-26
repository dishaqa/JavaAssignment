package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Stack;
import java.util.Vector;

public class ArrayList14 
{
	public static void main(String[] args)
	{
		
		// chck Array list Properties 
		ArrayList a1 = new ArrayList();
		a1.add(134);
		a1.add(12); // order of insertion - yes
		a1.add(12); // check duplicate accept - yes
		a1.add("fdfsd");// check hetrogenious - yes
		a1.add(null); //accepting null - yes
		a1.add(null);
		a1.add(null);
		System.out.println(a1);
		ListIterator i2 = a1.listIterator(); // List of iterator 
		//----------------vector------------------------------------------------
		
		Vector v1 = new Vector();
		v1.add(32); // order of insertion - yes
		v1.add(100);
		v1.add(100); // check duplicate accept - yes
		v1.add("fgfgrrtuu"); // check hetrogenious - yes
		v1.add(null);//accepting null - yes
		v1.add(null);
		v1.add(null);
		v1.add(true);
		v1.addElement(123);
		System.out.println(v1);
		
		//----------------LinkedList------------------------------------------------
		
		LinkedList l1 = new LinkedList();
		
		l1.add(45);// order of insertion - yes
		l1.add(200);
		l1.add(200);// check duplicate accept - yes
		l1.add("fdsfsd");
		l1.add(null);
		l1.add(null);
		l1.add(null);//accepting null - yes
		System.out.println(l1);
		
		
		//----------------------------Stack------------------------
		
		Stack s1 = new Stack();
		s1.add(45);// order of insertion - yes
		s1.add(200);
		s1.add(200);// check duplicate accept - yes
		s1.add("fdsfsd");
		s1.add(null);
		s1.add(null);
		s1.add(null);//accepting null - yes
		System.out.println(s1);
		
		//----------
		
		
		
		
		
	}
}
