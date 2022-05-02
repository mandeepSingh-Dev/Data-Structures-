package SingleyLinkedList;

public class SingleyLinkedListLoop {



	static ListNode headNode;
	
	public static void main(String[] args)
	{
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
	
	
		
		SingleyLinkedListLoop singleyLinkedList = new SingleyLinkedListLoop();
		headNode = node1;
	    headNode.next  = node2;
		node2.next  = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node3;
	
		
	detectLoop();
	
	findStartOfLoop();
		
	}
	
  public static  ListNode detectLoop() {
	  
		ListNode slowptr = headNode;
		ListNode fastPtr = headNode;
		
		while(fastPtr!=null && fastPtr.next!=null)
		{
			slowptr = slowptr.next;
			fastPtr = fastPtr.next.next;
			
			if(slowptr==fastPtr)
			{
				return slowptr;
			}
		}
		
      return slowptr;
	}

   public static void findStartOfLoop() {
 
	   ListNode slowptr  = detectLoop(); 
	  ListNode temp = headNode; 

	  while(slowptr != temp) { 
		  temp = temp.next;
	      slowptr = slowptr.next;

	  }
	  System.out.println(slowptr.data);
   }

   //Remove loop 
   public static void removeLoop(ListNode headNode) {
	   
	   ListNode slowptr = detectLoop();	   
	   
	   ListNode temp = headNode;
	   while(temp.next != slowptr.next)
	   {
		   temp = temp.next;
		   slowptr = slowptr.next;
	   }
	   slowptr.next = null;
   }
   
}
