package MAP;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map=new HashMap<>();
		map.put(2, "Arun");
		map.put(4, "Praveen");
		map.put(6, "Sudhir");
		map.put(1, "Santhosh");
		map.put(8, "Bala");
		
		Set set=map.entrySet();
//		Iterator<Map.Entry<Integer,String>> ite=set.iterator();
//		while(ite.hasNext()) {
//		Map.Entry<Integer, String> ee=ite.next();
//		System.out.println(ee.getKey()+":"+ee.getValue());
		
		Iterator ite=set.iterator();
		while(ite.hasNext()) {
			Map.Entry<Integer, String> ee=(Map.Entry<Integer, String>)ite.next();
			System.out.println(ee.getKey()+":"+ee.getValue());
		
		}

	}

}
