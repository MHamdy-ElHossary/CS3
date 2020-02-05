import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Problem2 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(6);
		list.add(8);
		list.add(9);
		System.out.println("Original List :- " + list);
		//insertSorted(list, number);
		list.add(number);
		Collections.sort(list);
		System.out.println("New List :- " + list);
	}
	
	public static void insertSorted(LinkedList<Integer> list, int number) {
		ListIterator<Integer> iterator = null;
		iterator = list.listIterator();
		int i = 0;
		int temporary;
		while (iterator.hasNext()) {
			temporary = list.get(i);
			if (number <= temporary ) {
				list.add(number);
			}
			else i++;
        }
		
	}

}
