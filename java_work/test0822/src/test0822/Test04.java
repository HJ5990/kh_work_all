package test0822;

public class Test04 {
	public static void main(String[] args) {
		Person[] pArr = new Person[3];
		
		for(int i = 0; i < pArr.length; i++) {
			System.out.println(pArr[i].getName());
		}
		
		
		for(int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.print("수");
			} else {
				System.out.print("박");
			}
		}
		String str1 = "banana";
		char cha = 'a';
		int count=0;
		
		for (int i=0; i < str1.length(); i++) {
			if(str1.charAt(i) == 'a') {
				count += 1;
			}
		}
		System.out.println(count);
		
		
	}

}
