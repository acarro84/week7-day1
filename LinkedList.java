package custom;

public class LinkedList<E> {

	private Node<E> head;
	private Node<E> tail;

	private int size;

	public LinkedList() {
	}

	public int getSize() {
		return size;
	}

	public void add(E e) {
		if (size == 0) {
			head = new Node<E>(e, null, null);
			tail = head;
			size++;
		} else {
			// append to end
			Node<E> n = new Node<E>(e, null, null);
			Node<E> oldTail = tail;
			// update the tail
			tail = n;
			// update the tail's prev
			n.setPrev(oldTail);
			// update the oldTail's next
			oldTail.setNext(n);
			size++;
		}
	}

	@Override
	public String toString() {
		String values = "[";
		// null checks
		if (head == null) {
			values += "]";
			// Iterate through the nodes and get the values
		} else {
			Node<E> n = head;
			while (n != null) {
				// get the value
				values += n.getValue();
				// update n
				n = n.getNext();
				if (n != null)
					values += ", ";
			}
			values += "]";
		}
		return values;
	}

	public E get(int index) {
		// check valid index
		if (index < 0 || index > size - 1) // if size is 0 and index = 0, index <0 is false || 0>0-1 is true
			throw new IndexOutOfBoundsException("index: " + index);
		Node<E> n = head;
		for (int i = 0; i < index; i++) {
			n = n.getNext();
		}
		return n.getValue();
	}

	public E remove(int index) {
		if (index < 0 || index > size - 1) // if size is 0 and index = 0, index <0 is false || 0>0-1 is true
			throw new IndexOutOfBoundsException("index: " + index);
		// case where there is 1 element
		Node<E> n = head;
		if (size == 1) {

			head = null;
			tail = null;
		}
		// case where index is the last element
		else if (index == size - 1) {
			n = tail;
			tail.getPrev().setNext(null);
			tail = tail.getPrev();
		}
		// case where index is the first element
		else if (index == 0) {
			n = head;
			head.getNext().setPrev(null);
			head = head.getNext();
		}
		// case where index is inside of the list
		else {
			n = head;
			for (int i = 0; i < index; i++) {
				n = n.getNext();
			}
			// set the prev's next to the next
			n.getPrev().setNext(n.getNext());
			// set the next's prev to the prev
			n.getNext().setPrev(n.getPrev());
		}
		size--;
		return n.getValue();
	}

	public boolean remove(String s) {
		Node<E> n = head;
		if (size == 0) {
			throw new NullPointerException("No elements exist in the Linked List");
		}
		if (size > 0) {
			for (int i = 0; i < size; i++) {
//				n = n.getNext();
				if (n.getValue().equals(s)) {
					remove(i);

					return true;

				} else {
					n = n.getNext();
					continue;

				}

			}
		} else

			return false;
		return false;
	}
	
	public boolean replace(E a, E b) {
		Node<E> n = head;
		if (size == 0) {
			throw new NullPointerException("No elements exist in the Linked List");
		}
		if (size > 0) {
			for (int i = 0; i < size; i++) {
//				n = n.getNext();
				if (n.getValue().equals(a)) {
					n.setValue(b);
					return true;

				} else {
					n = n.getNext();
					continue;

				}

			}
		} else

			return false;
		return false;
		
	}

	Node<E> getHead() {
		return head;
	}

	Node<E> getTail() {
		return tail;
	}

}
