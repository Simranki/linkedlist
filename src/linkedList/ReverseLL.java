package linkedList;
import java.util.*;
public class ReverseLL {
//Reversing a linked list
	//1. Iterative approach
	public void reverseIterative() {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+"-> ");
		}
		System.out.print("Null");

	}

}
