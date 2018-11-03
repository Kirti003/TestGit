package SeleniumWithJars;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;



public class HttpURLResponseCode_09Sep {

	public static void main(String[] args) throws IOException {
	
	String test = "https://www.google.com/";
	int http;
	URL url = new URL(test);
	
	HttpsURLConnection connection =  (HttpsURLConnection) url.openConnection();
	// Creates an HttpsURLConnection using the URL specified.
	connection.connect();
	http = connection.getResponseCode();
	System.out.println("Response code of the url is :"+http);
	}

}
