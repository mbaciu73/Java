package com.Assignment;
import java.util.Scanner;
public class Words extends theFiles{

	static int i=0;
	private String token1,token2;
	static String[] words = stopWords.getNewWords();
	
	public Words(String title1, String title2,String token1,String token2) {
		super(title1, title2);
		this.token1=token1;
		this.token2=token2;
		
	
			
	}
	public float count() {
		
		/*while(getToken1()!=null && getToken2()!=null) {
			*/
		//}
		return 3;
		
	}
}
