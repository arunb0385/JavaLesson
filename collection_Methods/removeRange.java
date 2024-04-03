package collection_Methods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class removeRange {

	public static void main(String[] args) {
		ArrayList<Integer> ob=new ArrayList<>();
		ob.add(20);
		ob.add(30);
		ob.add(40);
		ob.add(50);
		ob.add(60);
		ob.add(10);
		
	   
		Iterator ite=ob.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}

	}

}
