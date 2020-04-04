package com.datastructure;


public class LinkedList {
	
	private class Node
	{
		private int data;
		private Node next;
		
		Node(int data)
		{
			this.data=data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}
	}
	
	private Node head;
	
	private int size;

	public void addFront(int data)
	{
		Node newNode= new Node(data);
		if(head==null)
			head=newNode;
		else
		{
			newNode.setNext(head);
			head=newNode;
		}
		this.size++;
	}
	
	public int getFirst()
	{
		return head!=null? head.data: null;
	}
	
	public int getLast()
	{
		if(head==null)
			throw new IllegalStateException("Linked List is empty");
		Node current=head;
		while(current.getNext()!=null)
		{
			current=current.getNext();
		}
		return current.data;
	}
	
	public int size()
	{
		return this.size;
	}
	
	public void addBack(int data)
	{
		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		else {
			Node current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.next = newNode;
		}
		this.size++;
	}
	
	public void clear()
	{
		this.head=null;
		this.size=0;
	}
	
	public void deleteValue(int data)
	{
//		if (head == null) {
//			throw new IllegalStateException("Linked list is empty");
//		}
//		if(this.head.data==data)
//		{
//			this.head=this.head.getNext();
//			return;
//		}
//		Node currentNode = this.head.getNext();
//		Node previousNode = this.head;
//		while (currentNode.getNext() != null) {
//			if (currentNode.data == data) {
//				previousNode.next = currentNode.getNext();
//				this.size--;
//				break;
//			}
//			currentNode=currentNode.getNext();
//			previousNode = currentNode;
//		}
		
		if(head==null)
			return;
		if(head.data==data)
		{
			head=head.getNext();
			return;
		}
		Node currentNode = this.head;
		while(currentNode.getNext()!=null)
		{
			if(currentNode.getNext().data==data)
			{
				currentNode.setNext(currentNode.getNext().getNext());
				size--;
				return;
			}
			currentNode=currentNode.getNext();
		}
	}
	
	public void print() {
		Node currentNode = this.head;
		while(currentNode!=null)
		{
			System.out.print(" "+currentNode.data);
			currentNode=currentNode.getNext();
		}
	}
}
