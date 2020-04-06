
public class URLify {
	
	public void main(String s[])
	{
		URLify urlify = new URLify();
		System.out.println(urlify.URLify("Amazon grass seed", 22));
	}
	
	public String URLify(String url, int length)
	{
		System.out.println(url.replaceAll(" ", "%20%"));
		return url.replaceAll(" ", "%20");
	}

}
