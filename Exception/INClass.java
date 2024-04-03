package Exception;
import java.util.*;

public class INClass {
              String s;
              
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		
      System.out.println("Hii");
      int b=ss.nextInt();
      try {
      int a=10/b;
     
      System.out.println(a);
      }
      catch(ArithmeticException e){
    	  System.out.println("ArithmeticException");    	  
    }
//      try {
//    	  INClass ob=new INClass();
//    	  System.out.println(ob.s.equals(54));
//      }
//      catch(NullPointerException e) {
//    	  System.out.println("NullPointerException");
//      }
//      catch(InputMismatchException e) {
//    	  System.out.println("MisMAtch");
//      }
//      catch(Exception e) {
//    	  System.out.println("Exception Occurs"+e);
//      }
      finally{
    	  System.out.println("End Game");
      }
      
      System.out.println("I am Arun");
     
	}

}
