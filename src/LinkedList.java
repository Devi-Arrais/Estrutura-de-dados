
public class LinkedList implements List {

	private Node head;

	@Override
	public void add(int value) {

		Node newNode = new Node(value);

		if (head == null) {
			head = newNode;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}

			current.next = newNode;
		}

	}

	@Override
	public void remove(int value) {
		// TODO Auto-generated method stub

	}

	public boolean search(int value){
		if (this.head == null){
			return false;
		}
		Node current = this.head;
		while(current != null){
			if(current.content == value){
				return true;
			}
			current = current.next;
		}
		return false;
	}

	@Override
	public String show() {
		if (this.head == null) {
			return "lista vazia";
		}

		String out = "";
		Node current = this.head;
		while (current != null) {
			out += current.content + ' ';
			current = current.next;
		}
		return out;
	}

	@Override
	public void update(int position, int value) {
		if(this.head==null) {
			return;
		}
		if (position < 1 || position > this.size()) {
			return;
		}

		int count = 1;

		Node i = this.head;
		while (i != null) {
			
			if(count==position) {
				i.content = value;
				break;
			}
			
			count++;
			i = i.next;
		}
	}

	@Override
	public int size() {
		int count = 0;

		Node i = this.head;
		while (i != null) {
			count++;
			i = i.next;
		}

		return count;
	}
}
