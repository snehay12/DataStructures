
public class OneAway {

	public boolean isOneAway(String str,String newStr)
	{
		int strLength = str.length();
		int newStrLength = newStr.length();
		if(newStrLength!=strLength && newStrLength+1!=strLength && newStrLength-1!=strLength)
			return false;
		if(newStrLength==strLength)
		{
			System.out.println("Replace");
			return isOneAwayReplaced(str, newStr);
		}
		else if(newStrLength==strLength+1)
		{
			System.out.println("Insert");
			return isOneAwayInsert(str, newStr);
		}
		else if(newStrLength==strLength-1) {
			System.out.println("Delete");
			return isOneAwayDelete(str, newStr);
		}
		return true;
	}
	private boolean isOneAwayReplaced(String str, String newStr)
	{
		int count=0;
		for(int index=0;index<str.length();index++)
		{
			if(str.charAt(index)!=newStr.charAt(index))
				count++;
		}
		return (count!=1)? false: true;
	}
	
	private boolean isOneAwayInsert(String str, String newStr)
	{
		int count=0;
		int i=0,j=0;
		while(i<str.length())
		{
			if(str.charAt(i)!=newStr.charAt(j))
			{
				count++;
			}
			else
			{
				i++;
			}
			j++;
		}
		return (count==1 || j+1==newStr.length())? true: false;
	}
	private boolean isOneAwayDelete(String str, String newStr)
	{
		int count=0;
		int i=0,j=0;
		while(i<newStr.length())
		{
			if(str.charAt(i)!=newStr.charAt(j))
			{
				count++;
			}
			else
			{
				i++;
			}
			j++;
		}
		return (count==1 || j+1==str.length())? true: false;
	}
}
