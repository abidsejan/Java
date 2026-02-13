package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import Entities.*;

public class Homepage extends JFrame implements ActionListener 
{
	
	JLabel namelbl;
	JTextField namefld;
	JButton backbtn;
	JPanel panel;
	FrameIntro f1;
	 
	public Homepage(String s1,FrameIntro f1)
	{
		super("Homepage");
		this.setSize(850,450);
		this.setLocationRelativeTo(null);
		
		this.f1=f1;
		panel=new JPanel();
		panel.setLayout(null);
		
		namelbl=new JLabel("Name: "+s1);
		namelbl.setBounds(200,100,100,50);
		panel.add(namelbl);
		
		namefld=new JTextField();
		namefld.setBounds(350,100,200,50);
		panel.add(namefld);
		
		backbtn=new JButton("Back");
		backbtn.setBounds(250,200,100,50);
		backbtn.addActionListener(this);
		panel.add(backbtn);
		
		
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==backbtn)
		{
			this.setVisible(false);
			FrameIntro f1=new FrameIntro();
			f1.setVisible(true);
		}
	}
	
	
	
	
	
}