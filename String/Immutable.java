package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class KeyValuePair {
    private String key;
    private String value;

    public KeyValuePair(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}

public class Immutable  {
    public static void main(String[] args) {
        String values = "/Name=\"Arun\"/Company=\"Uniq Technologies\"/Experience=\"2 years\"";

        // Split the string by "/"
        String[] pairs = values.split("/");

        // Create a map to store key-value pairs
        Map<String, String> keyValueMap = new HashMap<>();

        // Loop through the pairs
        for (String pair : pairs) {
            // Split each pair by "="
            String[] keyValue = pair.split("=");
            if (keyValue.length == 2) {
                // Extract key and value (removing surrounding double quotes)
                String key = keyValue[0].replaceAll("\"", "").trim();
                String value = keyValue[1].replaceAll("\"", "").trim();

                // Store the key-value pair in the map
                keyValueMap.put(key, value);
            }
        }
        for (Map.Entry<String, String> entry : keyValueMap.entrySet()) {
            if (entry != null) {
                // Example usage: printing the key-value pairs
//                System.out.println("Key: " + pair.getKey() + ", Value: " + pair.getValue());
            Scanner ss = new Scanner(System.in);
            
            String answer=ss.next();
           
            
            if (keyValueMap.containsKey(answer)) {
                // Retrieve and print the corresponding value
                String value = keyValueMap.get(answer);
                System.out.println(answer + ": " + value);
            } else {
                // Print an error message if the entered key does not exist
                System.out.println("Key not found!");
            }
            
            
            
//            if(answer.equals("Name")) {
//				System.out.println(entry.getValue());
//			}
//			else if(answer.equals("Company")) {
//				System.out.println(entry.getValue());
//			}
//			else if(answer.equals("Experience")) {
//				System.out.println(entry.getValue());
//			}
//			else {
//				System.out.println("results not found");
//		  }
            }
        }
    }
}
