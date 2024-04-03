package Thread;

class A extends Thread{

	public void run() {
		
			System.out.println(3/0);
			
		
	}
}
class B extends Thread{
	public  void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("World...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}

public class TEL {

	public static void main(String[] args) throws InterruptedException  {
		
		A ob1=new A();
		B ob2=new B();
			
		ob1.start();
		ob1.join();
		ob2.start();
		
		
		
	}


}
