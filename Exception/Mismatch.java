package Exception;
import java.util.*;

class B extends A{
	Scanner ss=new Scanner(System.in);
	 int a;
	 int b;
	public void add() {
		while(true){
		try {
			 a=ss.nextInt();
			 b=ss.nextInt();
			 int c=a/b;
				System.out.println(c);
				break;
			}
		catch(InputMismatchException e) {
			System.out.println("Enter the Value Integer Type ");
			ss.next();
		    }
		catch(ArithmeticException e) {
			System.out.println("Enter the Value above zero");
			ss.next();
		   }	
	 }
  }
}
public class Mismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       B ob=new B();
       ob.add();
       ob.reverse();
	}

}
