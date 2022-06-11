package MSInterview;
//O(n) timr com ,O(n) - space comp - call stack
public class SumOfNNodesinLL {

	static LLNode head;
	static int sum,n ;
	public static void main(String[] args) {
		n=2;
		head = new LLNode(10);
		head.next = new LLNode(8);
		head.next.next = new LLNode(12);
		head.next.next.next = new LLNode(13);
		head.next.next.next.next = new LLNode(14);
		
		int add = getSum(head,sum,n);
		System.out.println(add);
		
		
	}

	
	private static int getSum(LLNode head, int sum, int n	) {
		if(n<=0)
			return 0;
		
		sum =0;
		sum_last_n_LLNode(head);
		
		return sum;
		
	}


	private static void sum_last_n_LLNode(LLNode head) {
		
		if(head ==null)
			return ;
		sum_last_n_LLNode(head.next);
		while(n>0) {
			sum+= head.data;
			n--;
		}
		
		
	}

}
	class LLNode{
		int data;
		LLNode next;
		LLNode(int data){
			this.data = data;
		}
	}

