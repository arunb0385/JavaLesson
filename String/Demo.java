package String;


 class Human{
		private static String name;
		private static int age;
		
//		public String getname() {
//			return name;
//		}
//		public int getage() {
//			return age;
//		}
		public  void setname(String s) {
			name=s;
			System.out.print(name+":");
			
		}
		public void setage(int age) {
	 this.age=age;
	 
	 
		}
	
	
}

public class Demo {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human ob=new Human();
		ob.setname("Navin");
		
	ob.setage(44);
	System.out.print(ob.setage());

//		System.out.println(ob.getname()+":"+ob.getage());

//		ob.setage(22);
		
		

	}

}
