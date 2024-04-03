package String;

public class B {
 public static void main(String[] args) {
	String s="aaaa";
	int count;
	for(int i=0;i<s.length();i++) {
		count=1;
		for(int j=i+1;j<s.length();j++) {
			if(s.charAt(i)==s.charAt(j)) {
				
				System.out.println(s.charAt(i)); 
			  break;
				
			}
		}
		
	}
	
	 
 }
}
				





//String s="java";
//int count=0;
//for(int i=0;i<s.length();i++) {
//	for(int j=i+1;j<s.length();j++) {
//		if(s.charAt(i)==s.charAt(j)) {
//			count++;
//		}
//	}
//	
//}
//System.out.println(count);