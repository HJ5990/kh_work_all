package com.kh.javai;
import java.util.Scanner;

public class MainStart_Arr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		
// 객체배열 연습 1----------------------------------------------------
		
		
		// 객체이름이 각각 yoon, choi, kim인 Student 객체를 생성
		
//		Student yoon = new Student("윤지원", 15, "남자");
//		Student choi = new Student("최소연", 25, "여자");
//		Student kim = new Student("김기범", 42, "남자");
//		
//		Student[] iban = new Student[3];
//		iban[0] = new Student("윤지원", 15, "남자");
//		iban[1] = new Student("최소연", 25, "여자");
//		iban[2] = new Student("김기범", 42, "남자");
		
		
		
		
// 객체배열 연습 2----------------------------------------------------
		
		
	
		
//		// 최대 학생의 수는 30인 클래스(i,h,j)를 3개 만들어라
//		Student[] iban = new Student[30];
//		Student[] hban = new Student[30];
//		Student[] jban = new Student[30];
//		// 선택한 반의 주소값을 가지고 있는 참조변수
//		Student[] selectBan;
//		
//		
//		while (true) {
//			// 관리할 클래스를 선택해 주세요 (i,j,k )
//			System.out.print("관리할 클래스를 선택해 주세요 (i, h, j반 중 선택, 다른 키워드 입력시 종료) : ");
//			
//			switch (sc.next().charAt(0)) {
//				case 'i' :
//					selectBan = iban;
//					break;
//				case 'h' :
//					selectBan = hban;
//					break;
//				case 'j' :
//					selectBan = jban;
//					break;
//					
//				default :
//					selectBan = null;
//			}
//			if (selectBan == null)
//				break;
//			
//			// 1. 학생추가
//			// 2. 학생제거
//			// 3. 학생목록 확인
//			//기타입력시 뒤로, 그전까지 반복
//			
//			boolean isTrue = true;
//			while (isTrue) {
//				System.out.println("1. 학생추가");
//				System.out.println("2. 학생제거");
//				System.out.println("3. 학생목록 확인");
//				System.out.println("4. 학생조회");
//				System.out.println("기타입력시 뒤로");
//				
//				switch (sc.nextInt()) {
//					case 1: {
//						// selectBan의 마지막 빈자리를 찾는다 (반복문으로 null을 만날때까지)
//						int index = 0;
//						while (index < selectBan.length && selectBan[index] != null) {
//							index++;
//						}
//						// selectBand에 자리가 있을 시 학생을 추가해준다.
//						if (index == selectBan.length)
//							System.out.println("더이상 해당반에는 학생을 추가할 수 없습니다.");
//						else
//							System.out.println("추가할 학생의 이름, 나이, 성별을 입력해주세요.");
//							selectBan[index] = new Student(sc.next(), sc.nextInt(), sc.next());
//					}break;
//					case 2: {
//						int index = 0;
//						while (index < selectBan.length && selectBan[index] != null) {
//							index++;
//						}
//						if (index == 0)
//							System.out.println("삭제할 학생이 없습니다.");
//						else
//							selectBan[index - 1] = null;
//							Student.count--;
//					} break;
//					case 3: {
//						System.out.println("---------------------------");
//						System.out.println("이름\t나이\t성별");
//						for (int i=0 ; i < selectBan.length ; i++) {
//							if (selectBan[i] == null)
//								break;
//							selectBan[i].info();
//						}
//						System.out.println("---------------------------");
//					} break;
//					case 4: {
//						// 조회할 학생의 정보를 입력하세요 (이름, 나이, 성별)
//						
//						System.out.println("조회할 학생의 정보를 입력하세요 (이름, 나이, 성별)");
//						Student tmp = null;
//						
//						for (int i=0; i < selectBan.length; i++) {
//							if (selectBan[i] == null)
//								break;
//							else if (selectBan[i].equals(sc.next(), sc.nextInt(), sc.next())) {
//								tmp = selectBan[i];
//								break;
//							}
//						}
//						// 해당 학생은 이미 등록 완료되었습니다.
//						// or 해당학생을 찾을 수 없습니다.
//						
//						if (tmp != null)
//							System.out.println("해당 학생은 이미 등록 완료되었습니다.");
//						else
//							System.out.println("해당 학생을 찾을 수 없습니다.");
//						
//					} break;
//					default:
//						isTrue = false;
//				}
//			}
//		}
//		
//		System.out.println("총 학생 " + Student.showCount() + " 명을 등록 완료하였습니다");
//		
//		
		
		
		
		
		
// 객체배열 0808-------------------------------------------------
		
		POSSystem pos = POSSystem.getPosInstance();
		pos.saveCustomer(new Customer("김소망", "myId", "myPassword", "asd@naver.com"));
	
		boolean isLoop = true;
		while(isLoop){
			switch (pos.printMenu()) {
				case 1:{ //회원등록
					pos.joinCustomer();
				} break;
				case 2:{ //회원삭제
					pos.deleteLastCustomer();
				} break;
				case 3:{ // 회원목록출력
					pos.viewCustomerList();
				} break;
				case 4:{ // 로그인
					pos.login();
				} break;
				default :
					isLoop = false;
			}
		}
		
		
		// 길이가 10인 Customer 객체배열을 생성하고
		// 0번째 인덱스값에 객체생성
		
		// POSSystem. 만들어서 필요없는것
//		Customer[] arr = new Customer[10];
//		arr[0] = new Customer("김소망", "myId", "myPassword", "asd@naver.com");
		
		
		
		
		//회원삭제--------------------------------------------------
		// 마지막으로 등록된 회원을 삭제한다.

		// 정방향 (생각해야할 상황이 너무 많음)
//		for (int i=0; i < arr.length ; i++) {
//			if (arr[i] == null && i != 0) {
//				arr[i-1] = null;
//				break;
//			} else if (i == arr.length-1) {
//				arr[i] = null;
//			} 
//				
//		}
		
		// 역방향 (이게 깔끔함)
//		for (int i= arr.length-1 ; i >= 0 ; i--) {
//			if (arr[i] != null) {
//				arr[i] = null;
//				break;
//			}
//		}
		
		//------------------------------------------------- 회원삭제
		
		
		//회원가입--------------------------------------------------
		
		// 아이디, 비밀번호, 이름, 이메일을 입력받아 Customer 객체를 추가해보자
		/*
		 * 아이디를 입력하세요 :
		 * 비밀번호를 입력하세요 :
		 * 이름을 입력하세요 :
		 * 이메일을 입력하세요 :
		 * 
		 * 이름 : ㅇㅇㅇ
		 * 이메일 : ㅇㅇㅇ
		 * ID : ㅇㅇㅇ
		 * Password : ㅇㅇㅇ
		 * 회원정보가 정상적으로 등록되었습니다.
		 */
		
		
//		for (int i=0; i < arr.length; i++) {
//			if (arr[i] == null) {
//				String id, password, name, email;
//				System.out.print("아이디를 입력하세요 : ");
//				id = sc.next();
//				System.out.print("비밀번호를 입력하세요 : ");
//				password = sc.next();
//				System.out.print("이름을 입력하세요 : ");
//				name = sc.next();
//				System.out.print("이메일을 입력하세요 : ");
//				email = sc.next();
//				arr[i] = new Customer(name, id, password, email);
//				System.out.println(arr[i].toString());
//				System.out.println("회원정보가 정상적으로 등록되었습니다.");
//				
//				break;
//				
//			} else if (i == arr.length-1){
//				System.out.print("더이상 회원을 등록할 수 없습니다");
//			}
//		}
		//------------------------------------------------- 회원가입
	
		// 모든회원출력---------------------------------------------
		//이름 아이디 비밀번호 이메일
		
//		System.out.println("이름\t아이디\t비밀번호\t이메일");
//		for (int i=0 ; i < arr.length; i++)	
//			if (arr[i] == null)
//				break;
//			else
//				System.out.print(arr[i].toString());
	
		
		
		
		//--------------------------------------------- 모든회원출력
		
		// 로그인기능-------------------------------------------------
		
//		Customer loginCustomer;
//		
//		String id, pw;	
//		
//		System.out.print("아이디 : ");
//		id = sc.next();
//		System.out.print("비밀번호 : ");
//		pw = sc.next();
//		
//		
//		for (int i=0; i < arr.length; i++) {
//			if (arr[i] == null) {
//				System.out.print("등록된 회원정보를 찾을 수 없습니다.");
//				break;
//			} else if (arr[i].equals(id, pw)) {
//				loginCustomer = arr[i];
//				System.out.print("로그인 성공.");
//				break;
//			} else if (arr[i].idCheck(id)) {
//				System.out.print("비밀번호가 틀렸습니다.");
//				break;
//			} else if (i == arr.length-1) {
//				System.out.print("등록된 회원정보를 찾을 수 없습니다.");
//			}
//		}

		//------------------------------------------------- 로그인기능
		

		
		
		
		
		
	}

}
