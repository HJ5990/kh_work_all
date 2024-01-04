package com.kh.book_alone;
import java.util.Scanner;

import com.kh.product.Product;

public class Book_Pos {
	Scanner sc = new Scanner(System.in);
	
	private static final Book[] BOOKLIST = new Book[10];
	
	// private 생성자 (이 클래스 밖에서 생성할 수 없음)
	private Book_Pos() {
	}

	
	// Book_Pos 객체를 생성할 수 있는 메서드
	// private한 Book_pos생성자 때문에 바로 접근할수 없어서, 한단계 타서 접근하게 해줌
	// static 메모리를 사용하기 때문에 중복으로 생성해도 한개의 생성자(메모리)를 공유하게 됨
	
	private static Book_Pos posEx = new Book_Pos();
	
	public static Book_Pos getPos() {
		return posEx;
	}
	
	
	
	
	
	// 0. 메뉴 메서드
	public int mainMenu() {
		System.out.println("-----------------------");
		System.out.println("1. 도서 등록");
		System.out.println("2. 도서 삭제");
		System.out.println("3. 전체 도서목록 확인");
		System.out.println("4. 도서 검색");
		System.out.println("5. 도서 정보 수정");
		System.out.println("(다른 번호 입력시 종료됩니다)");
		System.out.println("-----------------------");
		System.out.print("번호 입력 : ");
		int choice = sc.nextInt();
		sc.nextLine();
		return choice;
	}
	
	// 1-1. 책을 넣을 자리가 있는지 확인하는 매서드
	public void inCheak() {
		for (int i=0; i < BOOKLIST.length ; i++) {
			if (BOOKLIST[BOOKLIST.length-1] != null) {
				System.out.println("책을 넣을 공간이 없습니다.");
				return;
			} 	
		}
		Book tmp = inBook();
		if (tmp == null) {
			return;
		} else {
			saveBook(tmp);
		}
	}
	
	// 1-2. 새로운 책을 등록하는 매서드
	public Book inBook() {
		String name, author, issue;
		int price;
		System.out.print("책이름을 입력해주세요 : ");
		name = sc.nextLine();
		
		if (checkBookName(name)) {
			System.out.println("이미 등록되어 있는 책입니다");
			return null;
		}
		
		System.out.print("저자명을 입력해주세요 : ");
		author = sc.nextLine();
		System.out.print("발행년도를 입력해주세요 : ");
		issue = sc.nextLine();
		System.out.print("책가격을 입력해주세요 : ");
		price = sc.nextInt();
		sc.nextLine();
		Book tmp = new Book(name, author, issue,price);
		return tmp;
	}
	
	// 1-3. 중복된 이름의 책이 있는지 조회하는 메서드
	public boolean checkBookName(String tName) {
		for (int i=0; i < BOOKLIST.length; i++) {
			if (BOOKLIST[i] == null) {
				return false;
			} else if (BOOKLIST[i].getName().equals(tName)) {
				return true;
			} else if (i == BOOKLIST.length-1) {
				return false;
			}
		}
		return false;
	}
	
	// 1-4. 등록한 책을 배열에 넣는 매서드 Book[] BOOKLIST
	public void saveBook(Book tmp) {
		for (int i=0; i < BOOKLIST.length ; i++) {
			if (BOOKLIST[i] == null) {
				System.out.println("책을 넣었습니다.");
				BOOKLIST[i] = tmp;
				break;
			}
		}
	}
	
	// 2-1. 맨 뒤에 있는 책을 삭제하는 메서드
	public void deleteBook() {
		for (int i = BOOKLIST.length-1 ; i >= 0 ; i--) {
			if (BOOKLIST[i] != null) {
				System.out.println("책을 삭제했습니다.");
				BOOKLIST[i] = null;
				break;
			}
		}
	}
	
	// 2-2. 번호 선택해서 삭제하는 메서드
	public void deleteBook2() {
		viewBook();
		System.out.print("삭제할 책의 번호를 입력하세요 : ");
		int number = sc.nextInt();
		sc.nextLine();
		
		if (number >= BOOKLIST.length || number < 0) {
			System.out.println("해당 번호는 존재하지 않습니다");
			return;
		}
		
		if (BOOKLIST[number] == null) {
			System.out.println("해당 번호에 책이 없습니다");
		} else {		
			for (int i=number ; i < BOOKLIST.length-1 ; i++) {
				BOOKLIST[i] = BOOKLIST[i+1];
			}
			BOOKLIST[BOOKLIST.length-1] = null;
		}
		
	}
	
	// 3. 전체 도서목록 조회 메서드
	public void viewBook() {
		System.out.println("번호\t책이름\t저자\t발행년도\t가격");
		for (int i=0; i < BOOKLIST.length; i++) {
			if (BOOKLIST[i] == null) {
				break;
			}
			System.out.println(i + "\t" + BOOKLIST[i].toString());
		}
	}
	
	// 4. 도서조회
	public void findBook() {
		String name, author;
		System.out.print("책이름을 입력해주세요 : ");
		name = sc.nextLine();
		for (int i=0; i < BOOKLIST.length; i++) {
			if (BOOKLIST[i] == null) {
				System.out.println("해당 도서를 찾지 못했습니다1.");
				break;
			} else if (BOOKLIST[i].getName().equals(name)) {
				System.out.println("해당 도서는 " + i + "번에 있습니다.");
				break;
			} else if (i == BOOKLIST.length-1) {
				System.out.println("해당 도서를 찾지 못했습니다.");
				break;
			}
			
		}
	}
	
	// 5. 책 정보수정
	public void updateBook() {
		viewBook();
		System.out.print("수정할 책의 번호를 입력해주세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if (num >= BOOKLIST.length || num < 0) {
			System.out.println("해당 번호는 존재하지 않습니다");
			return;
		}
		
		Book choiceBook = BOOKLIST[num];
		if (choiceBook == null) {
			System.out.println("해당 번호의 책은 없습니다");
		} else {
			System.out.print("수정할 부분을 입력해주세요 (책이름, 저자, 발행년도, 가격) : ");
			String choice = sc.nextLine();
			
			switch (choice) {
				case "책이름" :
					System.out.print("새로운 이름을 입력하세요 : ");
					choiceBook.setName(sc.nextLine());
					System.out.println(choiceBook.getName() + "으로 변경 완료");
					break;
				case "저자" :
					System.out.print("새로운 저자명을 입력하세요 : ");
					choiceBook.setAuthor(sc.nextLine());
					System.out.println(choiceBook.getAuthor() + "으로 변경 완료");
					break;
				case "발행년도" :
					System.out.print("새로운 발행년도를 입력하세요 : ");
					choiceBook.setIssue(sc.nextLine());
					System.out.println(choiceBook.getIssue() + "으로 변경 완료");
					break;
				case "가격" :
					System.out.print("새로운 가격을 입력하세요 : ");
					choiceBook.setPrice(sc.nextInt());
					sc.nextLine();
					System.out.println(choiceBook.getPrice() + "으로 변경 완료");
					break;
				default:
					System.out.println("다시 입력해주세요.");
			}
		}
		
	
		
		
	}
	
	
	
	
	
	
	
	

}
