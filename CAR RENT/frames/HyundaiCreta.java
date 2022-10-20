package frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class HyundaiCreta extends JFrame implements ActionListener
{
	JLabel selectLabel,imgLabel,rentLabel, qLabel, noteLabel, aLabel;
	JButton nextbtn, BackBtn;
	/*JComboBox cb;*/
	ImageIcon img;
	JTextField tf, dayTF, qTF;
	JPanel panel;
	Color myColor1,myColor2;


	public HyundaiCreta()
	{
		super("Hyundai Creta");
		this.setSize(1024, 720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        myColor1 = new Color(0,255,51);
        myColor2 = new Color(51,153,255);
		panel = new JPanel();
		panel.setLayout(null);

		img = new ImageIcon("C:\\Users\\Asus\\OneDrive\\Documents\\FT Java Project Edited8\\frames\\Pictures\\HyundaiCreta.jpg");
		imgLabel=new JLabel (img);
	    imgLabel.setBounds(30,30,500,250);
	    panel.add(imgLabel);

	    selectLabel=new JLabel("For how many days would you like to rent this car? ");
		selectLabel.setBounds(20,300,400,30);
		panel.add(selectLabel);

	    dayTF=new JTextField();
		dayTF.setBounds(450,300,200,30);
		panel.add(dayTF);

		qLabel=new JLabel("Quantity ");
		qLabel.setBounds(150,350,100,30);
		panel.add(qLabel);


        qTF=new JTextField();
		qTF.setBounds(450,350,150,30);
		panel.add(qTF);
		

	    rentLabel=new JLabel("Day of Rent(DD/MM/YY)  : ");
		rentLabel.setBounds(20,400,400,30);
		panel.add(rentLabel);
	
		

		tf=new JTextField();
		tf.setBounds(450,400,150,30);
		panel.add(tf);

		noteLabel=new JLabel("Cost per Day (Tk.) ");
		noteLabel.setBounds(100,450,300,30);
		panel.add(noteLabel);


        aLabel=new JLabel("1000");
		aLabel.setBounds(450,450,400,30);
		panel.add(aLabel);

		
		
		nextbtn=new JButton("Next");
		nextbtn.setBounds(300,500,80,30);
		nextbtn.setBackground(myColor1);
		nextbtn.setForeground(Color.WHITE);
		panel.add(nextbtn);

		BackBtn = new JButton("Back");
		BackBtn.setBounds(150,500,80,30);
		BackBtn.setBackground(myColor2);
		BackBtn.setForeground(Color.WHITE);
		panel.add(BackBtn);

        BackBtn.addActionListener(this);
        nextbtn.addActionListener(this);
		this.add(panel);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == nextbtn)
		{
		 try
		 {
            FileWriter writer = new FileWriter("CustomerRentalInfo(Hyundai).txt");
			BufferedWriter buffer = new BufferedWriter(writer);
			PrintWriter printer = new PrintWriter(buffer);
			printer.println("Selected car model: ");
			printer.println("Hyundai Creta");
			printer.println("Amount of Days for rent:");
			printer.println(dayTF.getText());
			printer.println(qLabel.getText());
			printer.println(qTF.getText());
			printer.println(noteLabel.getText());
			printer.println(aLabel.getText());

			buffer.close();
			writer.close();

		 }
		 catch(IOException e)
		 {
			System.out.println(e);
		 }
		HyundaiPaymentFrame hp=new HyundaiPaymentFrame();
		hp.setVisible(true);
		setVisible(false);
		}
		else if(ae.getSource() == BackBtn)
		{	
		HyundaiSUV hsuv=new HyundaiSUV();
		hsuv.setVisible(true);
		setVisible(false);
	    }
	}

}