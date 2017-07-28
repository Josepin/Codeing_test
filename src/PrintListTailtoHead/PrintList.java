package PrintListTailtoHead;
//import java.util.ArrayList;
import java.util.Stack;

public class PrintList {
//	static ArrayList<Integer> arrayList=new ArrayList<>();  
//	 public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
//	     
//		 ListNode node=listNode;
//	        if(node!=null)
//	        {
//	        	printListFromTailToHead(node.next);
//	        	arrayList.add(node.val);
//	        	System.out.println(node.val+"");
//	        }
//	        return arrayList;
//	    }
//	 
	 public static void printListFromTailToHead(ListNode listNode){
		 Stack<Integer> stack=new Stack<>();
		 
		 while(listNode!=null){
			 stack.push(listNode.val);
			 listNode=listNode.next;
		 }
		 while(!stack.isEmpty()){
			 System.out.println(stack.pop());
			 
		 }
		 
	 }
	 
	 public static void main(String[] args) {  
		   // ArrayList<Integer> arrayList=new ArrayList<>();  
	        ListNode node1 = new ListNode(1);  
	        ListNode node2 = new ListNode(2);  
	        ListNode node3 = new ListNode(3);  
	        node1.next = node2;  
	        node2.next = node3;  
	        printListFromTailToHead(node1);  
	       
	          
	          
	    }  
}
