package LOOP;

public class RightangleTriangle {

	public static void main(String[] args) {
	    int i,ch=97,temp=0,n=5;
         for(i=1;i<=n;i++) {
        	 temp=i;
        	 for(int j=1;j<=i;j++) {
        		 if(i%2==0) {
        			 System.out.print(((char)(ch+temp-j))+"  ");
        			 temp--;
        		 }
        		 else {
        			 System.out.print((char)(ch));
        			 ch++;
        		 }
        	 }
         }
	}

}
