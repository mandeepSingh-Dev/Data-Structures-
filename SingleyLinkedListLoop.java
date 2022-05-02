
public class SingleyLinkedListLoop {



	ListNode headNode;
	
	public static void main(String[] args)
	{
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
	
	
		
		SingleyLinkedListLoop singleyLinkedList = new SingleyLinkedListLoop();
		singleyLinkedList.headNode = node1;
		singleyLinkedList.headNode.next  = node2;
		node2.next  = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node3;
	
		
	detectLoop(singleyLinkedList.headNode);
	
	findStartOfLoop(singleyLinkedList.headNode);
		
	}
	
  public static  ListNode detectLoop(ListNode headNode) {
	  
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

   public static void findStartOfLoop(ListNode headNode) {
 
	   ListNode slowptr  = detectLoop(headNode); 
	  ListNode temp = headNode; 

	  while(slowptr != temp) { 
		  temp = temp.next;
	      slowptr = slowptr.next;

	  }
	  System.out.println(slowptr.data);
   }

   //Remove loop 
   public static void removeLoop(ListNode headNode) {
	   
	   ListNode slowptr = detectLoop(headNode);	   
	   
	   ListNode temp = headNode;
	   while(temp.next != slowptr.next)
	   {
		   temp = temp.next;
		   slowptr = slowptr.next;
	   }
	   slowptr.next = null;
   }
   
}
