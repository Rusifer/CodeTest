import java.util.*;

public class StringCalculatorTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("계산할 값 입력 :");
		
		String valueString = scanner.nextLine();
		System.out.println("입력값 :"+ valueString);
		
		String[] valueStrings = valueString.split(" ");
		
		Calculator calculator = new Calculator();
		
		int first = Integer.parseInt(valueStrings[0]);
		
		int result = first;
		for ( int i = 1;  i < valueStrings.length; i += 2) {
			String symbolString = valueStrings[i];
			System.out.println("symbol :" + symbolString);
			
			int second = Integer.parseInt(valueStrings[i+1]);
			System.out.println("second :" + second);
			
			result = calculator.calculate(result, symbolString, second);

		}
		calculator.print(result);
	}
}
