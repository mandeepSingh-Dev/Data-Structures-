
public class SingleyLinkedListt {


	ListNode headNode;
	
	public static void main(String[] args)
	{
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		ListNode node6 = new ListNode(6);
		ListNode node7 = new ListNode(7);
		ListNode node8 = new ListNode(8);
		ListNode node9 = new ListNode(9);
		//these nodes are duplicates of above
	
		
		SingleyLinkedListt singleyLinkedList = new SingleyLinkedListt();
		singleyLinkedList.headNode = node1;
		singleyLinkedList.headNode.next  = node2;
		node2.next  = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		node8.next = node9;

		
		//printing all elements
		System.out.println("--------PRINTING ALL ELEMENTS-----------");
		printAllElements(singleyLinkedList.headNode);
		System.out.println("------------------------------------------------\n");
	
		
		//printing firstElement
		System.out.println("--------PRINTING FIRST ELEMENT-----------");
			printFirstElement(singleyLinkedList.headNode);
		System.out.println("------------------------------------------------");

		System.out.println("--------INSERT AT BEGINNING-----------");
		ListNode node0 = new ListNode(0);
		insertAtBeginning(node0,singleyLinkedList.headNode);
	System.out.println("------------------------------------------------");
	
	System.out.println("--------INSERT AT END-----------");
	ListNode node10 = new ListNode(10);
	insertAtEnd(node10,singleyLinkedList.headNode);
	System.out.println("------------------------------------------------");

	System.out.println("--------INSERT AT POSITION-----------");
	ListNode node22 = new ListNode(22);
	insertAtGivenPosition(3,node22, singleyLinkedList.headNode);
	System.out.println("------------------");
	
	System.out.println("--------DELETE FIRST EMT-----------");
	deleteFirstNode(singleyLinkedList.headNode);
	System.out.println("-------------------");
	
	System.out.println("--------DELETE LAST EMT-----------");
	deleteLastNode(singleyLinkedList.headNode);
	System.out.println("-------------------");

	System.out.println("--------DELETE node at position -----------");
	deleteNodeAtPosition(3,singleyLinkedList.headNode);
	System.out.println("-------------------");

	System.out.println("--------SEARCH node -----------");
	searchElement(4,singleyLinkedList.headNode);
	System.out.println("-------------------");

	System.out.println("--------REVERSE LIST -----------");
//	reverseList(singleyLinkedList.headNode);
	System.out.println("-------- -----------");
	
	System.out.println("--------FIND MIDDLE NODE -----------");
	findMiddleNode(singleyLinkedList.headNode);
	System.out.println("------------------------------------------");
	
	System.out.println("--------FIND Nth NODE from END-----------");
	findNthNodefromEnd(7, singleyLinkedList.headNode);
	System.out.println("------------------------------------------");

	
	
	}
	
	public static int getSize(ListNode headNode)
	{
         int count = 0;
		ListNode current = headNode;
		while(current!=null)
		{	
			System.out.println(current.data);
			current = current.next;
			count++;
		}
		return count;
	}
	
	public static void printAllElements(ListNode headnode) {


			ListNode current = headnode;
		while(current!=null)
		{	
			System.out.println(current.data);
			current = current.next;
		}
	}

	public static  void printFirstElement(ListNode headNode) {
		System.out.println(headNode.next.next.data);
	}
	
	public static void insertAtBeginning(ListNode node,ListNode headNode) {
		
	           if(headNode==null)
	           {
	        	   headNode = node;
	           }
	           else {
	        	   node.next =headNode;
	           }
	           headNode  = node;
	           printAllElements(headNode);
	}

	public static void insertAtEnd(ListNode endNode, ListNode headNode) {
		
		ListNode current = headNode;
		while(current.next !=null)
		{
			current  = current.next;
		}
		current.next = endNode;
		printAllElements(headNode);
	}
	
	public static void insertAtGivenPosition(int pos, ListNode newNode,  ListNode headNode) {
		
		if(pos == 1)
		{
			newNode.next = headNode;
			headNode = newNode;
		}
		else {
			int count = 1;
			ListNode previousNode = headNode;
			while(count<pos-1) 
			{
			 previousNode = 	previousNode.next;
			 count++;
			}
			newNode.next = previousNode.next;
			previousNode.next = newNode;	
		}
		
		printAllElements(headNode);
		
	}

	public static void deleteFirstNode(ListNode headNode) {
		if(headNode==null)
		{
			System.out.println("list is empty");
		}else {
			ListNode temp = headNode;
			headNode = headNode.next;
			temp = null;
		}
		
		printAllElements(headNode);
	}

	public static void deleteLastNode(ListNode headNode) {
		if(headNode==null)
		{
			System.out.print("list is empty");
		}else {
			ListNode current = headNode;
			ListNode previous = null;
			
			while(current.next!=null)
			{
				previous = current; 
				current =current.next;
			}
			previous.next = null;
			
		}
		printAllElements(headNode);
		
	}

	public static void deleteNodeAtPosition(int position, ListNode headNode) {

		
		if(headNode==null)
		{
			System.out.print("list is empty");
		}else{
			int count =1;
          ListNode previous = headNode;
          while(count<position-1)
          {
        	  previous = previous.next;
        	  count++;
          } 
       //   ListNode temp = previous.next;
          ListNode current = previous.next;
         
          previous.next =current.next;
          current = null;
		}
		printAllElements(headNode);
	}

	public static void searchElement(int key, ListNode headNode) {
		if(headNode==null)
		{
			System.out.println("list is empty");
		}
		else {
			ListNode current = headNode; 
			int count = 1;
			while(current!=null)
			{
				if(current.data==key)
				{
					System.out.println("Element "+key+" is at index position : "+count);
					break;
				}
				current = current.next;
				count++;
			}
		}
	}

	public static void reverseList(ListNode headNode) {



	     ListNode current = headNode;
	     ListNode next = null;
	    ListNode previous = null;
	    
	    while(current!=null)
	    {
	    	next = current.next;
	    	current.next = previous;
	    	previous =current;
	    	current = next;
	    	
	    }
	    headNode = previous;
	    
	    printAllElements(headNode);
	    System.out.println("---------middle node in reverseList function---------");
	    findMiddleNode(headNode);
	    System.out.println("----------------------------------------------------------");
			
		}

	public static void findMiddleNode(ListNode headNode ) {
		
		ListNode slowptr = headNode;
		ListNode fastptr = headNode;
		
	   while(fastptr.next!=null & fastptr!=null)
	   {
		   slowptr = slowptr.next;
		   fastptr = fastptr.next.next;
	   }
	  System.out.println(slowptr.data);
		
		
	}

	public static void findNthNodefromEnd(int n, ListNode headNode) {

		ListNode mainptr = headNode;
		ListNode refptr= headNode;
		
		int count = 1;
		while(count<=n)
		{
			refptr = refptr.next;
			count++;
		}
		while(refptr!=null)
		{
			refptr = refptr.next;
			mainptr = mainptr.next;
		}
		System.out.println(n+"th node is "+mainptr.data);
	}


	
	

}
