package com.Assignment;

import java.net.URL;
import java.util.Scanner;

public class stopWords extends File{
	
	private File    f1;
	private File    f2;
	static int      i,j;
	static String[] newWords = null;
	public static void main(String[] args) throws Exception{
		
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
		result        = result.replaceAll("<[^>]*>", " ");
		result        = result.replace("&nbsp", " ");
		result        = result.replace("#", " ");
	    
		String words = (String) result.subSequence(946,3002);
		
		//find the locations of the words where they begin
		int[] startOfWord = new int[] {1,6,};
		
		//create a loop that creates the letter to go uppercase if it begins at the word
		
		//then split the string from the word are the words should be put into a string
		
		//look at main.java in lab7 if confused and use that code
		
		
		//System.out.println(words);
		//newWords = words;
		
		for(i=0;i<newWords.length;i++) {
			System.out.println(newWords[i]);
		}
		for(i=0;i<newWords.length;i++) {
			
		}
		
	}
	
	public stopWords(File f1, File f2) {
		this.f1=f1;
		this.f1=f2;
		
	}

	public File getF1() {
		return f1;
	}

	public void setF1(File f1) {
		this.f1 = f1;
	}

	public File getF2() {
		return f2;
	}

	public void setF2(File f2) {
		this.f2 = f2;
	}
	
	public void Check() {
		
	}
}
