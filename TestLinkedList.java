package custom;

public class TestLinkedList {

	public static void main(String[] args) {
		Node<String> n = new Node<>();
		System.out.println(n);
		Node<String> n2 = new Node<>("something", null, null);
		n2.setPrev(n);
		n.setNext(n2);
		
		System.out.println(n2);
		System.out.println("Prev of n2 is " + n2.getPrev());
		System.out.println("Next of n is " + n.getNext());
		
		LinkedList<String> ll = new LinkedList<>();
		System.out.println(ll);
		ll.add("nada");
		System.out.println(ll);
		ll.add("something else");
		System.out.println(ll);
		System.out.println(ll.getSize());
		
		// Check the head and tail are as expected
		System.out.println(ll.getHead());
		System.out.println(ll.getTail());
		
		System.out.println(ll.getHead().getNext());
		System.out.println(ll.getTail().getPrev());
		
		// Empty List
		LinkedList<String> lst = new LinkedList<>();
		try {
		System.out.println(lst.get(0));
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		try {
		System.out.println(ll.get(2));
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		System.out.println(ll.remove(0));
		System.out.println("ll contains : " + ll);
		System.out.println(ll.remove(0));
		try {
			System.out.println(ll.remove(0));
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Error was " + e.getMessage());
		}
		
		ll.add("a");
		ll.add("b");
		ll.add("c");
		ll.add("d");
		ll.add("e");
		
		System.out.println(ll.remove(4));
		System.out.println(ll);
		
		System.out.println(ll.remove(1));
		System.out.println(ll);
		
		System.out.println("---------------");
		System.out.println(ll);
		System.out.println(ll.remove("a"));
		System.out.println(ll);
		ll.remove(0);
		ll.remove(0);
//		ll.remove(0);
//		ll.remove("a");
		
		System.out.println(ll);
		ll.add("a");
		ll.add("g");
		ll.add("g");
		System.out.println(ll);
//		ll.remove("g");
		System.out.println(ll.remove("g"));
		System.out.println(ll);
//		System.out.println(ll.replace("g", "b"));
//		System.out.println(ll);
	}

}
