package com.kh.library_0828review;
import java.util.*;

// 회원생성, 수정, 삭제
// 도서 등록, 수정, 삭제
// 밑 도서대여관리
public class Library {
	Scanner sc;
	
	// 책들을 저장할 공간
	ArrayList<Book> bookList;
	// 회원들을 저장할 공간
	ArrayList<Human> humanList;
	
	//생성자
	public Library() {
		bookList = new ArrayList<>();
		bookList.add(new Book("집에", "김가가", 1));
		bookList.add(new Book("가고", "남나나", 2));
		bookList.add(new Book("싶다", "담다다", 3));
		
		humanList = new ArrayList<>();
		humanList.add(new Human(11, "일회원", "911111", 11, 'F'));
		humanList.add(new Human(22, "이회원", "922222", 22, 'M'));
		humanList.add(new Human(33, "삼회원", "933333", 33, 'F'));
		sc = new Scanner (System.in);
	}
	
	
	// 도서등록, 도서대여, 도서반납 선택하는 메인화면
	public void mainMenu() {
		while(true) {
			System.out.println("==============================");
			System.out.println("1. 도서등록");
			System.out.println("2. 도서대여");
			System.out.println("3. 도서반납");
			System.out.println("4. 도서삭제");
			System.out.println("5. 회원등록");
			System.out.println("9. 프로그램 종료");
			System.out.println("==============================");
			System.out.print("번호를 입력하세요 : ");
			int number = sc.nextInt();
			sc.nextLine();
			
			switch (number) {
				case 1:
					printBookList(bookList);
					bookList.add(this.createBook());
					break;
				case 2:
					rentBook();
					break;
				case 3:
					returnBook();
					break;
				case 4:
					deleteBook();
					break;	
				case 5:
					printHumanList(humanList);
					humanList.add(this.createHuman());
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					return;
				default:
					System.out.println("잘못 입력하셨습니다.");
					
			}
		}
	}
	
	
	// 2. 도서대여
	public void rentBook() {
		// 대여할 수 있는 회원과 책이 있는지 검사하고
		boolean isBookCheck = false; 
		boolean isHumanCheck = false; 
		for (Book b : bookList) {
			if(b.getIsRent()) {
				isBookCheck = true;
				break;
			}
		}
		for (Human h : humanList) {
			if(h.getRrentBookCode() == 0) {
				isHumanCheck = true;
				break;
			}
		}
		
		// 없으면 없다고하고 리턴
		if (bookList.size() == 0 || !isBookCheck) {
			System.out.println("도서등록이 필요합니다.");
			return;
		} else if (humanList.size() == 0 || !isHumanCheck) {
			System.out.println("회원등록이 필요합니다.");
			return;
		}

		// 대여할 회원 선택
		Human selectHuman = selectHuman();
		// 대여할 책을 선택
		Book selectBook =selectBook();
		
		// 책을 대여해준다
		// 책은 isRent 상태를 false로 변경
		// 사람은 대여책 코드를 등록시킨다
		selectHuman.setRrentBookCode(selectBook.getCode());
		selectBook.setIsRent(false);

	} 

	
	// 3. 도서를 반납하기 위한 메서드
	public void returnBook() {
		// 책을 빌린 사람들을 출력
		ArrayList<Human> tmpHumanList = new ArrayList<>();
		for (Human man : humanList) {
			if (man.getRrentBookCode() !=0)
				tmpHumanList.add(man);
		}
		// 책을 빌린 사람이 없으면
		if (tmpHumanList.size() == 0) {
			System.out.println("반납할 책이 없습니다");
			return;
		}
		// tmpHumanList 에 담긴 사람들을 보여준다. 
		printHumanList(tmpHumanList);
		
		
		Human selectHuman = null;
		while (selectHuman == null) {
			//리스트에 있는 사람중 어떤 사람의 책을 반납할지 id를 입력받는다
			System.out.print("어떤 사람의 책을 반납하시겠습니까? (id입력) : ");
			int selectID = sc.nextInt();
			sc.nextLine();
			
			for (Human man : tmpHumanList) {
				if(man.getKey() == selectID) {
					selectHuman = man;
				}
			}
			if (selectHuman == null) {
				System.out.println("입력한 id와 일치하는 회원이 없습니다.");
			}
		}
		
		
		for (Book book : bookList) {
			if (book.getCode() == selectHuman.getRrentBookCode()) {
				book.setIsRent(true);
				selectHuman.setRrentBookCode(0);
				System.out.println("반납이 완료되었습니다.");
				break;
			}
		}
	}
	
	
	// 4. 도서 삭제
	public void deleteBook() {
		// 도서목록을 보여준다
		// 삭제할 도서코드를 입력받는다
		// 해당 도서가 대여중이면 "대여중인 도서는 삭제가 불가합니다" 하고 return
		// 해당도서가 대여중이 아니면 도서목록에서 해당도서 삭제
		Book selectBook = null;
		while (true) {
			printBookList(bookList);
			System.out.print("삭제할 책의 코드 : ");
			int num = sc.nextInt();
			sc.nextLine();
			
			for (Book book : bookList) {
				if (book.getCode() == num) {
					selectBook = book;
					break;
				}
			}
			if (selectBook == null) {
				System.out.println("해당코드의 책이 존재하지 않습니다.");
			} else {
				break;
			}
		}
		
		if (!selectBook.getIsRent()) {
			System.out.println("대여중인 도서는 삭제가 불가합니다");
		} else {
			remove(selectBook);
		}
		
		
		
		
	}
	
	
	// human을 선택해서 반환하는 메서드
	public Human selectHuman() {
		Human selcetHuman = null;
		while (selcetHuman == null) {
			printHumanList(humanList);
			System.out.print("어떤 회원으로 대여하시겠습니다?(ID입력) : ");
			int selcetkey = sc.nextInt();
			sc.nextLine();
	
			for (Human human : humanList) {
				if (selcetkey == human.getKey()) {
					if (human.getRrentBookCode() != 0) {
						System.out.println("대여중인 책을 반납 후 이용해주세요");
					} else {
						selcetHuman = human;
					}
				}
			}
		}
		return selcetHuman;
	}
		
	// book을 선택해서 반환하는 메서드
	public Book selectBook() {
		Book selcetBook = null;
		while (selcetBook == null) {
			printBookList(bookList);
			System.out.print("어떤 책을 대여하시겠습니다?(코드입력) : ");
			int selcetcode = sc.nextInt();
			sc.nextLine();
			
			for (Book book : bookList) {
				if (selcetcode == book.getCode()) {
					if (!book.getIsRent()) {
						System.out.println("이미 대여중인 책입니다");
					} else {
						selcetBook = book;
					}
				}
			}
		}
		return selcetBook;
	}
		
	// 사람목록을(humanList) 출력
	public void printHumanList(ArrayList<Human> tmpList) {
		System.out.println("------------------------------");
		if(tmpList.size() > 0) {
			System.out.println("ID\t이름\t생년월일\t나이\t성별\t도서대여현황");
			for(Human human : tmpList) {
				System.out.println(human.toString());
			}
		}else {
			System.out.println("등록된 회원 없음");
		}
		System.out.println("------------------------------");
	}
	
	// 도서목록을(bookList) 출력
 	public void printBookList(ArrayList<Book> tmpList) {
		System.out.println("------------------------------");
		if(tmpList.size() > 0) {
			System.out.println("코드\t제목\t작가\t대여여부");
			for(Book book : tmpList) {
				System.out.println(book.toString());
			}
		}else {
			System.out.println("등록된 도서 없음");
		}
		System.out.println("------------------------------");
	}
	
	
	
	// 5. 사용자의 입력에 따라 Human객체를 생성해서 반환한다.
  	public Human createHuman() {
		// 이름, 나이, 주민번호, 성별을 입력받아 사람객체 한개를 생성한다
		String name, residentNumber;
		int age, key;
		char gender;
		
		System.out.print("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.print("나이를 입력하세요 : ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("주민번호 앞 6자리를 입력하세요 : ");
		residentNumber = sc.nextLine();
		System.out.print("성별을 입력하세요 (남 : M, 여 : F) : ");
		gender = sc.nextLine().toUpperCase().charAt(0);
		System.out.print("고객 고유코드를 입력하세요 :  ");
		key = sc.nextInt();
		sc.nextLine();
		
		Human human = new Human(key, name, residentNumber, age,  gender);
		System.out.println(human.toString() + " 생성완료");
		return human;
	}
	
  	
 	// 1. 사용자의 입력에 따라 Book객체를 생성해서 반환한다.
	// 사용자의 입력에 따라 Book객체를 생성해서 반환한다.
	public Book createBook() {
		// 제목, 작가, 코드를 입력받아 책객체 한개를 생성한다
		String title, author;
		int code;
		
		System.out.print("책 제목을 입력하세요 : ");
		title = sc.nextLine();
		System.out.print("작가를 입력하세요 : ");
		author = sc.nextLine();
		System.out.print("고유코드를 입력하세요 : ");
		code = sc.nextInt();
		sc.nextLine();
		
		Book book = new Book(title, author, code);
		System.out.println(book.toString() + " 생성완료");
		return book;
	}

	
	
	

}
