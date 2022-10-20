package frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Toyota extends JFrame implements ActionListener
{
	JLabel sLabel, SedanLabel, MicroLabel, SUVLabel;
	JButton SedanBtn, MicroBtn, SUVBtn, BackBtn;
	ImageIcon Simg, Mimg, SUVimg;
	Font myFont, LFont;
    JPanel panel;
    Color myColor1,myColor2;

    public Toyota()
    {
    	super("Toyota");
		this.setSize(1024, 720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		myFont = new Font("Times New Roman", Font.BOLD, 25);
		LFont = new Font("Cambria", Font.BOLD, 15);
		myColor1 = new Color(255,255,255);
		myColor2 = new Color(51,153,255);


		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor1);

		sLabel = new JLabel("Select your prefered Toyota car type:");
		sLabel.setBounds(30, 150, 500, 30);
		sLabel.setFont(myFont);
		panel.add(sLabel);

        Simg = new ImageIcon("C:\\Users\\Asus\\OneDrive\\Documents\\FT Java Project Edited8\\frames\\Pictures\\SedanLogo.jpg");
		SedanBtn = new JButton(Simg);
		SedanBtn.setBounds(50, 230 , 225, 150);
		panel.add(SedanBtn);
        
        Mimg = new ImageIcon("C:\\Users\\Asus\\OneDrive\\Documents\\FT Java Project Edited8\\frames\\Pictures\\MicroLogo.jpg");
		MicroBtn = new JButton(Mimg);
		MicroBtn.setBounds(295, 230 , 225, 150);
		panel.add(MicroBtn);
        
        SUVimg = new ImageIcon("C:\\Users\\Asus\\OneDrive\\Documents\\FT Java Project Edited8\\frames\\Pictures\\SUVLogo.jpg");
		SUVBtn = new JButton(SUVimg);
		SUVBtn.setBounds(540, 230 , 225, 150);
		panel.add(SUVBtn);

		SedanLabel = new JLabel("Sedan");
		SedanLabel.setBounds(137, 390, 80, 30);
		SedanLabel.setFont(LFont);
		panel.add(SedanLabel);

		MicroLabel = new JLabel("Micro");
		MicroLabel.setBounds(380, 390, 80, 30);
		MicroLabel.setFont(LFont);
		panel.add(MicroLabel);

		SUVLabel = new JLabel("SUV");
		SUVLabel.setBounds(630, 390, 80, 30);
		SUVLabel.setFont(LFont);
		panel.add(SUVLabel);

		BackBtn = new JButton("Back");
		BackBtn.setBounds(383,490,80,30);
		BackBtn.setBackground(myColor2);
		BackBtn.setForeground(Color.WHITE);
		panel.add(BackBtn);


		SedanBtn.addActionListener(this);
		MicroBtn.addActionListener(this);
		SUVBtn.addActionListener(this);
		BackBtn.addActionListener(this);

		this.add(panel);
		validate();
		
    }

    public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == SedanBtn )
		{
			ToyotaSedan ts=new ToyotaSedan();
		    ts.setVisible(true);
		    setVisible(false);
		}
		else if(ae.getSource() == MicroBtn )
		{
			ToyotaMicro tm=new ToyotaMicro();
		    tm.setVisible(true);
		    setVisible(false);
		}
		else if(ae.getSource() == SUVBtn)
		{
			ToyotaSUV tsuv=new ToyotaSUV();
		    tsuv.setVisible(true);
		    setVisible(false);
		}

		else if(ae.getSource() == BackBtn)
		{
            CarBrand b = new CarBrand();
            b.setVisible(true);
		    setVisible(false);    
		}
    }

}