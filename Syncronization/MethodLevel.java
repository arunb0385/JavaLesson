package Syncronization;

public class MethodLevel {
	public static void main(String[] args) {
		
		//Creating object for shared class
		// In this method we can create another object for SharedClass.To solve 
		//this problem we can use static synchronized method.
		SharedClass s1 = new SharedClass();
		
		ThreadClass1 t1 = new ThreadClass1(s1);
		ThreadClass1 t2 = new ThreadClass1(s1);
		
		ThreadClass2 t3 = new ThreadClass2(s1);
		ThreadClass2 t4 = new ThreadClass2(s1);
		
		t1.start();
		t2.start();

		t3.start();
		t4.start();
	}

}

class ThreadClass1 extends Thread{
	
	SharedClass instance;
	
	public ThreadClass1(SharedClass instance) {
		this.instance = instance;
	}
	
	public void run() {
		instance.sharedClass();
	}
}

class ThreadClass2 extends Thread{
	
    SharedClass instance;
	
	public ThreadClass2(SharedClass instance) {
		this.instance = instance;
	}
	
	public void run() {
		instance.sharedClass();
	}
}
class SharedClass{
	public synchronized  void sharedClass() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
}
