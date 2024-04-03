package Thread;

public class Thread_Task2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Task1 ob1=new Task1();
		Task2 ob2=new Task2();
		
		
		ob1.start();
		ob1.setPriority(5);
		ob2.start();
	
		
		
	}
	

}
class Task1 extends Thread{
	int i,n=10;
	static int sum=0;
	public  void run() {
		System.out.println("odd numbers");
		for(i=1;i<=n;i++) {
		
			if(i%2!=0) {
				System.out.print(i+" ");
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sum+=i;
			}
		}
		System.out.println();
		System.out.println("Total of add number : "+sum);
	}
}

class Task2 extends Thread{
	int i,n=10;
	static int sum=0;
	
	public  void run() {
		System.out.println("Even numbers");
		for(i=1;i<=n;i++) {
			
			if(i%2==0) {
				System.out.print(i+" ");
				try {
					Thread.sleep(1800);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				sum+=i;
			}
		}
		System.out.println();
		System.out.println("Total of even number : "+sum);
		int add=Task1.sum+sum;
		System.out.println("Addition off Total number : "+add);
	}
}
