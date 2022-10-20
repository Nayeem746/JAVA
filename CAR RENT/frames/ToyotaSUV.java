package frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ToyotaSUV extends JFrame implements ActionListener
{
	JLabel selectLabel;
	JButton nextbtn, BackBtn;
	JComboBox cb;
	JPanel panel;
	Color myColor1,myColor2;


	public ToyotaSUV()
	{
		super("Toyota SUV");
		this.setSize(1024, 720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		myColor1 = new Color(0,255,51);
        myColor2 = new Color(51,153,255);
		panel = new JPanel();
		panel.setLayout(null);

		String arr[] = {"Toyota Land Cruiser Prado", "Toyota RAV4", "Toyota Harrier"};
		cb=new JComboBox (arr);
	    cb.setBounds(300,20,110,30);
	    panel.add(cb);
	
	    selectLabel=new JLabel("Select your Toyota SUV model: ");
		selectLabel.setBounds(50,20,200,30);
		panel.add(selectLabel);
		
		nextbtn=new JButton("Next");
		nextbtn.setBounds(280,225,80,30);
		nextbtn.setBackground(myColor1);
		nextbtn.setForeground(Color.WHITE);
		panel.add(nextbtn);

		BackBtn = new JButton("Back");
		BackBtn.setBounds(140,225,80,30);
		BackBtn.setBackground(myColor2);
		BackBtn.setForeground(Color.WHITE);
		panel.add(BackBtn);
        
        nextbtn.addActionListener(this);
        BackBtn.addActionListener(this);

		this.add(panel);
	}
     public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == nextbtn)
		{
		if(cb.getSelectedItem().toString().equals("Toyota Land Cruiser Prado"))
		{
			ToyotaLandCruiserPrado tlcp = new ToyotaLandCruiserPrado();
		    tlcp.setVisible(true);
		    setVisible(false);
		}
		else if(cb.getSelectedItem().toString().equals("Toyota RAV4"))
		{
			ToyotaRAV4 tr = new ToyotaRAV4();
		    tr.setVisible(true);
		    setVisible(false);
		}
        else if(cb.getSelectedItem().toString().equals("Toyota Harrier"))
		{
			ToyotaHarrier th = new ToyotaHarrier();
		    th.setVisible(true);
		    setVisible(false);
		}
	    }
	    else if(ae.getSource() == BackBtn)
	    {
	    	Toyota t = new Toyota();
            t.setVisible(true);
		    setVisible(false);
	    }
	}

}