package com.datastructure;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueueTest {
	
	private Queue q;
	
	@Before
	public void setUp()
	{
		this.q= new Queue();
	}
	
	@Test
	public void size()
	{
		Assert.assertEquals(0, q.size());
		q.add(25);
		Assert.assertEquals(1, q.size());
	}
	
	@Test
	public void isEmpty()
	{
		Assert.assertEquals(true, q.isEmpty());
		q.add(25);
		Assert.assertEquals(false, q.isEmpty());
	}
	
	@Test
	public void add()
	{
		q.add(25);
		q.add(50);
		q.add(100);
		
		Assert.assertEquals(25, q.peek());
		Assert.assertEquals(100, q.rear());
		
	}
	
	@Test
	public void remove()
	{
		q.add(25);
		q.add(50);
		
		Assert.assertEquals(25, q.remove());
		Assert.assertEquals(50, q.remove());
		
		Assert.assertEquals(0, q.size());
	}

}
