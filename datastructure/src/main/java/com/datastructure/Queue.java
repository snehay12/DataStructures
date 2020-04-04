package com.datastructure;

public class Queue {

	private class Node
	{
		private int data;
		private Node next;
		
		Node(int data)
		{
			this.data=data;
		}
	}
	
	private Node head;
	
	private Node tail;
	
	private int size;
	
	public void add(int data)
	{
		Node newNode = new Node(data);
		if(head==null && tail==null)
		{
			head=tail=newNode;
		}
		tail.next=newNode;
		tail=newNode;
		this.size++;
	}
	
	public int remove()
	{
		if(head==null)
			throw new IllegalStateException("Queue is empty");
		int removeVal = head.data;
		head=head.next;
		size--;
		if(head==null)
			tail=null;
		return removeVal;
	}
	
	public boolean isEmpty()
	{
		return size==0?true:false;
	}
	
	public int size()
	{
		return this.size;
	}
	
	 public int rear()
	    {
	    	return tail.data;
	    }
	
	public int peek()
	{
		if(head==null)
			throw new IllegalStateException("Queue is empty");
		return head.data;
	}
}

