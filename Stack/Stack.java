package Stack;
import SingleyLinkedList.ListNode;

public class Stack {

    static	ListNode top;
	
	public static void main(String[] args) {
		
		push(1);
		push(2);push(3);push(4);push(5);
		
		pop();
		printElements();

	}
	
	public static void printElements() {
		ListNode current = top; 
		while(current!=null) {
			System.out.println(current.data);
		    	current = current.next;
		}
	}
	public static void push(int data)
	{
		ListNode node = new ListNode(data);
		
		node.next = top;
	    top = node;	
	}
	
	public static void pop() {

		ListNode temp = top.next;
		top =temp;
		
	}
}





















