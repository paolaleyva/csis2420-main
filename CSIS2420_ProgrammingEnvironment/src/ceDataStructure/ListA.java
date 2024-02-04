package ceDataStructure;

import java.util.Arrays;

/**
 * List A is a fixed-size list that stores integers in an array. 
 * 
 * @author PaolaL
 *
 */

public class ListA {
	
	private int[] items; // stores the list elements
	private int n; // keeps track of the number of elements
	
	public ListA(int capacity) {
		items = new int[capacity];
	}
	
	/**
	 * Returns the number of elements in the list
	 * @return the value of the field 
	 */
	public int size() {
		return n;
	}
	
	/**
	 * Determines whether the list is empty or not
	 * 
	 * @return true if there are no elements in the list
	 */
	public boolean isEmpty() {
		return n == 0;
	}
	
	/**
	 * Adds a new item to the list
	 * @param item
	 * @throws IllegalStateException f the list is full
	 */
	public void add(int item) {
		if (n == items.length) 
			throw new IllegalStateException(
					"Can't add elements to a full List");
		items[n++] = item;
	}

	@Override
	public String toString() {
		return "ListA [items=" + Arrays.toString(items) + ", n=" + n + "]";
	}
	
	/************** Test Client **************/
	
	public static void main(String[] args) {
		
		System.out.println("ListA Test Client");
		System.out.println("---------");
		
		ListA list = new ListA(5);
		System.out.println("size: " + list.size());
		System.out.println(list);
		System.out.println("This list "
				+ (list.isEmpty() ? "is" : "is not") + " empty.");
		System.out.println();
		
		list.add(5);
		System.out.println("size: " + list.size());
		System.out.println(list);
		System.out.println("The list "
				+ (list.isEmpty() ? "is" : "is not") + " empty");
		System.out.println();
		
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		System.out.println("size " + list.size());
		System.out.println(list);
		System.out.println();
		
		//list.add(35);
	}

}
