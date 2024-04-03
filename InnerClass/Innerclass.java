package InnerClass;

public class Innerclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob=new A();
		ob.show();
		A.B ob1=ob.new B();
           ob1.show();
           A.C ob2=new InnerClass.A.C();
           ob2.add();
           
//           A.C.add();
           }

}
class A {
	int a=10;
	public void show() {
		System.out.println("class A show");
	}
	class B {
		public void show() {
			System.out.println("inner class show");
		}
	}
	static class C {
		public static void add() {
			System.out.println("static inner class");
		}
	}
}