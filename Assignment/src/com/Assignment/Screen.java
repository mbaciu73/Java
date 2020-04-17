package com.Assignment;
import javax.swing.JFrame;
import java.awt.Button;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Screen extends JFrame implements ActionListener{
	
	static String title = null;
	Button b1,b2;
	public static void main(String[] args) {
		Screen main = new Screen("Topic Modeller");
	}
	
	public Screen(String title) {
		super(title);
		
		setSize(750,750);
		setLayout(new BorderLayout());
		
		
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
	

}
