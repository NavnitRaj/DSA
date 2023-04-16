
public interface LinkedListInt {
	public void display();
	public Link find(int key);
	public void insertFirst(int key, int data);
	public Link deleteFirst();
	public Link delete(int key);
	public boolean isEmpty();
	public int length();
	public void sort();
	public LinkedList reverse();
	public void concatenate(LinkedList list);
}
