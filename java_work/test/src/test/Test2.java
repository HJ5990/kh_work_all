package test;

public abstract sealed class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
