package javaTest;
import java.util.*;

public class Switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
	
		
		switch (num) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		default:
			System.out.println("값이 없습니다.");
		}

	}

}
