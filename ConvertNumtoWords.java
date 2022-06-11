package MSInterview;

public class ConvertNumtoWords {
	 static String one[] = { "", "one ", "two ", "three ", "four ",
             "five ", "six ", "seven ", "eight ",
             "nine ", "ten ", "eleven ", "twelve ",
             "thirteen ", "fourteen ", "fifteen ",
             "sixteen ", "seventeen ", "eighteen ",
             "nineteen " };

	 static String ten[] = { "", "", "twenty ", "thirty ", "forty ",
             "fifty ", "sixty ", "seventy ", "eighty ",
             "ninety " };
	public static void main(String[] args) {
		 long n = 438237764;
		 
	        System.out.printf(convertToWords(n));
	}

	private static String convertToWords(long n) {
		
		String out = "";
		
			out += numToWords((int)(n / 10000000), "crore ");
		 
	        out += numToWords((int)((n / 100000) % 100), "lakh ");
	 
	        out += numToWords((int)((n / 1000) % 100), "thousand ");
	 
	        out += numToWords((int)((n / 100) % 10), "hundred ");
		
	        if (n > 100 && n % 100 > 0) {
	            out += "and ";
	        }
	 
	        out += numToWords((int)(n % 100), "");
	 
	        return out;
	        
	}

	private static String numToWords(int n, String string) {
		
		 String str = "";
	        if (n > 19) {
	            str += ten[n / 10] + one[n % 10];
	        }
	        else {
	            str += one[n];
	        }
	 
	        if (n != 0) {
	            str += string;
	        }
	 
	        return str;
	}

}
