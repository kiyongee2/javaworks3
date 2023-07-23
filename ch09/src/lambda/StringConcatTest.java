package lambda;

public class StringConcatTest {

	public static void main(String[] args) {
		StringConcat concat;
		
		String s1 = "Hill";
		String s2 = "State";
		
		concat = (s, v) -> System.out.println(s + ", " + v);
		concat.makeString(s1, s2);
	}
}
