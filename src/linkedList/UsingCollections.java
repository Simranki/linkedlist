package linkedList;
import java.util.*;
public class UsingCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>list=new LinkedList<String>();
		list.addFirst("is");
		list.addFirst("name");
		list.addFirst("My");
		System.out.println(list);
		list.addLast("Simran");
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" -> ");
		}
		System.out.print("Null");

	
	list.addLast("Kumari");
	System.out.println();
	System.out.println(list);
	list.removeLast();
	System.out.println(list);
	list.removeFirst();
	System.out.println(list);
	list.remove(2);
	System.out.println(list);
	list.add(2,"Simran");
	System.out.println(list);
	}

}
