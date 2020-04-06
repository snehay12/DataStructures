import java.util.Arrays;

public class PermutationDetector {

	public boolean isPermutation(String text, String perm) {
		if (text.isEmpty() || perm.isEmpty())
			return false;
		if (text.length() != perm.length())
			return false;
		System.out.println(sortArray(text).toString()+" "+sortArray(perm).toString());
		return sortArray(text).equalsIgnoreCase(sortArray(perm));
		
	}

	private String sortArray(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}

}
