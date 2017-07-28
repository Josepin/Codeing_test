package ReverseList;



public class ReverseList {
	public static ListNode printReverseList(ListNode head) {
		if(head==null)
			return null;
		ListNode pre=null;
		ListNode next=null;
		while(head!=null){
			next=head.next;
		    head.next=pre;
		    pre=head;
		    head=next;
		}
		
		return pre;
		

    }
	
	 public static void main(String[] args) {  
		   ListNode pre=new ListNode(0);
	        ListNode node1 = new ListNode(1);  
	        ListNode node2 = new ListNode(2);  
	        ListNode node3 = new ListNode(3);  
	        node1.next = node2;  
	        node2.next = node3;  
	        pre=printReverseList(node1);  
	        while(pre!=null){
	        	System.out.println(pre.val);
	        	pre=pre.next;
	        }
	       
	          
	          
	    }  
}
