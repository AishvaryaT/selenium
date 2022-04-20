package Vector;
import java.util.ListIterator;
import java.util.Vector;

public class ClassB {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
Vector vList = new Vector();
vList.add('0');
vList.add('1');
vList.add('2');
vList.add('3');

ListIterator lItr = vList.listIterator();
while(lItr.hasNext())
{
	System.out.println(lItr.next());
	
	}
System.out.println("------------------");
while(lItr.hasPrevious())
{
	System.out.println(lItr.previous());
}


}
}

