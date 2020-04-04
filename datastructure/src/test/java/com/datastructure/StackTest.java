package com.datastructure;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

	private Stack stack;
	
	@Before
	public void setUp()
	{
		stack= new Stack();
	}
	@Test
	public void push() {
		stack.push(1);
		stack.push(2);
		stack.push(3);
		Assert.assertEquals(3, stack.size());
		Assert.assertEquals(3, stack.peek());
	}
	
	@Test
	public void pop()
	{
		stack.push(1);
		stack.push(2);
		stack.push(3);
		Assert.assertEquals(3, stack.pop());
		Assert.assertEquals(2, stack.size());
	}
	
	@Test
	public void isEmpty()
	{
		stack.push(1);
		Assert.assertEquals(false, stack.isEmpty());
		stack.pop();
		Assert.assertEquals(true, stack.isEmpty());
	}

}
