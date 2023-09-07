package linkedList;

public class DoublyLL {
	 Node head;
	 Node tail;
	public class Node{
		int data;
		Node prev;
		Node next;
		
		Node(int data){
			this.data=data;
			this.prev=null;
			this.next=null;
		}
	}
	
DoublyLL(){
	this.head=null;
	this.tail=null;
}
// 1. Traversing in a doubly linked list
//1.1 Traversing from head to the end of the list:
public  void headToNull() {
	Node current = head;
	if(head == null) {
		System.out.print("Empty list");
		return;
	}
	System.out.println("This is");
	while(current != null) {
		System.out.print(current.data+" -> ");
		current = current.next;
	}
	//System.out.print("Null");
}
// 1.2 Traversing from tail to the head of the doubly linked list:
public  void tailToHead() {
	Node current = tail;
	if(tail == null) {
		System.out.print("Empty list");
		return;
	}
	while(current != null) {
		System.out.print(current.data+" <- ");
		current = current.prev;
	}
	System.out.print("Null");
}

//2.Insertion
//2.1 Insert at beginning of the doubly LL
public void insertAtBeginning(int data) {
	Node newNode = new Node(data);
	if(head==null) {
		head=null;
		tail=null;
		return;
	}
	else {
		newNode.next=head;
		head.prev=newNode;
		head=newNode;
		
	}
}
//2.2 Insert at the end of the doublyLL
public void insertAtEnd(int data) {
	Node newNode = new Node(data);
		if(tail== null) {
			head=null;
			tail=null;
			return;
		}
		else {
			Node current =head;
			while(current !=null) {
				current.next=newNode;
				newNode.prev=current;
				tail=newNode;
			}
		}
		
	//
}
// 3. deleting the node
//3.1 Deleting the node at the beginning
public void deleeAtFirst() {
	if(head == null) {
		return;
	}
	if(head == tail) {
		head = null;
		tail = null;
		return;
	}
	head = head.next;
	head.prev = null;
}
// 3.2 Deleting the node at the end

public void deleteAtEnd() {
	if(head == null) {
		return;
	}
	if(head == tail) {
		head = null;
		tail = null;
		return;
	}
	Node current = head;
	while(current.next != null) {
		current=current.prev;
		current.next=null;
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLL list = new DoublyLL();
		list.insertAtBeginning(1);
		list.insertAtBeginning(2);
		list.insertAtBeginning(3);
		list.insertAtEnd(9);
		list.headToNull();
		

	}

}
