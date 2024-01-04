package test0822;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Output {
	public static void main(String[] args) {
		
		FileWriter fw = null;
		
		try {
			
			fw = new FileWriter("text.txt");
			fw.write(97);
			fw.write(65);
			fw.flush();
			fw.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		
		
	}

}
