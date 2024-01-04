package com.kh.javai;

import java.util.Scanner;

// pos의 전체적인 관리를 위한 class
public class POSSystem {
	// 외부에서 접근이 불가능한 pos객체생성
	private static final Customer[] CUSTOMER_LIST = new Customer[10];
	// 스태틱 메모리로 하나 생성
	private static POSSystem posInstance = new POSSystem();
	Scanner sc = new Scanner(System.in);
	// 객체를 한개 만들어서 돌려쓰는걸 싱글톤이라고 함

	// 외부에서 생성학 수 없도록 기본생성자의 접근을 private으로 설정
	private POSSystem() {
	}
	
	public static POSSystem getPosInstance() {
		// POSSystem 내부에 있는 매서드 영역이므로 private한 posInstance에 접급이 가능하다
		return posInstance;
	}
	
	
	// pos 메뉴를 나타내주는 메서드
	public int printMenu() {
		System.out.println("---------------------");
		System.out.println("1. 회원등록 ");
		System.out.println("2. 회원삭제");
		System.out.println("3. 회원목록출력");
		System.out.println("4. 로그인");
		System.out.println("---------------------");
		System.out.print("원하는 번호를 입력해주세요 (이외의 번호를 입력하면 프로그램을 종료합니다.)");
		return sc.nextInt();
	}
	// 회원가입 정보 입력받아 배열에 저장하는 메서드
	public void joinCustomer() {
		if (this.CUSTOMER_LIST[this.CUSTOMER_LIST.length-1] != null) {
		System.out.print("더이상 회원을 등록할 수 없습니다");
		return;
		}
		
		Customer newUser = insertCustomer();
		saveCustomer(newUser);
	}
	
	
	// 회원가입 정보입력을 위한 매서드
	public Customer insertCustomer() {
		String id, password, name, email;
		System.out.print("아이디를 입력하세요 : ");
		id = sc.next();
		System.out.print("비밀번호를 입력하세요 : ");
		password = sc.next();
		System.out.print("이름을 입력하세요 : ");
		name = sc.next();
		System.out.print("이메일을 입력하세요 : ");
		email = sc.next();
		Customer tmp = new Customer(name,id,password,email);
		return  tmp;
	}
	

	// 회원을 실제로 배열에 저장하는 매서드
	public void saveCustomer(Customer user) {
		for (int i=0; i < this.CUSTOMER_LIST.length; i++) {
			if (this.CUSTOMER_LIST[i] == null) {
				this.CUSTOMER_LIST[i] = user;
				
				System.out.println(this.CUSTOMER_LIST[i].toString());
				System.out.println("회원정보가 정상적으로 등록되었습니다.");
				break;
			} else if (i == CUSTOMER_LIST.length-1){
				System.out.print("더이상 회원을 등록할 수 없습니다");
			}
		}
	}
	
	// 맨마지막으로 추가된 회원을 삭제한다
	public void deleteLastCustomer() {
		for (int i= this.CUSTOMER_LIST.length-1 ; i >= 0 ; i--) {
			if (this.CUSTOMER_LIST[i] != null) {
				System.out.println(this.CUSTOMER_LIST[i].getName() + "회원을 삭제했습니다.");
				this.CUSTOMER_LIST[i] = null;
				break;
			}
		}
	}
	
	
	// 전체 회원을 보여주는 메서드
	
	public void viewCustomerList() {
		System.out.println("이름\t아이디\t비밀번호\t이메일");
		for (int i=0 ; i < this.CUSTOMER_LIST.length; i++)	
			if (this.CUSTOMER_LIST[i] == null)
				break;
			else
				System.out.print(this.CUSTOMER_LIST[i].toString());
	}
	
	
	
	public void login() {
		Customer loginCustomer;
		String id, pw;	
		
		System.out.print("아이디 : ");
		id = sc.next();
		System.out.print("비밀번호 : ");
		pw = sc.next();
		
		
		for (int i=0; i < this.CUSTOMER_LIST.length; i++) {
			if (this.CUSTOMER_LIST[i] == null) {
				System.out.print("등록된 회원정보를 찾을 수 없습니다.");
				break;
			} else if (this.CUSTOMER_LIST[i].equals(id, pw)) {
				loginCustomer = this.CUSTOMER_LIST[i];
				System.out.print("로그인 성공.");
				break;
			} else if (this.CUSTOMER_LIST[i].idCheck(id)) {
				System.out.print("비밀번호가 틀렸습니다.");
				break;
			} else if (i == this.CUSTOMER_LIST.length-1) {
				System.out.print("등록된 회원정보를 찾을 수 없습니다.");
			}
		}
	}
	
	
	
}
