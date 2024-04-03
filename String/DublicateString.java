package String;

import java.util.Scanner;

public class DublicateString {

	public static void main(String[] args) {
		
		
		Scanner ss=new Scanner(System.in);
		String rr=ss.next();
		for(int i=0;i<rr.length();i++) {
			char a=rr.charAt(i);
			boolean ap=true;
			for(int j=0;j<i;j++) {
				if(a==rr.charAt(j)) {
					ap=false;
					break;			                        
				}
			}
			if(ap) {
				int count=0;
				for(int j=0;j<rr.length();j++) {
					if(a==rr.charAt(j)) {
						count++;
					}
				}	
				System.out.println(a+" : "+count);
			}
			
		}

	}

}
