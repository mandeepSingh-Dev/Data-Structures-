package DoublyLinkedList;

import javax.xml.transform.Templates;

public class DoublyLinkedList {

 static  ListNode headNode;
 static ListNode tailNode;
 
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
	 
	headNode = node1;
	headNode.next = node2;
	node2.next = node3;
	node3.next = node4;
	node4.next = node5;
	node5.next = node6;
	node6.next = node7;
	node7.next = node8;
	node8.next = node9;
	
	node9.previous = node8;
	node8.previous = node7;
	node7.previous = node6;
	node6.previous = node5;
	node5.previous = node4;
	node4.previous = node3;
	node3.previous = node2;
	node2.previous = node1;
	tailNode = node9;
	
	printInForward();
	
	System.out.println("");
	
	printInBackward();
	
	System.out.println("");

	insertAtBeginning();
	
	System.out.println("");

	insertAtEnd();
	
	System.out.println("");

	deleteFirstNode();
	
	System.out.println("");

	deleteLast();
 }
 
    public static void printInForward() {

    	
    	ListNode current = headNode;
    	while(current!=null)
    	{
    		System.out.println(current.data);
    		current= current.next;
    	}
    }

    public static void printInBackward() {
    	ListNode current = tailNode;
    	while(current!=null)
    	{
    		System.out.println(current.data);
    		current = current.previous;
    	}
    }
	
    public static void insertAtBeginning() {

    	ListNode node = new ListNode(0);
    	ListNode current = headNode;
    	if(headNode==null)
    	{
    		current = headNode;
    	}
    	else {
    		node.next = headNode;
    		headNode = node;
    	}
    	printInForward();
    }

    public static void insertAtEnd() {
    	ListNode node = new ListNode(10);
    	
    	if(tailNode==null || headNode==null) {
    		headNode =node;
    	}else {
    		tailNode.next =node;
    		node.previous = tailNode;
    		
    	}
    	tailNode =node;
    	printInForward();
    	
    }

    public static void deleteFirstNode() {
    	ListNode temp = headNode;
    	if(headNode==null)
    	{
    		return;
    	}else {
    		headNode.next.previous = null;  		
    	}
    	
    	headNode = headNode.next;
    	temp.next = null;
    	
    	printInForward();
    }
    
    public static void deleteLast() {
    	ListNode temp = tailNode; 
    	if(headNode==tailNode)
    	{
    		headNode = null;
    	}
    	else {
    		tailNode.previous.next = null;
    	}
    	tailNode = tailNode.previous;
    	temp.previous = null;
    	
    	printInForward();
    }
    
    
    
}
