package ceDataStructure;

import java.util.NoSuchElementException;

/**
 * ListB is a singly-linked list of integers.
 * 
 * @author PaolaL
 *
 */

public class ListB {
	
	private Node head; // first node of the list or null
	private Node tail; // last node of the list or null
	private int n; // number of integers in the list
	
	private static class Node {
		private int item;
		private Node next;
	}
	
	/**
	 * Returns the number of elements in the list
	 * @return value of the field
	 */
	public int size() { 
		return n;
	}
	
	/**
	 * Determines whether the list is empty or not.
	 * @return true if there are no elements in the list.
	 */
	public boolean isEmpty() {
		return n == 0;
	}
	
	/**
	 * Returns the last element in the list.
	 * @return last item in the list.
	 * @throws NoSuchELementException if the list is empty. 
	 */
	public int lastItem() {
		if (n == 0)
		throw new NoSuchElementException(
				"Can't access the last element of an empty list.");
		return tail.item;
	}
	
	/**
	 * Adds a new item at the end of the list.
	 * 
	 * @param newItem
	 */
	public void add(int newItem) {
	    Node newNode = new Node();
	    newNode.item = newItem;
	    
	    if (isEmpty()) 
	        head = newNode;
	    else 
	        tail.next = newNode;
	    
	    tail = newNode;
	    n++;
	} 
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node current = head;
		while (current != null) {
			sb.append(current.item).append(" ");
			current = current.next;
		}
		return sb.toString();
	}
	
	/* * * * * * * * Test Client * * * * * * */

	public static void main(String[] args) {
	    System.out.println("ListB Test Client");
	    System.out.println("-----------------");
	    
	    ListB list = new ListB();
	    printListInfo(list);
	    
	    list.add(11);
	    printListInfo(list);
	    
	    list.add(22);
	    printListInfo(list);

	    list.add(33);
	    printListInfo(list);
	    list.add(44);
	    printListInfo(list);
	}

	private static void printListInfo(ListB list) {
	    System.out.println("size: " + list.size());
	    if (list.isEmpty())
	        System.out.println("The list is empty.");
	    else
	        System.out.println("last element : " + list.lastItem());  
	    System.out.println(list);
	    System.out.println();
	}
	
}




