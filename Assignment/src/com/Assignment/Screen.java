package com.Assignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
public class Screen extends JFrame implements ActionListener{
	
	static String title = null;
	JButton b1,b2,b3;
	JPanel south,east,west,north;
	Files f1,f2;
	JTextField t1,t2;
	public static void main(String[] args) {
		Screen main = new Screen("Topic Modeller");
	}
	
	public Screen(String title) {
		super(title);
		
		setSize(750,550);
		setLayout(new BorderLayout());
		setResizable(false);
		
		b1 =  new JButton("Check if 1st file exists");
		b2 = new JButton("Check if 2nd file exists");
		
		t1 = new JTextField("Enter 1st File here");
		t2 = new JTextField("Enter 2nd File here");
		
		north = new JPanel();
		south = new JPanel();
		east = new JPanel();
		west = new JPanel();
		
		
		west.add(b1);
		east.add(b2);
		south.add(b3);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
		add(north, BorderLayout.NORTH);
		add(south, BorderLayout.SOUTH);
		add(east, BorderLayout.EAST);
		add(west, BorderLayout.WEST);
		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== b1) {
			f1 = new Files(t1.getText());
		}
		else if (e.getSource()==b2) {
			f1 = new Files(t2.getText());
		}
		
	}
	
	

}
