import java.util.regex.*;

public class Regex {
	String pattern;
	String text;
	
	public  Regex(String pattern, String text) {
		this.pattern = pattern;
		this.text = text;
	}
	
	public String[] patternSplit() throws IllegalStateException {
		Matcher matcher = Pattern.compile(this.pattern).matcher(this.text);
		boolean matching = matcher.find();
		
		if(matching==false) throw new IllegalStateException("일치하는 패턴이 없습니다.");
		
		String customDelimteter = matcher.group(1);
		
		String[] tokens = matcher.group(2).split(customDelimteter);
		
		return tokens;
	}
	
	public void print(String[] tokens) {
		for (String string : tokens) {
			
			System.out.println(string);
		}
	}
}
