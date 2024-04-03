 package Number_Task;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		int num=ss.nextInt();
		int count=0,temp=num,last,fact=1,sum=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		num=temp;
		while(num>0) {
			last=num%10;
			for(int i=1;i<=count;i++) {
				fact=last*fact;
			}
			sum=sum+fact;
			fact=1;
			num=num/10;			
		}
		num=temp;
		
		if(num==sum) {
			System.out.println(num+" is a Armstrong Number");
		}
		else {
			System.out.println(num+" is not a Armstrong Number");
		}

	}

}
