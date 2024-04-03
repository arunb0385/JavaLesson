package InnerClass;

public class AnonymusInnerClass {

	public static void main(String[] args) {
		
		Anony ob=new Anony()
		{
			public void show() {
				System.out.println("Anonymus Inner class show");
			}
		};
		ob.show();

	}

}

class Anony {
	public void show() {
		System.out.println("class A show");
	}
}