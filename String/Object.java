package String;

public class Object {
	int rollno;
	String name;
	public Object(int rollno,String name) {
		this.rollno=rollno;
		this.name=name;
	}
	public String toString() {
		return(name+":"+rollno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Object ob=new Object(6,"Arun");
		System.out.println(ob);
		

	}

}
