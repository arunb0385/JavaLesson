package InnerClass;

public class abstracAnonymusClass {

	public static void main(String[] args) {
		Abs ob=new Abs()
		{
			void show() {
				System.out.println("override the abstract method");
			}
			public void sub() {
				System.out.println(20-10);
			}
		};
		ob.show();
		ob.add();
		ob.sub();

	}

}

abstract class Abs {
	abstract void show();
	
	void add() {
		System.out.println(10+10);
	}
	public abstract void sub();
}