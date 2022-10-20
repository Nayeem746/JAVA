package frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

public class NissanPaymentFrame extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel totalALabel,xLabel,sbLabel,ebaLabel;
	JTextField ebaTF;
	JComboBox combo;
	JButton backBT,finishBT,calculateBT;
	

	public NissanPaymentFrame()
	{
		super("Nissan Payment Frame");
		this.setSize(1024, 720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(null);
		
		totalALabel=new JLabel("Your total amount is :");
		totalALabel.setBounds(40,40,200,30);
		panel.add(totalALabel);
		
		xLabel=new JLabel("xxxxx");
		xLabel.setBounds(260,40,100,30);
		panel.add(xLabel);
		
		calculateBT=new JButton("Calculate");
		calculateBT.setBounds(310,40,120,30);
		panel.add(calculateBT);
		
		
		sbLabel=new JLabel("Select Bank :");
		sbLabel.setBounds(40,100,150,30);
		panel.add(sbLabel);
		
		String arr[] = {"Brac Bank", "Bank Asia", "NRB Bank","Dhaka Bank", "UCB Bank"};
		combo=new JComboBox(arr);
		combo.setBounds(200,100,150,30);
		panel.add(combo);
		
		ebaLabel=new JLabel("Enter Bank Account Number / Creadit Card Number :");
		ebaLabel.setBounds(40,160,300,30);
		panel.add(ebaLabel);
		
		ebaTF=new JTextField();
		ebaTF.setBounds(390,160,150,30);
		panel.add(ebaTF);
		
		backBT=new JButton("Back");
		backBT.setBounds(200,300,80,30);
		panel.add(backBT);
		
		finishBT=new JButton("Pay & Finish");
		finishBT.setBounds(180,360,120,30);
		panel.add(finishBT);

		calculateBT.addActionListener(this);
		backBT.addActionListener(this);
		finishBT.addActionListener(this);


		this.add(panel);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == calculateBT)
		{
            try
		 {
            FileReader reader = new FileReader("CustomerRentalInfo(Nissan).txt");
            BufferedReader myreader = new BufferedReader(reader);
            Scanner sc = new Scanner(myreader);
            String line[] = new String[8];
            int i = 0;
            while(sc.hasNextLine())
          {
          	line [i] = sc.nextLine();
          	i++; 
          }
          System.out.println(line[3]);
          System.out.println(line[5]);
          System.out.println(line[7]);

          String a= line[3].toString();
          String b= line[5].toString();
          String c= line[7].toString();
          int result=Integer.parseInt(a) * Integer.parseInt(b) * Integer.parseInt(c);
          xLabel.setText(Integer.toString(result));

          myreader.close();
          reader.close();
         }

		 catch(IOException e)
		 {
            System.out.println(e);
		 }
		}
		else if(ae.getSource() == backBT)
		{
            try
		 {
            FileReader reader = new FileReader("CustomerRentalInfo(Nissan).txt");
            BufferedReader myreader = new BufferedReader(reader);
            Scanner sc = new Scanner(myreader);
            String line[] = new String[8];
            int i = 0;
          while(sc.hasNextLine())
          {
          	line [i] = sc.nextLine();
          	i++; 
          }
          System.out.println(line[1]);

          if(line[1].toString().equals("Nissan Altima"))
          {
          	NissanAltima na = new NissanAltima();
            na.setVisible(true);
		    setVisible(false);
          }
          else if(line[1].toString().equals("Nissan Sylphy"))
          {
          	NissanSylphy ns = new NissanSylphy();
            ns.setVisible(true);
		    setVisible(false);
          }
          else if(line[1].toString().equals("Nissan Skyline"))
          {
          	NissanSkyline nsk = new NissanSkyline();
            nsk.setVisible(true);
		    setVisible(false);
          }
          else if(line[1].toString().equals("Nissan Kicks"))
          {
          	NissanKicks nk = new NissanKicks();
            nk.setVisible(true);
		    setVisible(false);
          }
          else if(line[1].toString().equals("Nissan X-Trail"))
          {
          	NissanXTrail nxt = new NissanXTrail();
            nxt.setVisible(true);
		    setVisible(false);
          }
          else if(line[1].toString().equals("Nissan Magnite"))
          {
          	NissanMagnite nm = new NissanMagnite();
            nm.setVisible(true);
		    setVisible(false);
          }
          else if(line[1].toString().equals("Nissan Serena"))
          {
          	NissanSerena ns = new NissanSerena();
            ns.setVisible(true);
		    setVisible(false);
          }
          else if(line[1].toString().equals("Nissan Urvan"))
          {
          	NissanUrvan nu = new NissanUrvan();
            nu.setVisible(true);
		    setVisible(false);
          }
          else if(line[1].toString().equals("Nissan Elgrand"))
          {
          	NissanElgrand ne = new NissanElgrand();
            ne.setVisible(true);
		    setVisible(false);
          }
          myreader.close();
          reader.close();
		 }
		 catch(IOException ie)
		 {
			System.out.println(ie);
		 } 

		}
		else if(ae.getSource() == finishBT)
		{
             setVisible(false);
		}
	}
}