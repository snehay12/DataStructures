import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestSumLinkedList {

	private SumLinkedList sumList;
	@Before
	public void setUp() throws Exception {
		sumList= new SumLinkedList();
	}

	@Test
	public void test() {
		Stack<Integer> firstList= new Stack<Integer>();
		firstList.add(8);
		firstList.add(2);
		firstList.add(5);
		
		Stack<Integer> secondList = new Stack<Integer>();
		secondList.add(4);
		secondList.add(9);
		secondList.add(2);
		
		Assert.assertEquals(3,sumList.addLinkedList(firstList, secondList).size());
		
	}

}
