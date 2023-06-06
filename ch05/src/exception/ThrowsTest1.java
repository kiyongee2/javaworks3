package exception;

public class ThrowsTest1 {

	public static void main(String[] args) {
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class cls = Class.forName("java.lang.Strign");
	}

}
