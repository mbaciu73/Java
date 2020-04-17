package com.Assignment;
import java.util.Scanner;
public class Words {
	static int i=0,similarWords=0,percent=0,wordCount = 0;
	static Scanner s1,s2;
	private String token1,token2;
	static String[] theStopWords = null;
	
	public String count(Files f1,Files f2) {
		while(f1.read(s1) != null || f2.read(s2)!=null) {
			
			token1 = f1.read(s1);
			token2 = f2.read(s2);
			while(token2!=null) {
				if(token1 == token2) {
					for(i=0;i<theStopWords.length;i++) {
						if(token1 == theStopWords[i]) {
							continue;
						}
						else {
							similarWords+=1;
							percent+=1;
							
						}
					}
				}
				else {
					continue;
				}
				wordCount+=1;
			}
		}
		percent = percent/wordCount;
		return "The amount of words that are relatable is "+similarWords+" and that there is a "+percent+"%that the files are about the same topic";
	}
}
