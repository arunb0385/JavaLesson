package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Write_a_File {

	public static void main(String[] args) throws IOException {
		FileWriter fw=new FileWriter("D:\\sample.doc");
		
		fw.write("hii i'm aurn");
		fw.write("\ni'm from cuddalore");
		fw.close();

	}

}
