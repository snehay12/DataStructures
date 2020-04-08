import java.util.Stack;

public class SumLinkedList {
	
	public Stack<Integer> addLinkedList(Stack<Integer>first, Stack<Integer> second)
	{
		Stack<Integer> sum=new Stack<Integer>();
		
		StringBuilder numStr=new StringBuilder();
		StringBuilder sumStr = new StringBuilder();
		Integer firstNum;
		Integer secondNum;
		while(!first.isEmpty())
		{
			numStr.append(first.pop());
			//firstNum=firstNum.reverse();
		}
		firstNum= Integer.parseInt(numStr.toString());
		numStr=new StringBuilder();
		while(!second.isEmpty())
		{
			numStr.append(second.pop());
			//secondNum=secondNum.reverse();
		}
		secondNum= Integer.parseInt(numStr.toString());
		numStr=new StringBuilder(String.valueOf(firstNum+secondNum));
		numStr= numStr.reverse();
		for(int index=0;index<numStr.length();index++)
		{
			sum.push(new Integer(String.valueOf(numStr.charAt(index))));
		}
		return sum;
	}

}
