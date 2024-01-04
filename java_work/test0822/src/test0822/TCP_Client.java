package test0822;
import java.io.*;
import java.net.*;
import java.nio.file.attribute.DosFileAttributes;

public class TCP_Client {
	public static void main(String[] args) {
	
		int port = 3000;
		String serverIP;
		
		try {
			serverIP = "192.168.20.34";
		
			Socket socket = new Socket(serverIP, port);
		
		} catch(IOException e) {
			e.printStackTrace();
		} 
	}
}
