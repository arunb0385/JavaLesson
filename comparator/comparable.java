package comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public  class comparable implements Comparable<comparable>{

	
	String Name;
	int age;
	long Place;
	comparable(String Name,int age,long Place){
		this.Name=Name;
		this.age=age;
		this.Place=Place;
	}
	
  public int compareTo(comparable o) {
	  if(age > o.age) {
		  return 1;
	  }
	  else if (age < o.age) {
		  return -1;
	  }
	  return 0;
  }
  
  
	public static void main(String[] args) {
		List <comparable>ob=new ArrayList<>();
		ob.add(new comparable("santhosh",3,20000));
		ob.add(new comparable("Yagii",2,30000));
		ob.add(new comparable("Bala",1,60000));
		ob.add(new comparable("Audhir",5,60000));
		ob.add(new comparable("Pravin",4,40000));
		
   Collections.sort(ob);
		
		Iterator<comparable> ite=ob.iterator();
		while(ite.hasNext()) {
			comparable e=(comparable)ite.next();
			System.out.println(e.Name+" "+e.age+" "+e.Place);
		}

	}

//	@Override
//	public int compare(Object o1, Object o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}



}

