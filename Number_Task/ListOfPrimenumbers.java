package Number_Task;

import java.util.ArrayList;

public class ListOfPrimenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	for(int i=1;i<=100;i++) {
		int count=0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
				count++;
			}
		}
		if(count==2) {
			  System.out.print(i+" ");			
		}
		
	}
				  
}

}
