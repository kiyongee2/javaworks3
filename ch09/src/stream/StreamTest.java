package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		
		List<String> companyList = 
				Arrays.asList("LG", "삼성", "현대");
		
		Stream<String> stream = companyList.stream();
		stream.forEach(company -> System.out.println(company));
	}

}
