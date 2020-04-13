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
		StringBuffer buffer = new StringBuffer();
		while(website.hasNext()) {
			buffer.append(website.next());
		}
		website.close();
		//Retrieving the String from the String Buffer object
		String outcome = buffer.toString();
		
		//Removing the HTML tags and unnecessary symbols
		outcome      = outcome.replaceAll("<[^>]*>", " ");
		outcome      = outcome.replace("&nbsp", " ");
		outcome     = outcome.replace("#", " ");
	    
		String result = (String) outcome.subSequence(946,3002);
		
		char[] words = result.toCharArray();
		
		//find the locations of the words where they begin
		int[] startOfWord = new int[] {0,1,6,11,17,22,27,34,37,43,48,53,60,64,72,78,83,85,88,95,98,105,111,119,127,130,134,139,145,147,150,155,161,165,167,171};
		
		//create a loop that creates the letter to go uppercase if it begins at the word
				
		for(i = 0; i < words.length; i++){
	    	for(j=0;j<startOfWord.length;j++) {
	    		if(i==startOfWord[j]) {
	    			words[i] = UpperCase(words[i]);
	    		}
	    	}
	    }
		
		System.out.println(words);
		//then split the string from the word are the words should be put into a string
		
		//look at main.java in lab7 if confused and use that code
		
		
		
		
		//for(i=0;i<newWords.length;i++) {
		//	System.out.println(newWords[i]);
		//}
		//for(i=0;i<newWords.length;i++) {
			
		//}
		
	}

	
	public static char UpperCase(char letter) {

		    char word = Character.toUpperCase(letter);
		    
		    return word;

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
