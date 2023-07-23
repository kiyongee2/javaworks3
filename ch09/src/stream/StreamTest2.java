package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamTest2 {

	public static void main(String[] args) {
		
		String[] fruit = {"apple", "banana", "grape"};
		
		Stream<String> strStream = Arrays.stream(fruit);
		strStream.forEach(str -> System.out.println(str));
		
		
	}

}
