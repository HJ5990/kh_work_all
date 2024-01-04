package javaTest;
import java.io.*;

public class InoutTest {
	public static void main(String[] args) {
	      String filePath = "myFile.txt";
	  
	  try {
	     File file = new File(filePath);
	     boolean isFileCreated = file.createNewFile();
	     
	     if (isFileCreated) {
	        System.out.print("파일 생성 완료 : " + filePath);
	     } else {
	        System.out.print("파일 생성 실패");
	     }
	  } catch (IOException e) {
	     e.printStackTrace();
	  }
	  
	  try (OutputStream out = new FileOutputStream(filePath)) {
	     
	     //-----------------------
	     String data = "7";
	     out.write(data.getBytes());
	     //-----------------------
//	     out.close();         // 객체생성(길)을 try괄호안에서 생성했으면 코드끝나고 자동으로 닫아주기에 close 생략가능
	  } catch(IOException e) {
	     e.printStackTrace();
	  }
	  
	  try (InputStream in = new FileInputStream(filePath)){
	     
	     //-----------------------
	        int readByte = in.read();
	        System.out.println((char) readByte);
	        //-------------
	  } catch (IOException e) {
	     e.printStackTrace();
	  }
	  
	      
		      
	   
	}

}
