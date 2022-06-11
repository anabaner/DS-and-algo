package StackPrograms;

public class StackImpl {
	
	
	
	public static void main(String[] args) {
		StackUtils st = new StackUtils(3);
		st.pop();
		st.push(6);
		st.push(7);
		st.push(6);
		st.push(8);
		
		st.pop();
		st.push(9);
		st.show();

	}

}
