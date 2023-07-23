package lambda;

public class MyMethodTest {

	public static void main(String[] args) {
		
		MyFunctionalInterface fi;
		
		//fi = () -> {System.out.println("Hello~ Java");};
		fi = () -> System.out.println("Hello~ Java");
		fi.method();
	}
}
