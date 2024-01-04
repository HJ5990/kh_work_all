package test0822;
import java.io.*;
import java.net.*;

public class TCP_Server {
	public static void main(String[] args) {
			
		
		int port = 3000;
		ServerSocket server;
		
		try {
			server = new ServerSocket(port);
			
			while(true) {
				Socket client = server.accept();
			}
	
		
		
		} catch(IOException e) {
			e.printStackTrace();
		} 
		
		
	}
}
