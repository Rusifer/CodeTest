import java.util.*;


public class Calculator {

	public int getFirstValue(Scanner scanner) {
		System.out.println("첫번째 입력 값: ");
		int first = scanner.nextInt();
		System.out.println(first);
		
		return first;
	}
	
	public int getSecondValue(Scanner scanner) {
		System.out.println("두번째 입력 값: ");
		int second = scanner.nextInt();
		System.out.println(second);
		
		return second;
	}
	
	public String getSymbolValue(Scanner scanner) {
		System.out.println("연산부호: ");
		String symbol = scanner.next();
		System.out.println(symbol);
		
		return symbol;
	}
	
	public int calculate(int result, String symbol, int second) {
		
		if(symbol.equals("+")) {
			result =  (result + second);
		
		} else if(symbol.equals("-")) {
			result = (result - second);
		
		} else if(symbol.equals("*")) {
			result =  (result * second);
		
		} else if(symbol.equals("/")) {
			result =  (result / second);
	
		} 
		return result;
	}
	
	public void print(int result) {
		System.out.println(result);
	}
	
	
	
	

}