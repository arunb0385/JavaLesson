package MAP;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class IntEmp_Task1 {

	public static void main(String[] args) {
		Map<Integer,Employee> map=new HashMap<>();
		map.put(3,new Employee("Arun",10000,22,"Cuddalore"));
		map.put(5,new Employee("Santhosh",20000,23,"Chennai"));
		map.put(6,new Employee("Sudhir",30000,24,"Guduvancherry"));
		map.put(8,new Employee("Bala",40000,25,"Kodambakam"));
		map.put(10,new Employee("Praveen",50000,26,"T.Nagar"));
		
		Iterator<Map.Entry<Integer,Employee>> ite=map.entrySet().iterator();
		while(ite.hasNext()) {
			Map.Entry<Integer,Employee> e=ite.next();
			System.out.println(e.getKey() +" : "+e.getValue().EmpName);
		}

	}

}
class Employee{
	String EmpName;
	long Salary;
	int age;
	String Address;
 Employee(String name,long sla,int a,String add){
	 EmpName=name;
	 Salary=sla;
	 age=a;
	 Address=add;
 }
	
}