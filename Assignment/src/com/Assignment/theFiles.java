package com.Assignment;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class theFiles {
	private String title1;
	private String title2;
	File f1,f2;
	Scanner s1,s2;
	
	
	public theFiles(String title1,String title2) {
		this.title1=title1;
		this.title2=title2;
	}


	public String getTitle1() {
		return title1;
	}


	public void setTitle1(String title1) {
		this.title1 = title1;
	}


	public String getTitle2() {
		return title2;
	}


	public void setTitle2(String title2) {
		this.title2 = title2;
	}
	
	void open() {
		f1 = new File(this.title1);
		f2 = new File(this.title2);
	}
	
	String readFile1() {
		String token1;
		try {
			s1 = new Scanner(f1);
			token1 = s1.next();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			token1=null;
		}
		return token1;
	}
	String readFile2() {
		String token2;
		try {
			s2 = new Scanner(f2);
			token2 = s2.next();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			token2=null;
		}
		return token2;
	}
	
	void close() {
		s1.close();
		s2.close();
		
	}
	
	
	
}
