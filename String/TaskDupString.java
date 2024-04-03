package String;

public class TaskDupString {

	public static void main(String[] args) {
		
      show();
      dup();
	}
	
//	public static void show() {
//		String[] values = {"Arun","Santhosh","Sudhir","Bala","Arun","Bala"};
//		
//		for(int i=0;i<values.length;i++) {
//			int count=1;
//			for(int j=i+1;j<values.length;j++) {
//				if(values[i]==values[j]) {
//					count++;
//				}
//				
//			}
//			System.out.println(values[i]+" : "+count);
//		}
//	}
//
//}
	
	
	public static void show() {
		int i;
		String[] values = {"Arun","Santhosh","Sudhir","Bala","Arun","Bala"};
		for(i=0;i<values.length;i++) {
			String a=values[i];
			boolean ap=true;
			for(int j=0;j<i;j++) {
				if(a==values[j]) {
					ap=false;
					break;
				}
			}
			if(ap) {
				int fry=0;
				for(int j=0;j<values.length;j++) {
					if(a.equals(values[j])) {
						fry++;
					}
				}
				System.out.println(a+" : "+fry);
			}
		}
	}
	
	public static void dup() {
		
		String values="uniqTechnologies";
		
		for(int i=0;i<values.length();i++) {
			char a=values.charAt(i);
			boolean ap=true;
			for(int j=0;j<i;j++) {
				if(a==values.charAt(j)) {
					ap=false;
					break;			                        
				}
			}
			if(ap) {
				int count=0;
				for(int j=0;j<values.length();j++) {
					if(a==values.charAt(j)) {
						count++;
					}
				}	
				System.out.println(a+" : "+count);
			}
			
		}
	}
	
	public static void taska22b11() {
		String values = "aa2b1c1d1ee2ff2g1h1kkk3";
		String 
	}
}
