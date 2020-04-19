package com.Assignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.Font;
public class Screen extends JFrame implements ActionListener{
	
	
	JButton b1,b2,b3;
	JLabel l1,l2;
	JPanel south,centre,north,east,west,southwest;
	JTextField t1,t2;
	Files f1,f2;
	Scanner s1,s2;
	Words calculate;
	
	public Screen(String Title) {
		super(Title);
		//setting the size and the layout
		setSize(750,350);
		setLayout(new BorderLayout());
		//the labels for the text fields
		l1 = new JLabel("First File");
		l2 = new JLabel("Second File");
		//the buttons
		b1 = new JButton("Check");
		b2 = new JButton("Check");
		b3 = new JButton("Calculate");
		//the text fields for inputting
		t1 = new JTextField("Enter file name here");
		t2 = new JTextField("Enter file name here");
		//sending to the action listener
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		l1.setFont(new Font("Calibri",Font.PLAIN,14));
		l2.setFont(new Font("Calibri",Font.PLAIN,14));
		centre = new JPanel();
		south = new JPanel();
		north = new JPanel();
		west = new JPanel();
		east = new JPanel();
		
		
		
		
		//adding to the screen
		west.add(l1);
		west.add(t1);
		west.add(b1);
		east.add(l2);
		east.add(t2);
		east.add(b2);
		south.add(b3);
		
		//this is for info for the user in case the name is not entered 
		t1.setToolTipText("Enter the File name");
		t2.setToolTipText("Enter the File name");
		b1.setToolTipText("Check is the first file is here");
		b2.setToolTipText("Check is the second file is here");
		b3.setToolTipText("Calculate result of the comparison of files");
		
		//adding to the display in whatever format
		add(centre, BorderLayout.CENTER);
		add(south, BorderLayout.SOUTH);
		add(north,BorderLayout.NORTH);
		add(west, BorderLayout.WEST);
		add(east,BorderLayout.EAST);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== b1) {
			if(t1.getText().equals("") || t1.getText().equals("Enter file name here")) {
				JOptionPane.showMessageDialog(this,"There is nothing entered in the First box");
			}
			else {
				f1 = new Files(t1.getText());
				f1.open();
			}
		}
		else if (e.getSource()==b2) {
			if(t2.getText().equals("")|| t2.getText().equals("Enter file name here")) {
				JOptionPane.showMessageDialog(this,"There is nothing entered in the Second box");
			}
			else {
				f2 = new Files(t2.getText());
				f2.open();
			}
		}
		else if (e.getSource()==b3) {
			if(f1 instanceof Files && f1 instanceof Files ) {
				calculate = new Words();
				JOptionPane.showMessageDialog(this, calculate.count(f1, f2));
				
				f1.close();
				f2.close();
			}
			else {
				JOptionPane.showMessageDialog(this, "Please enter a file name into both fields provided");
			}
		}
	}
	
	

}
