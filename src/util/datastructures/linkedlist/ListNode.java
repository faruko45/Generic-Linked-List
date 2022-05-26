package util.datastructures.linkedlist;

public class ListNode<T> {
	T obj;
	ListNode<T> next;
	
	public ListNode(T obj){
		this.obj = obj;
		next = null;
	}
	
	public T getObj() { return obj; }
	public void setNext(ListNode<T> next){ this.next = next; }
	public ListNode<T> getNext(){ return this.next; }
}
