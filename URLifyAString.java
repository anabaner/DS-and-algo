package ArraysAndStrings;

public class URLifyAString {

	public static void main(String[] args) {

		String str = "Mr John Smith   ";
		
		str= str.trim();
		
		str= str.replaceAll("\\s+", "%20");
		
		System.out.println(str);
		
		
	}

}
