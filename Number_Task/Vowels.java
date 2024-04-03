package Number_Task;

import java.util.Scanner;

public class Vowels {
	public static void main(String[] args) {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the String");
		String name=ss.nextLine();
		vowels(name);
		
	}
	public static void vowels(String name) {
		
		name=name.toLowerCase();
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.println(ch);
			}
		}
	}

}
