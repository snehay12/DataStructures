package com.datastructure;

public class DynamicArray {

	private Object[] data;
	private int size=0;
	private int capacity=0;
	
	public void print()
	{
		for(int i=0;i<size;i++)
		{
			System.out.print(" data["+i+"]:"+this.data[i]);
		}
		
	}
	public DynamicArray(int capacity)
	{
		this.capacity=capacity;
		this.data = new Object[capacity];
	}
	
	public Object get(int index)
	{
		return this.data[index];
	}
	
	public void set(int index, Object ele)
	{
		this.data[index]= ele;		
	}
	
	public void add(Object ele)
	{
		if(size==capacity)
		{
			resize();
		}
		this.data[size++]=ele;
	}
	
	public void insert(int index, Object ele)
	{
		if(this.size==this.capacity)
		{
			resize();
		}
		for(int i=size; i>index; i--)
		{
			this.data[i]=this.data[i-1];
		}
		this.data[index]=ele;
		this.size++;
	}
	
	private void resize()
	{
		this.capacity*=2;
		Object[] newData= new Object[this.capacity];
		for(int i=0;i<size;i++)
		{
			newData[i]= this.data[i];
		}
		this.data=newData;
	}
	
	public void delete(int index)
	{
		if (size != 0 && index <= size) {
			for (int i = index; i < size - 1; i++) {
				this.data[i] = this.data[i + 1];
			}
			if (size != 0)
				this.data[size - 1] = null;
			size--;
		}
	}
	
	public boolean isEmpty()
	{
		return (this.size==0)? true: false;
	}
	
	public int size()
	{
		return this.size;
	}
	
	public boolean Contains(Object ele)
	{
		for(int i=0;i<size;i++)
		{
			if(this.data[i].equals(ele))
				return true;
		}
		return false;
	}
}
