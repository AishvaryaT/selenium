package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		
		list.add(10);   //  0  ---index
		list.add(11);   //  1
		list.add(13);   //  2
		list.add(12);   //  3
		list.add(14); 
		System.out.println(list+"new list");
		
		System.out.println(list.get(2));
		list.add(4,200);    //here we add 200 so after the index of 2 all var shift right side 
		System.out.println(list);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
  //Iterator it=list.iterator();
		//while(it.hasNext())
		//{
			//.out.println(it.next());
		}

	}

//}
