package Vector;

import java.util.ListIterator;
import java.util.Vector;

public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector vList = new Vector();
		vList.add('A');
		vList.add('B');
		vList.add('C');
		vList.add('D');
		
	ListIterator lItr = vList.listIterator();
	
	while(lItr.hasNext());
	{
		System.out.println(lItr.next());
	}
	System.out.println("---------------------------------");
	
	while(lItr.hasPrevious())
	{
		System.out.println(lItr.previous());
	}
	
	
	}
	}



