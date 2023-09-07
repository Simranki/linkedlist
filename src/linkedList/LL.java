package linkedList;

public class LL {
	Node head;
	private int size;
	
	LL(){
		this.size=0;
	}
	public class Node{
		String data;
		Node next;
		
		Node(String data){
			this.data=data;
			this.next=null;
			size++;
		}
	}
	// 1. Insert
	//1.1 Add at first position
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
	}
	
	//1.2 Add at last position
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head=newNode;
			return;
		}
		Node currNode = head;
		while(currNode.next != null) {
			currNode=currNode.next;
		}
		currNode.next=newNode;
		
	}
	
	//2. Print Linked list
	public void printList() {
		if(head == null) {
			System.out.println("List is empty! ");
			return;
		}
		Node currNode=head;
		while(currNode!=null) {
			System.out.print(currNode.data+" -> ");
			currNode=currNode.next;
		}
		System.out.print("Null");
	}
	
	//3. Delete node from linked list
	// 3.1 delete from first position
	public void deleteFirst() {
		if(head == null) {
			System.out.println("List is empty ! ");
			return;
		}
		size--;
		head=head.next;
	}
	// 3.2 Delete from last position
	public void deleteLast() {
		if(head == null) {
			System.out.println("Empty list dude !");
			return;
		}
		// corner case: if suppose their is only one node present so if we do head.next 
		//then it will throw an error because it does not exist
		size--;
		if(head.next == null) {
			head=null;
			return;
		}
		Node secondLast=head;
		Node lastNode=head.next;
		while(lastNode.next != null) {
			lastNode=lastNode.next;
			secondLast=secondLast.next;
			
		}
		secondLast.next=null;
	}
	 public int getSize() {
		 return size;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LL list = new LL();
		list.addFirst("is");
		list.addFirst("name");
		
		list.addLast("Simran");
		list.addFirst("My");
		list.printList();
		System.out.println();
		list.deleteLast();
		list.printList();
		System.out.println();
		System.out.println(list.getSize());
		list.addLast("Simran");
		list.printList();
		System.out.println();
		System.out.println(list.getSize());

	}

}
