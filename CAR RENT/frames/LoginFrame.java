package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

public class LoginFrame extends JFrame implements ActionListener
{
	
	JLabel emailLabel,passLabel;
	Font f;
	JPasswordField passPF;
	JTextField emailTf;
	JButton loginbtn, Backbtn;
	JPanel panel;
	Color myColor1,myColor2;

	public LoginFrame()
	{
		super("Login Frame");
		this.setSize(1024, 720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f=new Font("Arial",Font.BOLD,14);

		myColor1 = new Color(0,255,51);
    myColor2 = new Color(51,153,255);
		panel = new JPanel();
		panel.setLayout(null);

		emailLabel=new JLabel("Email: ");
		emailLabel.setBounds(50,20,100,30);
		emailLabel.setFont(f);
		panel.add(emailLabel);
		
		

		emailTf=new JTextField();
		emailTf.setBounds(150,20,150,30);
		panel.add(emailTf); 

		passLabel=new JLabel("Password: ");
		passLabel.setBounds(50,80,100,30);
		passLabel.setFont(f);
		panel.add(passLabel);
			
		passPF=new JPasswordField();
		passPF.setBounds(150,80,150,30);
		panel.add(passPF);
		
		
		loginbtn=new JButton("Login");
		loginbtn.setBounds(350,225,80,30);
    loginbtn.setBackground(myColor1);
		loginbtn.setForeground(Color.WHITE);
		panel.add(loginbtn);

		Backbtn = new JButton("Back");
		Backbtn.setBounds(175,225,80,30);
		Backbtn.setBackground(myColor2);
		Backbtn.setForeground(Color.WHITE);
		panel.add(Backbtn);

		loginbtn.addActionListener(this);
		Backbtn.addActionListener(this);

		this.add(panel);
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == loginbtn)
        {
        
        try
		 {
          FileReader reader = new FileReader("CustomerInfo.txt");
          BufferedReader myreader = new BufferedReader(reader);
          Scanner sc = new Scanner(myreader);
          String line[] = new String[13];
          int i = 0;
          while(sc.hasNextLine())
          {
          	line [i] = sc.nextLine();
          	i++; 
          }
          System.out.println(line[4]);
          System.out.println(line[11]);
      
          if(emailTf.getText().equals(line[4].toString()) && passPF.getText().equals(line[11].toString()) )
          {
          	CarBrand b = new CarBrand();
            b.setVisible(true);
		    setVisible(false);
          }
          else 
		     {
			      JOptionPane.showMessageDialog(this,"Relevant fields do not match","Alert",JOptionPane.WARNING_MESSAGE); 
		      }
          myreader.close();
          reader.close();
        
		 } 
    
		 catch(IOException ie)
		 {
			System.out.println(ie);
		 }     
	    }
	    else if(ae.getSource() == Backbtn)
	    {
	    	SignFrame s=new SignFrame();
		    s.setVisible(true);
		    setVisible(false);

	    }
    }
}