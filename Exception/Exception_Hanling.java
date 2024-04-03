package Exception;
import java.util.*;
class A{
	Scanner ss=new Scanner(System.in);
	String s;
	public void array() {
		int a[]=new int[5];
		try {
			for(int i=0;i<6;i++) {
				System.out.println(a[i]);
			}
		}
		catch(Exception e){
			System.out.println("array : "+e);
		}
		finally {
			System.out.println("Final Block");
		}
		
	}
	public void nullpointer() {
		
		try {
			
		System.out.println(s.length());
		}
		catch(Exception e) {
			System.out.println("string : "+e);
		}
	}
	public void Mismatch() {
		try {
		int a=ss.nextInt();
		}
		catch(Exception e) {
			System.out.println("Mismatch : "+e);
		}
	}
	public void reverse() {
		String s="java";
		System.out.print(s);
		System.out.println();
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}
}

public class Exception_Hanling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       A ob=new A();
       ob.array();
       ob.nullpointer();
       ob.Mismatch();
       ob.reverse();
	}

}
