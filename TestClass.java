package ArraysAndStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner in = new Scanner(System.in);
	        String statement = "Its _ heavily _" ;
	        StringBuilder sb = new StringBuilder(statement);
	        int n = 2;
	        List<String> list = new ArrayList<String>();
	        for (int i = 0; i < n; i++) {
	        	String words = in.next();
	        	
	        	   int index = statement.indexOf("_");
	        	   
	               // replace character at the specified position
	      //         str = sb.toString();
	        	   
	     //   	   statement = statement.replace(index,1).Insert(index, words);    
	        	
	        	
	     //   	statement =  statement.replace("_", words);
	        
	           // list.add(words);
	        }
	        System.out.println(statement);
	        
	        for(int i=0;i<statement.length();i++){
	        	
	          if(statement.charAt(i) == '_') {
	        	  
	        	  for(int j=0;j<n;j++){
	        	  statement =  statement.replace("_", list.get(j));
	        }}
	       // if(statement)

	}
	        
	        System.out.println(statement);

}}
