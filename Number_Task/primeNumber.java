package Number_Task;
import java.util.*;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
        int num=ss.nextInt();
       int count=0;
       for(int i=1;i<=num;i++) {
        if(num%i==0) {
        	count++;
        }         
       }
   //    System.out.println(count);
        if(count==2) {
        	System.out.println("The given number "+num+" is a prime number");
        }
        else {
        	System.out.println("The given number "+num+" is NOT a prime number");
        }
	}

}
