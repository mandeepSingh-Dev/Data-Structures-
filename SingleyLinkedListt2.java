
public class SingleyLinkedListt2 extends SingleyLinkedListt{


	ListNode headNode;
	
	public static void main(String[] args)
	{
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(3);
		ListNode node6 = new ListNode(4);
		ListNode node7 = new ListNode(4);
		ListNode node8 = new ListNode(5);
		ListNode node9 = new ListNode(6);
		ListNode node10 = new ListNode(7);
		ListNode node11= new ListNode(8);
		ListNode node12= new ListNode(9);
		ListNode node13= new ListNode(9);
		


		
		SingleyLinkedListt2 singleyLinkedList2 = new SingleyLinkedListt2();
		singleyLinkedList2.headNode = node1;
		singleyLinkedList2.headNode.next  = node2;
		node2.next  = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		node8.next = node9;
		node9.next = node10;
		node10.next = node11;
		node11.next = node12;
		node12.next = node13;
		
		
		
		System.out.println("--------PRINTING ALL ELEMENTS-----------");
		SingleyLinkedListt.printAllElements(singleyLinkedList2.headNode);
		System.out.println("------------------------------------------------\n");

		System.out.println("--------Removing duplicates-----------");
	//	findDuplicateFromSortedList(singleyLinkedList2.headNode);
		System.out.println("------------------------------------------------\n");
	//	insertIntoSortedList(singleyLinkedList2.headNode);
}
	
	public static void findDuplicateFromSortedList(ListNode headNode) {
		
		if(headNode==null)
		{
			return;
		}
		else {
			ListNode current = headNode;
			while(current != null && current.next !=null )
			{
				if(current.data == current.next.data)
				{
					current.next = current.next.next;
				}else {
					current= current.next;
				}
			}
		}
		SingleyLinkedListt.printAllElements(headNode);
	}

    public static void insertIntoSortedList(ListNode headNode)    {
	 
    ListNode node = new ListNode(9);
    	if(headNode==null)
    	{
    		headNode = node;
    	}else {
    		ListNode current = headNode;
    		ListNode temp = null;
    		
    		while(current!=null && current.data < node.data) {
    		
    			temp = current;
    			current = current.next;
    		}
    		
    		node.next = current;
    		temp.next = node;
    	}
    	SingleyLinkedListt.printAllElements(headNode);
     }

    
}






































