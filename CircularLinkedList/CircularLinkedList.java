package CircularLinkedList;
import SingleyLinkedList.ListNode;

public class CircularLinkedList {

	static ListNode headNode ;
	static ListNode lastNode;
	
	public static void main(String[] args)
	{
       ListNode node1 =new ListNode(1);		
       ListNode node2 =new ListNode(2);		
       ListNode node3 =new ListNode(3);		
       ListNode node4 =new ListNode(4);		
       ListNode node5 =new ListNode(5);		
       ListNode node6 =new ListNode(6);		
       ListNode node7 =new ListNode(7);	
       
       headNode = node1;
       headNode.next =node2;
       node2.next = node3;
       node3.next = node4;
       node4.next = node5;
       node5.next = node6;
       node6.next = node7;
       node7.next = headNode;
       lastNode = node7;
       
       printElements();
       
       System.out.println();
       
       insertAtBeginning();
}
	
	public static void printElements() {
		ListNode current = headNode;
		if(headNode ==null)
		{
			return;
		}
		else {
			while(current != lastNode) {
				System.out.print(current.data+"-->");
				current= current.next;
			}
			System.out.print(current.data);
			
		}
	}
 
	public static void insertAtBeginning() {
		
		ListNode node = new ListNode(0);
		if(headNode == null)
		{
			headNode  = node;
		}
		else {
			node.next = headNode;
			headNode = node;
			lastNode.next= headNode;
		}
		
		printElements();
	}

	public static void insertAtEnd() {
		ListNode node =new ListNode(8);
		if(lastNode == null)
		{
			lastNode = node;
			lastNode.next = lastNode;
		}
		else {
			lastNode.next = node;
		}
	}

	

	
	
	
	
}
