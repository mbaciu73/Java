package com.Assignment;

import java.net.URL;
import java.util.Scanner;

public class StopWords {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.lextek.com/manuals/onix/stopwords1.html");
		//Retrieving the contents of the specified page
		Scanner website = new Scanner(url.openStream());
		//Instantiating the StringBuffer class to hold the result
		StringBuffer sb = new StringBuffer();
		while(website.hasNext()) {
			sb.append(website.next());
		}
		website.close();
		//Retrieving the String from the String Buffer object
		String result = sb.toString();
		
		//Removing the HTML tags and unnecessary symbols
		result = result.replaceAll("<[^>]*>", " ");
		result = result.replace("&nbsp", " ");
		result = result.replace("#", " ");
	       
		//System.out.println("Contents of the web page: "+result);
		String words = (String) result.subSequence(946,3002);
	        	
		System.out.println(words);
		
		
		
		//splitting every word depending on what the letter begins with
		String[] a =words.split("");
		
		System.out.println(a[4]);
		
		
	}
}
