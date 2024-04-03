package Array;
import java.util.*;

class A{
	
     int a[]= {5,4,8,2,4,6};
     
	int i;
	int j;
	int noOfTimes=1;
	public void original() {	
	for( i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	}
//	public void right() {
//		for(i=0;i<noOfTimes;i++) {
//			int lastindex=a[a.length-1];
//			for( j=a.length-1;j>0;j--) {
//				a[j]=a[j-1];
//			}
//			a[0]=lastindex;
//		}
//		System.out.println();
//		for(int k=0;k<a.length;k++) {
//			System.out.print(a[k]+" ");
//		}
//		System.out.println();
//	}
	public void left() {
		for(i=0;i<noOfTimes;i++) {
			int firstindex=a[0];
	        for(j=0;j<a.length-1;j++) {
	        	a[j]=a[j+1];
	        }
	        a[a.length-1]=firstindex;
		}
		System.out.println();
		for(int k=0;k<a.length;k++) {
			System.out.print(a[k]+" ");
		}
	}
}

public class R_Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob1=new A();
		ob1.original();
		//ob1.right();
		ob1.left();

	}

}
