package FileHandling;

import java.io.File;
import java.io.IOException;

public class File_Handling {
	
  public static void main(String[] args) throws IOException {
	
	  File ob=new File("C:\\Users\\Arun\\Desktop\\CoreJava\\1");
	  ob.mkdir();
	  
	  File ob1=new File("C:\\Users\\Arun\\Desktop\\CoreJava\\1\\java.pdf");
	  ob1.createNewFile();
	
	 
  }
}
