package com.kh.TCP_test;
import java.io.*;
import java.net.*;
import java.nio.file.attribute.DosFileAttributes;

public class TCP_Server {
	public static void main(String[] args) {
		System.out.println("server start");
		
		String serverIP = null;
		// 1. 서버의 포트번호 정함
		// port는 1024번까지는 이미 사용되는 포트
		int port = 5000;
		
		// 2. 서버용 소켓 객체 생성
		// 서버소켓 참조변수 선언
		ServerSocket serverSocket = null;
		
		try {
			// serverSocket 객체생성 => port를 정해줘야한다.
			serverSocket = new ServerSocket(port);
			// 생성된 serverSocket 객체에서 서버의 InetAddress(ip정보를 가진 객체)
			// 가지고 온 뒤 IP를 확인하여 참조한다.
			serverIP = serverSocket.getInetAddress().getHostAddress();
			// 3.클라이언트 쪽에서 접속 요청이 오길 기다림.
			// 요청이 도착하면 해당 소켓정보를 반환해준다 (소켓객체로 참조)
			System.out.println("요청대기중...");
			Socket clientSocket = serverSocket.accept();

			// 요청받은 clientSocket 객체에서 InetAddress(ip정보를 가진 객체)
			// 가지고 온 뒤 IP를 확인한다
			String clientIP = clientSocket.getInetAddress().getHostAddress();
			System.out.println("client 접속확인 : " + clientIP);
			
			// Input 연결
			InputStream is = clientSocket.getInputStream();    // 바이트기반(느림)
			BufferedInputStream br = new BufferedInputStream(is);
			DataInputStream dis = new DataInputStream(br);
			
			// 위의 3줄을 줄이면 이렇게 됨
//			DataInputStream dis2 = new DataInputStream(new BufferedInputStream(clientSocket.getInputStream()));
			
			// Output 연결
			OutputStream os = clientSocket.getOutputStream();
			BufferedOutputStream bos = new BufferedOutputStream(os);
			DataOutputStream dos = new DataOutputStream(bos);
			
			String str = dis.readUTF();
			System.out.println(str);    // 어떤 데이터가 왔는지 str형으로 반환해서 출력
			dos.writeUTF("반갑습니다");
			dos.flush();    // 보내는것
			
			
		} catch(IOException e) {
			e.printStackTrace();
		} 
		
	}
}
