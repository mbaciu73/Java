package com.Assignment;
import javax.swing.JFrame;
import java.awt.BorderLayout;
public class Screen extends JFrame{
	
	static String title = null;
	public static void main(String[] args) {
		Screen main = new Screen("Topic Modeller");
	}
	
	public Screen(String title) {
		super(title);
		
		setSize(750,750);
		setLayout(new BorderLayout());
		
		setVisible(true);
	}
	
	

}
