package com.datastructure;

public class Stack {
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
	
	private int size;
	
	public void push(int data)
	{
		Node newNode= new Node(data);
		if(head==null)
		{
			head=newNode;
		}
		else
		{
			newNode.next=head;
			head=newNode;
		}
		this.size++;
	}
	
	public int pop()
	{
		if(head==null)
		{
			throw new IllegalStateException("Stack is empty");
		}
		int popVal = head.data;
		head=head.next;
		this.size--;
		return popVal;
	}
	
	public int peek()
	{
		return head==null? null : head.data;
	}
	
	public boolean isEmpty()
	{
		return this.size==0? true: false;
	}
	
	public void clear()
	{
		this.head = null;
	}
	
	public int size()
	{
		return this.size;
	}
}
