package com.Assignment;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Files {
	private String title;
	File f1;
	Scanner s1;
	
	
	public Files(String title) {
		this.title=title;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}
	
	void open() {
		f1 = new File(this.title);
	}
	
	public static String read(Scanner file) {
		String next = file.next();
		
		if(next!= null) {
			return null;
		}
		return next;
	}
	void close() {
		s1.close();
	}
	
	
	
}
