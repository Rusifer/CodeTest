import java.util.*;


public class Calculator {

	public int getFirstValue(Scanner scanner) {
		System.out.println("ù��° �Է� ��: ");
		int first = scanner.nextInt();
		System.out.println(first);
		
		return first;
	}
	
	public int getSecondValue(Scanner scanner) {
		System.out.println("�ι�° �Է� ��: ");
		int second = scanner.nextInt();
		System.out.println(second);
		
		return second;
	}
	
	public String getSymbolValue(Scanner scanner) {
		System.out.println("�����ȣ: ");
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