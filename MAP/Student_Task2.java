package MAP;
import java.util.Map;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Iterator;

public class Student_Task2 {

	public static void main(String[] args) {
		
		Map<Integer,Student> map=new HashMap<>();
		
		while(true) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Press 1 to add value");
		System.out.println("Press 2 to view value");
		System.out.println("Press 3 to Exit");
		int a=ss.nextInt();
				
		
		
		if(a==1) {
		String name=ss.next();
		int age=ss.nextInt();
		String add=ss.next();
		char grade=ss.next().charAt(0);
		map.put(1, new Student(name,age,add,grade));		
		}		
		else if(a==2) {
			Iterator<Map.Entry<Integer,Student>> ite=map.entrySet().iterator();
			while(ite.hasNext()) {
			 Map.Entry<Integer,Student> e=ite.next();
   		     System.out.println(e.getKey()+" : "+e.getValue().StdName);
			}
		}
		else if(a==3)
			break;
		}			
	}
}
class Student{
	String StdName;
	int age;
	String Address;
	char Grade;
	Student(String name,int age,String add,char G){
		this.StdName=name;
		this.age=age;
		this.Address=add;
		this.Grade=G;
	}
}