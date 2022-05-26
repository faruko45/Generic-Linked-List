package util.datastructures.linkedlist;

public class LinkedList<T extends Comparable<T>> {
	ListNode<T> head;
	int size;
	
	public LinkedList() {
		this.head = null;
		size = 0;
	}
	
	public boolean add(T obj) {
		ListNode<T> traverse = head;
		ListNode<T> newNode = new ListNode<T>(obj);
		if(traverse == null) {
			head = newNode;
			size++;
			return true;
		}
		else if(traverse.getObj().compareTo(newNode.getObj()) == 1) {
			newNode.setNext(head);
			head = newNode;
			size++;
			return true;
		}
		while(traverse.getNext() != null && traverse.getNext().getObj().compareTo(newNode.getObj()) <= 0) {
			traverse = traverse.getNext();
		}
		newNode.setNext(traverse.getNext());
		traverse.setNext(newNode);
		size++;
		return true;
	}
	
	public boolean remove(T obj) {
		ListNode<T> traverse = head, tail = null;
		while(traverse != null && traverse.getObj().compareTo(obj) != 0){
			tail = traverse;
			traverse = traverse.getNext();
		}
		if(traverse == null) {
			System.out.println("There is no element such that or list is empty.");
			return false;
		}
		else if(traverse.getObj().compareTo(head.getObj()) == 0) {
			head = head.getNext();
			size--;
			traverse.setNext(null);
			traverse = null;
		}
		else
		{
			tail.setNext(traverse.getNext());
			traverse.setNext(null);
			traverse = null;
			size--;
		}
		return true;
	}
	
	public void printList() {
		ListNode<T> traverse = head;
		if(size != 0) {
			while(traverse != null) {
				System.out.println(traverse.getObj().toString());
				traverse = traverse.getNext();
			}
		}
		else {
			System.out.println("List is empty.");
		}
	}
	
	public int getSize() { return this.size; }
}
