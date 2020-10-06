import java.util.*;

public class CalculatorMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator calculator = new Calculator();
		
		int first = calculator.getFirstValue(scanner);
		int result = first;
		
		while (true) {
			
			String symbol = calculator.getSymbolValue(scanner);
			
			if(symbol.equals("quit")) {
				System.out.println("종료되었습니다.");
				break;
			} 
			
			int second = calculator.getSecondValue(scanner);
			
			result = calculator.calculate(result, symbol, second);
			
			calculator.print(result);
			
	
		}
		
	}
}
