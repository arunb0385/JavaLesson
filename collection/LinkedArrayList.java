package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class LinkedArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> obj=new ArrayList<Integer>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(40);
		obj.add(null);
		
		System.out.println(obj);
		
		Iterator<Integer> it=obj.iterator();
		
		
			ListIterator<Integer> iti=obj.listIterator(obj.size());
			while(iti.hasPrevious()) {			
				System.out.println(iti.previous());
			}

	}

}
