package collection;
import java.util.ArrayList;
import java.util.Iterator;
public class ConverObjToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList ob=new ArrayList();
		ob.add(14);
		ob.add(15);
		ob.add(16);
		ob.add(18);
		ob.add(54);
		ob.add(24);
		ob.add(null);
		ob.add("Arun");
		
		Iterator <Integer> ite=ob.iterator();
		
		while(ite.hasNext()) {
			int c=ite.next();
			System.out.println(c);
		}

	}

}
