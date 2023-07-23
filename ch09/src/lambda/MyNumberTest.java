package lambda;

public class MyNumberTest {

	public static void main(String[] args) {
		MyNumber num;
		
		/*num = (x, y) -> {
			return (x >= y) ? x : y;
		};*/
		
		//생략형
		num = (x, y) -> (x >= y) ? x : y;
		int max = num.getMax(10, 20);
		System.out.println("더 큰 수는 "  + max);
	}

}
