package com.kh.TCP_test;
import java.io.*;
import java.net.*;

public class TCP_Client {
	public static void main(String[] args) {
		System.out.println("client start");
		
		try {
			Socket socket = new Socket(InetAddress.getByName("localhost"), 5000);  // (ip(=127.0.0.1), 포트)  // 던지는 순간 연결됨
			System.out.println("서버접속완료");
			System.out.println("접속서버IP : " + socket.getInetAddress().getHostAddress());
			
			// input, output
			InputStream is = socket.getInputStream(); 
			BufferedInputStream br = new BufferedInputStream(is);
			DataInputStream dis = new DataInputStream(br);
			
			OutputStream os = socket.getOutputStream();
			BufferedOutputStream bos = new BufferedOutputStream(os);
			DataOutputStream dos = new DataOutputStream(bos);
			
			dos.writeUTF("안녕하세요");
			dos.flush(); 
			String str = dis.readUTF();
			System.out.println(str);
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}  
		
		
	}
}
