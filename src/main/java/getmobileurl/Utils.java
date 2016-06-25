package getmobileurl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;

public class Utils {

	
	/**
	 * 
	 * 
	 * @param sourceURL - Pass Source URL
	 * @return Mobile URL
	 * @throws MalformedURLException
	 */
	public static URL getMobileURL(String sourceURL) throws MalformedURLException{
		return getMobileURL(new URL(sourceURL));
		
	}
	

	/**
	 * 
	 * 
	 * @param sourceURL - Pass Source URL
	 * @return Mobile URL
	 * @throws MalformedURLException
	 */
	public static URL getMobileURL(URL sourceURL){

		Response response = null;
		try {
			response = Jsoup.connect(sourceURL.toExternalForm())
					.userAgent("Mozilla/5.0 (Linux; Android 4.0.4; Galaxy Nexus Build/IMM76B) AppleWebKit/535.19 (KHTML, like Gecko) Chrome/18.0.1025.133 Mobile Safari/535.19")
					.followRedirects(true).execute();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return response.url();
	
		
	}
	
	
}
