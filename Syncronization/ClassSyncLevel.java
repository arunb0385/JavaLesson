package Syncronization;

public class ClassSyncLevel {

	public static void main(String[] args) {
		
		//In this method we can't create object for ShredClass.

		SThreadClass1 t1 = new SThreadClass1();
		SThreadClass1 t2 = new SThreadClass1();
		
		SThreadClass2 t3 = new SThreadClass2();
		SThreadClass2 t4 = new SThreadClass2();
		
		t1.start();
		t2.start();

		t3.start();
		t4.start();
	}

}

class SSharedClass{
	public static synchronized  void sharedClass() {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
	}
}

class SThreadClass1 extends Thread{
	
	public void run() {
		SSharedClass.sharedClass();
	}
}

class SThreadClass2 extends Thread{
	
	public void run() {
		SSharedClass.sharedClass();
	}
}
