import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class MyFirstScreen extends JFrame implements ActionListener {
	//attributes = usually the components that you'll have on the screen
	JLabel label1,label2;
	JButton button1,button2;
	JPanel centrePanel, southPanel,northPanel;
	public MyFirstScreen(String myTitle) {
		
		super(myTitle);
		setSize(300,300);
		//setLayout(new BorderLayout());
		label1 = new JLabel("Java Screen building");
		label2 = new JLabel("Top of screen");
		button1= new JButton("Click Me");
		button2= new JButton("then me");
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		//the panel is set here
		centrePanel = new JPanel();
		southPanel = new JPanel();
		northPanel = new JPanel();
		
		centrePanel.add(label1);
		southPanel.add(button1);
		southPanel.add(button2);
		northPanel.add(label2);
		
		add(centrePanel, BorderLayout.CENTER);
		add(southPanel, BorderLayout.SOUTH);
		add(southPanel, BorderLayout.SOUTH);
		add(northPanel,BorderLayout.NORTH);
		
		setVisible(true);
	}
	//this is an example of an event handler
	//you dont call this directly, the system does
	@Override
	public void actionPerformed(ActionEvent myEvent) {
		if(myEvent.getSource() == button1) {
			JOptionPane.showMessageDialog(this, "The button click worked");
		}
		else {
			JOptionPane.showMessageDialog(this, "It's working");
		}
	}
	
	
}
