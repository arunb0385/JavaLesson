package FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Create_a_file {

	public static void main(String[] args) throws IOException {
		File f=new File("D:\\hello");
		
		
		System.out.println(f.getAbsoluteFile());
		
		System.out.println(f.getAbsolutePath());
		
		
		
		System.out.println(f.createNewFile());
		
		System.out.println(f.canRead());
		
		

	}

}

