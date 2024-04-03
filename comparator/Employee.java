package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Employee {
     String EmpName;
     int EmpId;
     long Salary;
     Employee(String name,int id,long Salary){
    	 EmpName=name;
    	 EmpId=id;
    	 this.Salary=Salary;
     }
	public static void main(String[] args) {
		List<Employee> ob=new ArrayList<>();
		ob.add(new Employee("santhosh",3,20000));
		ob.add(new Employee("Yagii",2,30000));
		ob.add(new Employee("Bala",1,60000));
		ob.add(new Employee("Audhir",5,60000));
		ob.add(new Employee("Pravin",4,40000));
		
		Collections.sort(ob,new Comp());
		
		
		
		Iterator ite=ob.iterator();
		while(ite.hasNext()) {
			Employee e=(Employee)ite.next();
			System.out.println(e.EmpName+" "+e.EmpId+" "+e.Salary);
		}

	}

}
class Comp implements Comparator<Employee>{
	public int compare(Employee e,Employee ee) {
		
		if(e.EmpId>ee.EmpId)
			return 1;
		else 
			return -1;
		    //String contains compareTO method..
//		return e.EmpName.compareTo(ee.EmpName);
		
	}
}
