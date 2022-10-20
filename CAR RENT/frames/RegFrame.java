package frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class RegFrame extends JFrame implements MouseListener, ActionListener

{
	JPanel panel;
	JLabel fnameLB,lnamLB,mnumberLB,genderLB,nidLB,emaiLB,drivinglianceLB,addLB,vpasswordLB,dateLB,monthLB,yearLB,dobLB,passLB,vpassLB;
	JTextField fnameTF,lnameTF,emailTF,mnumberTF,nidTF,drivinglianceTF;
	JToggleButton show1BT,show2BT;
	JButton nextBT, BackBtn;
	JTextArea addTA;
	JCheckBox CB1,CB2,CB3;
	JComboBox combo1,combo2,combo3;
	JPasswordField passPF,vpassPF;
	Color myColor1,myColor2;

	public RegFrame()
	{
		super("Registation Form");
		this.setSize(1024,820);//Frame Size X=720,Y=1080
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		myColor1 = new Color(0,255,51);
                myColor2 = new Color(51,153,255);
		panel=new JPanel();
		panel.setLayout(null);
		
		fnameLB=new JLabel("First Name :");
		fnameLB.setBounds(30,30,100,30);
		panel.add(fnameLB);

		fnameTF=new JTextField();
		fnameTF.setBounds(130,30,150,30);
		panel.add(fnameTF);
		
		lnamLB=new JLabel("Last Name :");
		lnamLB.setBounds(30,80,100,30);
		panel.add(lnamLB);

		lnameTF=new JTextField();
		lnameTF.setBounds(130,80,150,30);
		panel.add(lnameTF);
		
		mnumberLB=new JLabel("Mobile No :");
		mnumberLB.setBounds(30,130,100,30);
		panel.add(mnumberLB);

		mnumberTF=new JTextField();
		mnumberTF.setBounds(130,130,150,30);
		panel.add(mnumberTF);
		
                emaiLB=new JLabel("Email Address :");
		emaiLB.setBounds(30,180,100,30);
		panel.add(emaiLB);

		emailTF=new JTextField();
		emailTF.setBounds(130,180,150,30);
		panel.add(emailTF);
		
		genderLB=new JLabel("Gender :");
		genderLB.setBounds(30,230,100,30);
		panel.add(genderLB);

		CB1=new JCheckBox("Female");
		CB1.setBounds(130,230,70,30);
		panel.add(CB1);

		CB2=new JCheckBox("Male");
		CB2.setBounds(230,230,70,30);
		panel.add(CB2);

		CB3=new JCheckBox("Other");
		CB3.setBounds(330,230,70,30);
		panel.add(CB3);
		
		nidLB=new JLabel("NID No :");
		nidLB.setBounds(30,280,100,30);
		panel.add(nidLB);

		nidTF=new JTextField();
		nidTF.setBounds(130,280,150,30);
		panel.add(nidTF);
		
		dobLB=new JLabel("DOB :");
		dobLB.setBounds(30,330,100,30);
		panel.add(dobLB);
		
		dateLB=new JLabel("Date");
		dateLB.setBounds(130,330,100,30);
		panel.add(dateLB);

		String []add1={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		combo1=new JComboBox(add1);
		combo1.setBounds(130,380,90,30);
		panel.add(combo1);
		
		monthLB=new JLabel("Month");
		monthLB.setBounds(230,330,100,30);
		panel.add(monthLB);

		String []add2={"January","February","March","April","May","June","July","August","September","October","November","December"};
		combo2=new JComboBox(add2);
		combo2.setBounds(230,380,90,30);
		panel.add(combo2);
		
		yearLB=new JLabel("Year");
		yearLB.setBounds(330,330,100,30);
		panel.add(yearLB);

		String []add3={"1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010"};
		combo3=new JComboBox(add3);
		combo3.setBounds(330,380,90,30);
		panel.add(combo3);
		
		drivinglianceLB=new JLabel("Driving License:");
		drivinglianceLB.setBounds(30,430,100,30);
		panel.add(drivinglianceLB);

		drivinglianceTF=new JTextField();
		drivinglianceTF.setBounds(130,430,150,30);
		panel.add(drivinglianceTF);
		
		
		addLB=new JLabel("Area Address :");
		addLB.setBounds(30,480,100,30);
		panel.add(addLB);

		addTA=new JTextArea();
		addTA.setBounds(130,480,200,70);
		panel.add(addTA);
		
		passLB=new JLabel("Password :");
		passLB.setBounds(30,570,100,30);
		panel.add(passLB);

		passPF=new JPasswordField();
		passPF.setBounds(130,570,150,30);
		passPF.setEchoChar('*');
		panel.add(passPF);

		show1BT=new JToggleButton("Show");
		show1BT.setBounds(300,570,70,30);
		panel.add(show1BT);
		
		vpassLB=new JLabel("Verify Password :");
		vpassLB.setBounds(30,620,100,30);
		panel.add(vpassLB);

		vpassPF=new JPasswordField();
		vpassPF.setBounds(130,620,150,30);
		vpassPF.setEchoChar('*');
		panel.add(vpassPF);

	        show2BT=new JToggleButton("Show");
		show2BT.setBounds(300,620,70,30);
		panel.add(show2BT);
		
		
		nextBT=new JButton("Next");
		nextBT.setBounds(600,700,70,30);
		nextBT.setBackground(myColor1);
		nextBT.setForeground(Color.WHITE);
		panel.add(nextBT);

		BackBtn = new JButton("Back");
		BackBtn.setBounds(300,700,70,30);
		BackBtn.setBackground(myColor2);
		BackBtn.setForeground(Color.WHITE);
		panel.add(BackBtn);
		
		show1BT.addMouseListener(this);
		show2BT.addMouseListener(this);
		nextBT.addActionListener(this);
		BackBtn.addActionListener(this);

		this.add(panel);		
	}
	public void actionPerformed(ActionEvent ae)
	{
	      if(ae.getSource() == nextBT)
		{	
		if(fnameTF.getText()== " " || lnameTF.getText() == " " || emailTF.getText() == " " || mnumberTF.getText() == " " || nidTF.getText() == " " || drivinglianceTF.getText() == " " || addTA.getText() == " " || (CB1.isSelected() != true && CB2.isSelected()!= true  && CB3.isSelected() != true) || passPF.getPassword().toString() == " " || vpassPF.getPassword().toString() == " " || combo1.getSelectedItem().toString() == " " || combo2.getSelectedItem().toString() == " " || combo3.getSelectedItem().toString() == " ")
		{
			/*JOptionPane.showMessageDialog(this, "Error.");*/
			/*Pane.showMessageDialog(this, "This is a Message Box");*/
			JOptionPane.showMessageDialog(this,"Please fillup the relevant fields.","Alert",JOptionPane.WARNING_MESSAGE); 
		}
                else if(passPF.getText().equals(vpassPF.getText()))
                {
                try
		 {
			FileWriter writer = new FileWriter("CustomerInfo.txt");
			BufferedWriter buffer = new BufferedWriter(writer);
			PrintWriter printer = new PrintWriter(buffer);
			printer.println(fnameLB.getText() + fnameTF.getText());
			printer.println(lnamLB.getText() + lnameTF.getText());
			printer.println(mnumberLB.getText() + mnumberTF.getText());
			printer.println(emaiLB.getText());
			printer.println(emailTF.getText());
			if(CB1.isSelected() == true)
			{printer.println(genderLB.getText() + CB1.getText());}
		        else if(CB2.isSelected() == true)
			{printer.println(genderLB.getText() + CB2.getText());}
		        else if(CB3.isSelected() == true)
			{printer.println(genderLB.getText() + CB3.getText());}
			printer.println(nidLB.getText() + nidTF.getText());
			printer.println(dobLB.getText() + combo1.getSelectedItem() + " " + combo2.getSelectedItem() + "," + combo3.getSelectedItem());
			printer.println(drivinglianceLB.getText() + drivinglianceTF.getText());
			printer.println(addLB.getText() + addTA.getText());
			printer.println(passLB.getText());
			printer.println(passPF.getText());
			printer.println(vpassLB.getText() + vpassPF.getText());
			buffer.close();
			writer.close();

		 }
		 catch(IOException e)
		 {
			System.out.println(e);
		 }	
		LoginFrame l=new LoginFrame();
		l.setVisible(true);
		setVisible(false);
	        }
	        else
		{
			JOptionPane.showMessageDialog(this,"Passwords should match.","Alert",JOptionPane.WARNING_MESSAGE); 
		}
	        }
	      else if(ae.getSource() == BackBtn)
	       {
	    	    SignFrame s=new SignFrame();
		    s.setVisible(true);
		    setVisible(false);
	       }
	}
	public void mouseClicked(MouseEvent me)
	{
        if(me.getSource() == show1BT)
        {
        	if(show1BT.isSelected())
        	{
        		passPF.setEchoChar((char)0);
        		show1BT.setText("Hide");
        	}
        	else
        	{
                passPF.setEchoChar('*');
        		show1BT.setText("Show");
        	}
        }
        else if(me.getSource() == show2BT)
        {
        	if(show2BT.isSelected())
        	{
        		vpassPF.setEchoChar((char)0);
        		show2BT.setText("Hide");
        	}
        	else
        	{
                vpassPF.setEchoChar('*');
        		show2BT.setText("Show");
        	}
        }
	}
	public void mouseEntered(MouseEvent me)
	{

	}
	public void mouseExited(MouseEvent me)
	{

	}
	public void mousePressed(MouseEvent me)
	{

	}
	public void mouseReleased(MouseEvent me)
	{

	}
}
		