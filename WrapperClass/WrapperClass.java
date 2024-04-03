package WrapperClass;

public class WrapperClass {

	public static void main(String[] args) {
		int a=10;
		Integer b=a; //data type to object autoBoxing
		System.out.println(b);
		
		int c=b;  //Object to data type autoUnboxing
		System.out.println(c);
		
		Integer d=(Integer)c;  //Boxing
		System.out.println(d);
		
		int e=(int)d;
		System.out.println(e);  //Unboxing
		

	}

}
