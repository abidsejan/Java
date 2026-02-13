package Frames;
import java.lang.*;
import javax.swing.*;
import java.awt.event.*;
import Entities.*;

public class Register extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel namlbl,passlbl;
	JTextField nmfld;
	JPasswordField passfld;
	JButton signup,back;
	public Register()
	{
		super("Registration");
		this.setSize(850,450);
		this.setLocationRelativeTo(null);
		
		panel=new JPanel();
		panel.setLayout(null);
		
		namlbl=new JLabel("Name");
		namlbl.setBounds(200,100,100,50);
		panel.add(namlbl);
		
		nmfld=new JTextField();
		nmfld.setBounds(350,100,200,50);
		panel.add(nmfld);
		
		passlbl=new JLabel("Pass");
		passlbl.setBounds(200,170,100,50);
		panel.add(passlbl);
		
		passfld=new JPasswordField();
		passfld.setBounds(350,170,200,50);
		panel.add(passfld);
		
		signup=new JButton("SignUp");
		signup.setBounds(250,270,100,50);
		signup.addActionListener(this);
		panel.add(signup);
		
		back=new JButton("Back");
		back.setBounds(400,270,100,50);
		back.addActionListener(this);
		panel.add(back);
		
		
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		
		String s1=nmfld.getText();
		String s2=passfld.getText();
		
		if(s1.isEmpty()||s2.isEmpty())
		{
			JOptionPane.showMessageDialog(null,"Fill up ALL");
		}
		else
		{
			if(ae.getSource()==signup)
		{
			Account a1=new Account(s1,s2);
			a1.addAccount();
			
			
			this.setVisible(false);
			FrameIntro f1=new FrameIntro();
			f1.setVisible(true);
		}
		else if(ae.getSource()==back)
		{
			this.setVisible(false);
			FrameIntro f1=new FrameIntro();
			f1.setVisible(true);
		}
		}
		
	}
}