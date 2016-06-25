package getmobileurl;

import java.net.MalformedURLException;

public class ScriptUse {
public static void main(String[] args) throws MalformedURLException {
	String url = "https://www.facebook.com/";
	System.out.println(Utils.getMobileURL(url).getHost());
}
}
