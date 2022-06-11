package BinaryTreesPrograms;
/*
 *  Case 1: (0—n-1) 
p->root node
if (say)father=p; 
then left_son=(2*p)+1; 
and right_son=(2*p)+2;
 */
public class BinaryTreeArrayImpl {
	static String str[] = new String[10];
	public static void main(String[] args) {
		root("A");
		//set_left("B",0);
		set_Right("C",0);
		set_left("D",1);
		set_Right("E",1);
		set_left("F",2);
		print_Tree();
	}

	private static void print_Tree() {
		for(int i = 0;i<str.length;i++) {
			if(str[i]!=null)
			System.out.print(str[i]);
			else
				System.out.print("-");
		}
	}

	private static void set_Right(String key, int parentIndex) {
		int t = 2*parentIndex+2;
		if(str[parentIndex] == null) {
			System.out.println( "Can't set right child , no parent found at ::"+ t);
		}
		else {
			str[t]= key;
		}
	}

	private static void set_left(String key, int parentIndex) {
		int t = 2*parentIndex+1;
		if(str[parentIndex] == null) {
			System.out.println( "Can't set left child , no parent found at ::"+ t);
		}
		else {
			str[t]= key;
		}
	}

	private static void root(String key) {
		str[0] = key;
	}

}
