
public class Compressor {

	public String compressString(String str)
	{
		StringBuilder returnStr= new StringBuilder();
		int alphabetCount=0;
		for(int index=0;index<str.length();index++)
		{
			alphabetCount++;
			if((index+1>=str.length())||str.charAt(index)!=str.charAt(index+1))
			{
				returnStr.append(alphabetCount+""+str.charAt(index));
				alphabetCount=0;
			}
			
		}
		System.out.println("Str:"+str+" Compressed Str: "+returnStr);
		return returnStr.toString();
	}
}
