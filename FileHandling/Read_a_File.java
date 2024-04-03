package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_a_File {

	public static void main(String[] args) throws FileNotFoundException {
		
		File f=new File("D:\\sample.doc");
		
		Scanner ss=new Scanner(f);
		while(ss.hasNextLine()){
			String s1=ss.nextLine();
			System.out.println(s1);
		}
		ss.close();

	}
}
