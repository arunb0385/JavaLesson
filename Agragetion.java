interface Game{
	void up();
	void down();
	void left();
	void right();
}

class Mario implements Game{
	
	
	public void up() {
		System.out.println("Mario up");
	}	
	public void down() {
		System.out.println("Mario down");
	}
	public void left() {
		System.out.println("Mario left");
	}
	public void right() {
		System.out.println("Mario right");
	}
}

class PacMan implements Game{
	
	
	public void up() {
		System.out.println("PacMan up");
	}	
	public void down() {
		System.out.println("PacMan down");
	}
	public void left() {
		System.out.println("PacMan left");
	}
	public void right() {
		System.out.println("PacMan right");
	}
}

class Cantra implements Game{
	public void up() {
		System.out.println("Cantra up");
	}	
	public void down() {
		System.out.println("Cantra down");
	}
	public void left() {
		System.out.println("Cantra left");
	}
	public void right() {
		System.out.println("Cantra right");
	}
}


class GameRunner{
	Game obj;
	 GameRunner(Game ob) {
		obj=ob;
	}
	 void runGame() {
		 obj.up();
		 obj.down();
		 obj.left();
		 obj.right();
	 }
	
}

public class Agragetion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mario obj1 = new Mario();
		Game obj2 = new PacMan();
		Game obj3 = new Cantra();
		
		GameRunner ob1=new GameRunner(obj3);
		
		ob1.runGame();
	}

}
