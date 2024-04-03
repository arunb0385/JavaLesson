package Thread;

public class Thread_task1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       Flying ob1=new Flying();
       Diving ob2=new Diving();
       Laughing ob3=new Laughing();
       Running ob4=new Running();
       Hide ob5=new Hide();
       Collect ob6=new Collect();
       Shoot ob7=new Shoot();
       Win ob8=new Win();
       Emote ob9=new Emote();
       
       ob1.start();
       ob1.join();
       ob2.start();
       ob2.join();
       ob3.start();
       ob3.join();
       ob4.start();
       ob4.join();
       ob5.start();
       ob5.join();
       ob6.start();
       ob6.join();
       ob7.start();
       ob7.join();
       ob8.start();
       ob8.join();
       ob9.start();
       
	}

}
class Flying extends Thread{
	public void run() {
		for(int i=1;i<=1;i++) {
		
			System.out.println("Flying");
		}
	}
}
class Diving extends Thread{
	public void run() {
		for(int i=1;i<=1;i++) {
			System.out.println("Diving");
		}
	}
}
class Laughing extends Thread{
	public void run() {
		for(int i=1;i<=1;i++) {
			System.out.println("Laughing");
		}
	}
}
class Running extends Thread{
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Running");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
class Hide extends Thread{
	public void run() {
		for(int i=1;i<=1;i++) {
			System.out.println("Hiding");
		}
	}
}
class Collect extends Thread{
	public void run() {
		for(int i=1;i<=7;i++) {
			System.out.println("Collecting Arms");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Shoot extends Thread{
	public void run() {
		for(int i=1;i<=30;i++) {
			System.out.println("Shooting");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Win extends Thread{
	public void run() {
		for(int i=1;i<=1;i++) {
			System.out.println("Winning");
		}
	}
}
class Emote extends Thread{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("Emote");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


