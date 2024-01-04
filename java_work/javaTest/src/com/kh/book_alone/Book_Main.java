package com.kh.book_alone;

public class Book_Main {
	public static void main(String[] args) {
		
		Book_Pos pos = Book_Pos.getPos();
		
		boolean isLoop = true;
		while (isLoop) {
			switch (pos.mainMenu()) {
				case 1:{  // 책 등록
					pos.inCheak();
				} break;
				case 2:{  // 책 삭제
					pos.deleteBook2();
				} break;
				case 3:{  // 책 전체목록
					pos.viewBook();
				} break;
				case 4:{  // 책 찾기
					pos.findBook();
				} break;
				case 5:{  // 책 정보수정
					pos.updateBook();
				} break;
				default :
					System.out.println("프로그램을 종료합니다.");
					isLoop = false;
			}
		}
		
		
		
		

	}

}
