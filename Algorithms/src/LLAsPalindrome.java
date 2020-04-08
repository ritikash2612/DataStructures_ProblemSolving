
public class LLAsPalindrome {

	
	static public boolean isPalindrome(ListNode head) {
	       ListNode reversed = reverseAndCopy(head);
	        return isEqual(head, reversed);
	    }
	    
	static ListNode reverseAndCopy(ListNode node){
	        ListNode head = null;
	        while(node != null){
	            ListNode n = new ListNode(node.val);
	            n.next = head;
	            head = n;
	            node = node.next;
	        }
	        return head;
	    }
	    
	   static boolean isEqual(ListNode one, ListNode two){
	        while(one != null && two != null){
	            if(one.val != two.val){
	            	System.out.println("here");
	                return false;
	            }
	            one = one.next;
	            two = two.next;
	        }
	         return false;
	    }
	   

	public static void main(String[] args) {

		ListNode n = new ListNode(1);
		n.next = new ListNode(1);
		
		System.out.println(isPalindrome(n));
		
	}

}
