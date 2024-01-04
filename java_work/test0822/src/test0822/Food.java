package test0822;
import java.io.*;

public class Food implements Serializable {
	private String name;
	private int kcal;
	
	public Food() {
	}
	public Food(String name, int kcal) {
		this.name = name;
		this.kcal = kcal;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	public void setName (int kcal) {
		this.kcal = kcal;
	}
	
	public String getName() {
		return name;
	}
	public int getKcal() {
		return kcal;
	}
	
	public String toString() {
		return "이름: " + name + "칼로리 : " + kcal;
	}
	
//	File file = new File(fileName);
	public void fileSave(String fileName) {
		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			oos.writeObject(this); // Food 객체를 파일에 기록
					
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}


	
}
