package RemoveSameNode;

//import Standard.stdOut;

public class RemoveSameNode {

	public  static ListNode deleteDuplication(ListNode pHead)
    {
		if(pHead==null){
			return null;
			}
		ListNode root=new ListNode(-1);
		root.next=pHead;
		ListNode pre=root;
		ListNode node=pHead;
		
		while(node!=null&&node.next!=null)
			
		{	if(node.val==node.next.val){
			while(node.next!=null&&node.val==node.next.val)
			{
				node=node.next;
				
			}
			pre.next=node.next;	
		}else{
			pre.next=node;
			pre=pre.next;
			
			
		}
		node=node.next;
		}
		return root.next;

    }
	
	 public static void main(String[] args) {  
		 //  ListNode head=new ListNode(-1);
	        ListNode node1 = new ListNode(1);  
	        ListNode node2 = new ListNode(2);  
	        ListNode node3 = new ListNode(2);  
	        ListNode node4 = new ListNode(4);  
	        ListNode node5 = new ListNode(4);  
	        ListNode node6 = new ListNode(5);  
	         
	    //   head.next=node1;
	        node1.next = node2;  
	        node2.next = node3;  
	        node3.next = node4;  
	        node4.next = node5;  
	        node5.next = node6;  
	       // node6.next = node7;  
//	        while(node1!=null){
//	        	System.out.println(node1.val+"");
//	        	node1=node1.next;
//	        }
	        System.out.println("**************************");
	        ListNode  pre=deleteDuplication(node1); 
	       // System.out.println(pre.val);
	     //   stdOut.printList(pre);
	        while(pre!=null){
	        	System.out.println(pre.val);
	        	pre=pre.next;
	        }
	       
	          
	          
	    }  
}
