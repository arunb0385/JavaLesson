package Number_Task;

public class Xylem {

	public static void main(String[] args) {
		
      int a[]= {3,2,3,4,6};
      xylem(a);
	}
static void xylem(int a[]) {
	int n=a.length;
	int sum1=0;
	int sum2=a[0]+a[n-1];
      for(int i=1;i<n-1;i++) {
    	  sum1+=a[i];  	 
      }
      if(sum1==sum2) {
    	  System.out.println("Given array is xylem");
      }
      else
    	  System.out.println("Given array is phloem");
}
	
}
