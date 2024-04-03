package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Homogeneous {

	public static void main(String[] args) {
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(40);
		obj.add(null);
		
		System.out.println(obj);
		
		Iterator  it=obj.iterator();
		
		while(it.hasNext()) {
			//System.out.println(it.next());
			
			int ir=(Integer)it.next();
			
		}

	}

}
