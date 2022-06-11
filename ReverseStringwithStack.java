package StackPrograms;

public class ReverseStringwithStack {

	public static void main(String[] args) {
		StringBuilder s = new StringBuilder("GeeksForGeeks");
		StackUtils st = new StackUtils(s.length());
		for(int i = 0;i<s.length();i++) {
			st.push(s.charAt(i));
		}
		for(int i = 0;i<s.length();i++) {
			char ch = st.popChar();
			s.setCharAt(i, ch);
		}
		
		System.out.println(s);
		
		
	}

}
