import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class FrameIntro extends JFrame implements MouseListener
{
	JLabel namelbl,passlbl,imagelbl;
	JTextField namefld;
	JPasswordField passfld;
	JButton lgnbtn,rgstrbtn,backbtn;
	Color mycolor,lblcolor;
	Font myfont;
	ImageIcon img;
	JPanel panel;
	
	public FrameIntro()
	{
		super("My First GUI");
		this.setSize(850,450);
		this.setLocationRelativeTo(null);
		
		mycolor=new Color(8,179,240);
		lblcolor=new Color(42,255,216);
		
		myfont=new Font("Cambria",Font.PLAIN,24);
		
		panel=new JPanel();
		panel.setLayout(null);
		panel.setBackground(mycolor);
		//panel.setBackground(Color.RED);
		
		namelbl=new JLabel("Name: ");
		namelbl.setBounds(250,100,100,50);
		namelbl.setBackground(lblcolor);
		namelbl.setOpaque(true);
		namelbl.setForeground(Color.WHITE);
		namelbl.setFont(myfont);
		panel.add(namelbl);
		
		namefld=new JTextField();
		namefld.setBounds(400,100,200,50);
		panel.add(namefld);
		
		passlbl=new JLabel("Pass: ");
		passlbl.setBounds(250,170,100,50);
		passlbl.setForeground(Color.WHITE);
		passlbl.setFont(myfont);
		panel.add(passlbl);
		
		passfld=new JPasswordField();
		passfld.setBounds(400,170,200,50);
		passfld.setEchoChar('*');
		panel.add(passfld);
		
		lgnbtn=new JButton("Login");
		lgnbtn.setBounds(200,270,100,50);
		lgnbtn.setBackground(lblcolor);
		lgnbtn.setFont(myfont);
		lgnbtn.addMouseListener(this);
		panel.add(lgnbtn);
		
		rgstrbtn=new JButton("Sign Up");
		rgstrbtn.setBounds(350,270,120,50);
		rgstrbtn.setBackground(Color.CYAN);
		rgstrbtn.setFont(myfont);
		rgstrbtn.addMouseListener(this);
		panel.add(rgstrbtn);
				   
		backbtn=new JButton("Back");
		backbtn.setBounds(520,270,100,50);
		backbtn.setBackground(Color.CYAN);
		backbtn.setFont(myfont);
		backbtn.addMouseListener(this);
		panel.add(backbtn);
		
		img=new ImageIcon("oop1.jpg");
		imagelbl=new JLabel(img);
		imagelbl.setBounds(0,0,850,450);
		panel.add(imagelbl);
		
		
		this.add(panel);
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource()==lgnbtn)
		{
			lgnbtn.setBackground(Color.RED);
			lgnbtn.setForeground(Color.WHITE);
		}
		else if(me.getSource()==rgstrbtn)
		{
			rgstrbtn.setBackground(Color.RED);
			rgstrbtn.setForeground(Color.WHITE);
		}
		else if(me.getSource()==backbtn)
		{
			backbtn.setBackground(Color.RED);
			backbtn.setForeground(Color.WHITE);
		}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource()==lgnbtn)
		{
			lgnbtn.setBackground(lblcolor);
			lgnbtn.setForeground(Color.BLACK);
		}
		else if(me.getSource()==rgstrbtn)
		{
			rgstrbtn.setBackground(lblcolor);
			rgstrbtn.setForeground(Color.BLACK);
		}
		else if(me.getSource()==backbtn)
		{
			backbtn.setBackground(lblcolor);
			backbtn.setForeground(Color.BLACK);
		}
	}
}