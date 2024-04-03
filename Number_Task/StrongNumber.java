package Number_Task;
import java.util.*;
public class StrongNumber {

	public static void main(String[] args) {            
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		int num=ss.nextInt();
		int temp = num;
		int last,fact,sum=0;
		while(num>0) {
			last=num%10;
			System.out.println(last);
			fact=1;
			for(int i=1;i<=last;i++) {
				fact=fact*i;
				System.out.println(fact);
			}
			sum+=fact;
			num/=10;
		}
		num = temp;
		if(num==sum) {
			System.out.println(num+" is a Strong number");
		}else {
			System.out.println(num+" is not a strong number");
		}
		

	}

}
