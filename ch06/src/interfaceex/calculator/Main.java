package interfaceex.calculator;

public class Main {

	public static void main(String[] args) {
		MyCalculator calc = new MyCalculator();
		
		try {
			int n1 = 10, n2 = 0;
	
			System.out.println(calc.add(n1, n2));
			System.out.println(calc.subtract(n1, n2));
			System.out.println(calc.times(n1, n2));
			System.out.println(calc.divide(n1, n2));
		}catch(Exception e) {
			System.out.println(e);
		}
				
	}

}
