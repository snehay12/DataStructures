import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {
	
	
	public Boolean isStringUniqueUsingSet(String str)
	{
		//If string is empty return false
		if(str.isEmpty())
			return false;
		//If the string length is one, it is by default unique so return true
		if(str.length()==1)
			return true;
		//Set contains only unique values, so add each character in string to a Set
		Set<Character> setOfChar = new HashSet<Character>();
		for(char c: str.toLowerCase().toCharArray())
		{
			setOfChar.add(c);
		}
		//if Set length and string length are same, means its a unique string
		return (str.length()==setOfChar.size())? true: false;
	}
	public Boolean isStringUnique(String str)
	{
		if(str.length()>128 || str.isEmpty())
			return false;
		boolean char_set[]= new boolean[127];
		int val =0;
		for(char c: str.toLowerCase().toCharArray())
		{
			val= Integer.valueOf(c);
			if(char_set[val])
				return false;
			char_set[val]=true;
		}
		return true;
	}

}
