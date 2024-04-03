
public class CopyConstructor {

	public static void main(String[] args) {
		A ob=new A();
		B ob1=new B(ob);
        ob1.ob.add();
        ob1.ob.sub();
	}
	
}
class A{


	void add(){
		System.out.println("hii");
		
	}	
	void sub() {
		System.out.println("hello");
	}

}
class B{
       A ob;
	B(A ob) {
		this.ob=ob;         
		
	}
	void div() {
		
		ob.add();
		ob.sub();
	}

}
