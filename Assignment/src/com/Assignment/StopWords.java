package com.Assignment;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class StopWords {
	public static void main(String[] args) throws Exception{
		
		int i=0;
		int j=0;
		String[] newWords = null;
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
		
		char[] alphabet = new char[] {'a','b','c','d','e','f','g','h','i','j','k','l','m','m','o','p','q','r','s','t','u','v','w','x','y','z'};
		   	
		words = words.replace("", " ");
		//System.out.println(words);
			for(j=0;j<alphabet.length;j++) {
				for(i=0;i<words.length();i++) {
					if(words.charAt(i)==alphabet[j]) {
						newWords=words.split("");
					}
				}
			}
			for(i=0;i<newWords.length;i++){
				System.out.println(newWords[i]);
			}
		
		
	}
}
