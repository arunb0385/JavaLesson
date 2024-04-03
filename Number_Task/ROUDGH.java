package Number_Task;

public class ROUDGH {
	public static void main (String [] args) {
		
		for(int i=1;i<=10;i++) {
			int count=0;
			for(int j=1;j<=10;j++) {
				if(i%j==0) {
					count++;
				}			
			}
			if(count==2) {
				System.out.print(i+" ");
				count=0;
			}
		}
	}

}
