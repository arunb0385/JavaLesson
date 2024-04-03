package Static;

public class StaticVar {

	public static void main(String[] args) {
		Parent ob1=new Parent();
		System.out.println(ob1.age);
		
		Child ob=new Child();
	ob.age=11;
//		System.out.println(ob.age);
		System.out.println(ob1.age);
	}

}

class Parent{
	char gender='M';
	static int age=50;
	void add() {
		System.out.println("Hii Father");
	}
}

class Child extends Parent{
	char gender = 'F';
	
	void add() {
		System.out.println("HII Mother");
	}
}