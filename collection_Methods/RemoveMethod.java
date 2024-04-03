package collection_Methods;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveMethod {

	public static void main(String[] args) {
		ArrayList<String> ob=new ArrayList<String>();
		ob.add("Grapes");
		ob.add("Mango");
		ob.add("Apple");
		ob.add("Orange");
		ob.add("Papaya");
		ob.add("Mango");
		
		ArrayList<String> ob1=new ArrayList<String>();
		ob1.add("Grapes");
		ob1.add("one");
		ob1.add("Two");
		ob1.add("Three");
		ob1.add("Mango");
		
		ob.addAll(ob1);
		ob.removeAll(ob1);         
		
		Iterator ite=ob.iterator();
		while(ite.hasNext())
			System.out.println(ite.next());

	}

}
