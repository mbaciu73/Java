package com.Assignment;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Files {
	private String title1;
	private String title2;
	File f1,f2;
	Scanner s1,s2;
	static String token1,token2;

	public Files(String title1,String title2) {
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
	
	void read() {
		while(s1.hasNext() || s2.hasNext()) {
			String File1 = s1.nextLine();
			String File2 = s2.nextLine();
		}
	}
	void close() {
		s1.close();
		s2.close();
		
	}
	
	
	
}
