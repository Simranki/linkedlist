package linkedList;
// without using collection framework
public class ReverseL {
	Node head;
	private int size;
	ReverseL(){
		this.size=0;
	}
public class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
		size++;
	}
}
public void addFirst(int data) {
	Node newNode=new Node(data);
	if(head==null) {
		head=newNode;
		return;
	}
	newNode.next=head;
	head=newNode;
	
	
}
public void addLast(int data) {
	Node newNode = new Node(data);
	if(head == null) {
		head=newNode;
		return;
	}
	Node currNode=head;
	while(currNode.next != null) {
		currNode=currNode.next;
	}
	currNode.next=newNode;
}
public void printList() {
	if(head==null) {
		System.out.println("Empty list");
	}
	Node currNode=head;
	while(currNode!= null) {
		System.out.print(currNode.data + "->");
		currNode=currNode.next;
	}
	System.out.print("Null");
	System.out.println();
}
// To reverse a linked list using Iterative approach
public void reverseIterative() {
	if(head == null || head.next ==null) {
		return;
	}
	Node prevNode=head;
	Node currNode=head.next;
	while(currNode != null) {
		Node nextNode=currNode.next;
		currNode.next=prevNode;
		
		//update
		prevNode=currNode;
		currNode=nextNode;
	}
	head.next=null;
	head=prevNode;
}
// To reverse a linked list using recursive approach
public Node reverseRecursive(Node head) {
	if(head == null || head.next==null) {
		return head;
	}
Node newHead=	reverseRecursive(head.next);
	head.next.next=head;
	head.next=null;
	return newHead;
}
public int getsize() {
	return size;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseL list=new ReverseL();
		list.addFirst(2);
		list.addFirst(1);
		list.printList();
		list.addLast(3);
		list.printList();
		list.reverseIterative();
	//	list.head = list.reverseRecursive(list.head);
		list.printList();

	}

}
