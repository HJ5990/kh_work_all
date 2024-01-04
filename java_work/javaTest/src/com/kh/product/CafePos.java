package com.kh.product;
import java.util.Scanner;

public class CafePos {
	
	// 참조변수 (가르키는 메모리가 없음)
	private static CafePos instance;
	
	private final int MAX_COUNT = 3;
	private final Product[] DRINK_ARR = new Product[MAX_COUNT];
	private Scanner sc = new Scanner(System.in);
	private boolean isRun = true;
	
	// 외부에서 객체를 생성하지 못하도록 생정자의 접근제한자를 private로 설정
	private CafePos() {
	}
	
	// 객체 여러개 만들어도 하나만 가리킴 (싱글톤)
	public static CafePos getInstance() {
		if (instance == null)
			instance = new CafePos();
		return instance;
	}
	
	
	
	
	
	// 메서드
	
	// 반복문 메서드
	public boolean getIsRun() {
		return this.isRun;
	}
	public void setIsRun(boolean isRun) {
		this.isRun = isRun;
	}
	
	
	// 첫화면
	public int printMenu() {
		System.out.println("----------------------");
		System.out.println("1. 메뉴 생성");
		System.out.println("2. 메뉴 수정");
		System.out.println("3. 메뉴 조회");
		System.out.println("4. 메뉴 삭제");
		System.out.println("5. 전체 메뉴 출력");
		System.out.println("----------------------");
		System.out.print("원하는 메뉴를 선택해주세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

	
	
	// 1. 메뉴 생성
	// 음료명, 금액, 설명을 입력받아 drinkArr에 추가해 보아라 (이미 있으면 안내)
	public void insertMenu() {
		String name, description;
		int price;
		
		System.out.print("음료명을 입력하세요 : ");
		name = sc.nextLine();
		
		System.out.print("금액을 입력하세요 : ");
		price = sc.nextInt();
		
		sc.nextLine();   // 숫자 다음의 \n을 없애주기 위해서 (안그러면 다음 설명에 엔터만 들어감)
		System.out.print("설명을 입력하세요 : ");
		description = sc.nextLine();
		
		for (int i=0; i < DRINK_ARR.length; i++) {
			if (DRINK_ARR[i] == null) {
				DRINK_ARR[i] = new Product(name, price, description);
				System.out.println(DRINK_ARR[i].getName() + "(이)가 메뉴에 추가되었습니다.");
				break;
			} else if (DRINK_ARR[i].getName().equals(name)) {
				System.out.println(name + "은(는) 이미 등록되어 있습니다.");
				break;
			} else if (i == DRINK_ARR.length-1) {
				System.out.println("더 이상 메뉴를 추가할 수 없습니다.");
			}
		}
	}
	
	
	
	// 2. 메뉴 수정
	// 수정
	// 수정할 정보를 입력하세요 : (이름, 가격, 설명)
	// 새로운 이름or가격or설명 을 입력하세요 :
	// selectMenu 이용해서 해당정보 수정 후 아래와 같이 출력
	// 0 아메리카노 1000 샷1잔
	public void updateDrinkUnit() {
		printDrinkArr();
	
		Product selectMenu;
		System.out.print("수정할 메뉴의 번호를 입력하세요 : ");
		int number = sc.nextInt();
		sc.nextLine();
		
		selectMenu = DRINK_ARR[number];
		
		if (selectMenu == null) {
			System.out.println("해당 번호의 메뉴가 존재하지 않습니다");
		} else {
			System.out.print("수정할 정보를 입력하세요 (이름, 가격, 설명) : ");
			switch (sc.next()) {
			case "이름" :
				sc.nextLine();
				System.out.print("새로운 이름을 입력하세요 : ");
				selectMenu.setName(sc.nextLine());
				System.out.println(number + "\t" + selectMenu.toString());
				break;
			case "가격" :
				System.out.print("새로운 가격을 입력하세요 : ");
				selectMenu.setPrice(sc.nextInt());
				System.out.println(number + "\t" + selectMenu.toString());
				break;
			case "설명" :
				sc.nextLine();
				System.out.print("새로운 설명을 입력하세요 : ");
				selectMenu.setDescription(sc.nextLine());
				System.out.println(number + "\t" + selectMenu.toString());
				break;
			default:
				System.out.print("잘못입력하셨습니다");
			}
		}
	}
	
	
	
	// 3. 메뉴 조회
	// 조회할 메뉴의 이름을 입력하세요 : 아메리카노
	// 0 아메리카노 1000 샷1잔
	// 해당메뉴가 목록에 존재하지 않습니다
	public void searchDrinkUnit() {
		System.out.print("조회할 메뉴의 이름을 입력하세요 : ");
		String tName = sc.next();
		
		for (int i=0; i < DRINK_ARR.length; i++){
			if(DRINK_ARR[i] == null) {
				System.out.println("해당메뉴가 목록에 존재하지 않습니다");
				break;
			} else if  (DRINK_ARR[i].getName().equals(tName)) {
				System.out.println(i + "\t" +DRINK_ARR[i].toString());
				break;
			} else if (i == (DRINK_ARR.length-1)){
				System.out.println("해당메뉴가 목록에 존재하지 않습니다");
			}
		}
	}
	
	
	

	// 4. 메뉴 삭제
	// 가장 최신으로 저장된 목록 1개 삭제
	public void deleteDrinkUnit() {
		for (int i = (DRINK_ARR.length-1) ; i >= 0; i--) {
			if (DRINK_ARR[i] != null) {
				System.out.println(DRINK_ARR[i].getName() + "(이)가 삭제되었습니다.");
				DRINK_ARR[i] = null;
				break;
			} else if (i == 0) {
				System.out.println("삭제할 메뉴가 없습니다.");
			}
		}
	}
	
	// 4. 메뉴 삭제
	// 번호 선택해서 삭제 후 뒤에있는 객체들 앞으로 당기기
	public void deleteDrinkUnit2() {
		printDrinkArr();
		System.out.print("삭제할 메뉴의 번호를 입력하세요 : ");
		int number = sc.nextInt();
		sc.nextLine();
		
		if (DRINK_ARR[number] == null) {
		System.out.println("해당 번호에 메뉴가 없습니다");
		} else {		
			for (int i=number ; i < DRINK_ARR.length-1 ; i++) {
				DRINK_ARR[i] = DRINK_ARR[i+1];
			}
			DRINK_ARR[DRINK_ARR.length-1] = null;
		}
		
	}

	
	

	// 5. 전체 메뉴 조회
	// 음료목록 출력해주세요
	// 메뉴명   가격   설명
	public void printDrinkArr() {
		System.out.println("번호\t메뉴명\t가격\t설명");
		for (int i=0; i < DRINK_ARR.length; i++) {
			if (DRINK_ARR[i] == null) {
				System.out.println(i + "\t-\t-\t-");
			} else {
				System.out.println(i + "\t" +DRINK_ARR[i].toString());
			}
		}
	}
	
	
	
	
	
	
	
}
