package custom;
//Node is a generic class
//          ========
public class Node<E> { // E is a type parameter that is provided when an instance of this type is created
					   //        --------------
	
	private E value;
	private Node<E> prev;
	private Node<E> next;
	
	public Node() {
		
	}
	
	public Node(E value, Node<E> prev, Node<E> next) {
		super();
		this.setValue(value);
		this.setPrev(prev);
		this.setNext(next);
	}

	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}

	public Node<E> getPrev() {
		return prev;
	}

	public void setPrev(Node<E> prev) {
		this.prev = prev;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return "Node value=" + value;
	}
	
}
