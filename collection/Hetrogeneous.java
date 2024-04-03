package collection;
import java.util.ArrayList;
import java.util.Iterator;

public class Hetrogeneous {
public static void main(String[] args) {
	ArrayList obj=new ArrayList();
	
	obj.add(11);
	obj.add(45);
	obj.add(21);
	obj.add(41);
	obj.add("Arun");
	obj.add(null);
	
	System.out.println(obj);
		

	  Iterator ite= obj.iterator();
	 
	  
	  while(ite.hasNext())	
	  {
		int rc=(Integer)ite.next();
		System.out.println(rc);
	  }
	  
}
} 

