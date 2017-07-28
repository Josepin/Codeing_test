package SortTwoList;



public class SortTwoList {
	 public static  ListNode Merge(ListNode list1,ListNode list2) {
		 if(list1==null)
		   return list2;
	     if(list2==null)
		   return list1;
	     if(list1.val<=list2.val){
	    	 list1.next=Merge(list1.next, list2);
	    	 return list1;
	    	 }else{
		    	 list2.next=Merge(list1, list2.next);
		    	 return list2;
	    	 } 
	     }
		 
		 
		 
		 
		 
		 
		 
		 
//		 if(list1==null)
//			 return list2;
//		 if(list2==null)
//			 return list1;
//		 ListNode currenthead=null;
//		 ListNode current=null;
//		 while(list1!=null&&list2!=null){
//		 if(list1.val<=list2.val)
//		 {
//			 if(currenthead==null){
//				 currenthead=current=list1;
//				 
//			 }else{
//				 current.next=list1;
//				 current=current.next;
//			 }
//			 list1=list1.next;
//		 }else{
//			 if(currenthead==null){
//				 currenthead=current=list2;
//				 
//			 }else{
//				 current.next=list2;
//				 current=current.next;
//			 }
//			 list2=list2.next;
//			 
//		 }
//		 }
//		 if(list1==null)
//			 current.next=list2;
//		 if(list2==null)
//	        current.next=list1;
//		 
//		 return currenthead;
	    



	 public static void main(String[] args) {  
		    
	        ListNode node1 = new ListNode(1);  
	        ListNode node2 = new ListNode(4);  
	        ListNode node3 = new ListNode(8);  
	        node1.next = node2;  
	        node2.next = node3;  
	        
	        ListNode node11 = new ListNode(5);  
	        ListNode node21 = new ListNode(7);  
	        ListNode node31 = new ListNode(9);  
	        node11.next = node21;  
	        node21.next = node31;  
	        Merge(node1 ,node11); 
	       // pre=printReverseList(node1);  
	        //while(pre!=null){
	        	//System.out.println(pre.val);
	        	//pre=pre.next;
	        }
	       
	          
	          
	    }  
	 


