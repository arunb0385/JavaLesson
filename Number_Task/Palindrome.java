package Number_Task;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malayalam";
		int i;
		String s1=" ";
		
		
		for( i=s.length()-1;i>=0;i--) {			
			s1=s1+s.charAt(i);			
		}
		if(s.equals(s1)) {
			System.out.println("The given string is palindrome");
		}
		else {
			System.out.println("The given string is not a palindrome");
		}			
	}
}


