package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TsakString {
	

	public static void main(String[] args) {
		
      employee();
	}
	
	public static void employee() {
		Scanner scanner = new Scanner(System.in);	
		String input = scanner.next();
		Map <String,String> map= new HashMap<String,String>();
		
		String values = "/Name=\"Arun\"/Company=\"Uniq Technologies\"/Experience=\"2 years\"";
		
		String[] splits=values.split("/");
		
		   for (String pair : splits) {        
	            String[] keyValue = pair.split("=");
	           
	                String key = keyValue[0].replace("\"", "");
	                String value = keyValue[1].replace("\"", "");
	                map.put(key, value);
	            }
	        
			   if(map.containsKey(input)) {
				   String answer = map.get(input);
				   System.out.println(answer);
				 }
			   else
				   System.out.println("key not found");
		
	}
}



