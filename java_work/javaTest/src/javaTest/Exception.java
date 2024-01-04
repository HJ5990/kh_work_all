package javaTest;
import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		
		try {
			System.out.print("a/b...a? ");
			int n1 = kb.nextInt();
			System.out.print("a/b...b? ");
			int n2 = kb.nextInt();
			
			System.out.printf("%d / %d = %d \n", n1, n2, n1/n2);
			
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Good bye~~!");
		
	}

}
