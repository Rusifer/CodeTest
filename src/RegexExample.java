public class RegexExample {

	public static void main(String[] args) {
		
		String pattern = "//(.)::(.*)";
		String text = "//#::1#2#100";
		
		Regex regex = new Regex(pattern, text);
		
		try {
			String[] tokens = regex.patternSplit();
			regex.print(tokens);
			
			
		} catch (IllegalStateException e) {
			System.out.println(e.toString());
		}
		

	}

}
