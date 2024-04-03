package String;

import java.util.Arrays;

public class Task_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Task_1 ob=new Task_1();
	ob.oneByOne();
	ob.replace();
	ob.printStar();
  }
	public void oneByOne() {
		String a="hii hello how are you?";
		
		String s[]=a.split(" ");
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
	  }
	}
	public void replace() {
		String s="Terrorist";
		System.out.println("Replace of Terrorist to "+s.replaceAll("r","d"));
	}
	public void printStar(){
		String s="arunb0385@gmail.com";
		String a[]=s.split("@");
		for(int i=0;i<a.length-1;i++) {
			String c=a[i];
		System.out.print(c.replaceAll("[a-z0-9]", "*")); 
			
		} 
		for(int j=a.length-1;j>0;j--) {
			System.out.print("@"+a[j]);
		}
	}
	

}
