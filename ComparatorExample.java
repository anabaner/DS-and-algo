package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ComparatorExample {

	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>(); 
		al.add(new Student(101,"Vijay",23));  
		al.add(new Student(106,"Ajay",27));  
		al.add(new Student(105,"Jai",21));  
		
		Collections.sort(al,new AgeComparator());
		
		Iterator<Student> it = al.iterator();
		while(it.hasNext()) {
			Student st=(Student)it.next();  
			System.out.println(st.getAge());
		}
	}
	
}	
	
	class AgeComparator implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			
			Student s1= (Student) o1;
			Student s2 = (Student) o2;
			
			if(s1.getAge() > s2.getAge())
				return 1;
			else if(s1.getAge() < s2.getAge())
				return -1;
			else
			return 0;
		}
		
	}
	
	
	class NameComparator implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			
			Student s1= (Student) o1;
			Student s2 = (Student) o2;

			return s1.getName().compareTo(s2.getName());
		}
		
	}
	
	
	class Student {
		private int id;
		private String name ;
		private int age;
		
		public Student(int id,String name,int age){
			
			this.id=id;
			this.name=name;
			this.age=age;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
	}


