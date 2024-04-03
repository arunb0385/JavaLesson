package Number_Task;
import java.util.*;
public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner ss=new Scanner(System.in);
       int num=ss.nextInt();
       int sum=0;
       for(int i=1;i<num;i++) {
    	   if(num%i==0) {
    		   sum=sum+i;
    	   }
       }
       if(sum==num) {
    	   System.out.println("The given number "+num+" is a perfect number");
       }
       else {
    	   System.out.println("The given number "+num+" is NOT a perfect number");
       }
      
	}
	

}

