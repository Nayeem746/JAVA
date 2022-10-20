package frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CarBrand extends JFrame implements ActionListener
{
	JLabel qLabel, ToyotaLabel, NissanLabel, HyundaiLabel;
	JButton ToyotaBtn, NissanBtn, HyundaiBtn, LogOutBtn;
	ImageIcon Timg, Nimg, Himg;
	Font myFont, LFont;
    JPanel panel;
    Color myColor;

    public CarBrand()
    {
    	super("Car Brand");
		this.setSize(1024, 720);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		myFont = new Font("Times New Roman", Font.BOLD, 25);
		LFont = new Font("Cambria", Font.BOLD, 15);
		myColor = new Color(255,255,255);
		

		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(myColor);

		qLabel = new JLabel("Which brand of car would you like to rent?");
		qLabel.setBounds(30, 150, 500, 30);
		qLabel.setFont(myFont);
		panel.add(qLabel);
        
        Timg = new ImageIcon("C:\\Users\\Asus\\OneDrive\\Documents\\FT Java Project Edited8\\frames\\Pictures\\ToyotaLogo.png");
		ToyotaBtn = new JButton(Timg);
		ToyotaBtn.setBounds(50, 230 , 225, 150);
		panel.add(ToyotaBtn);
        
        Nimg = new ImageIcon("C:\\Users\\Asus\\OneDrive\\Documents\\FT Java Project Edited8\\frames\\Pictures\\NissanLogo.png");
		NissanBtn = new JButton(Nimg);
		NissanBtn.setBounds(295, 230 , 225, 150);
		panel.add(NissanBtn);

        Himg = new ImageIcon("C:\\Users\\Asus\\OneDrive\\Documents\\FT Java Project Edited8\\frames\\Pictures\\HyundaiLogo.jpg");
		HyundaiBtn = new JButton(Himg);
		HyundaiBtn.setBounds(540, 230 , 225, 150);
		panel.add(HyundaiBtn);

		ToyotaLabel = new JLabel("Toyota");
		ToyotaLabel.setBounds(137, 390, 80, 30);
		ToyotaLabel.setFont(LFont);
		panel.add(ToyotaLabel);

		NissanLabel = new JLabel("Nissan");
		NissanLabel.setBounds(380, 390, 80, 30);
		NissanLabel.setFont(LFont);
		panel.add(NissanLabel);

		HyundaiLabel = new JLabel("Hyundai");
		HyundaiLabel.setBounds(620, 390, 80, 30);
		HyundaiLabel.setFont(LFont);
		panel.add(HyundaiLabel);

		LogOutBtn = new JButton("Log Out");
		LogOutBtn.setBounds(378,490,80,30);
		LogOutBtn.setBackground(Color.RED);
		LogOutBtn.setForeground(Color.WHITE);
		panel.add(LogOutBtn);

		ToyotaBtn.addActionListener(this);
        NissanBtn.addActionListener(this);
        HyundaiBtn.addActionListener(this);
        LogOutBtn.addActionListener(this);

		this.add(panel);
		validate();
    }

    public void actionPerformed(ActionEvent ae)
	{
		
		if(ae.getSource() == ToyotaBtn)
		{
			Toyota t = new Toyota();
            t.setVisible(true);
		    setVisible(false);
		}
		else if(ae.getSource() == NissanBtn)
		{
			Nissan n = new Nissan();
            n.setVisible(true);
		    setVisible(false);
		}
		else if(ae.getSource() == HyundaiBtn)
		{
			Hyundai h = new Hyundai();
            h.setVisible(true);
		    setVisible(false);
		}

		else if(ae.getSource() == LogOutBtn)
		{
			LoginFrame l=new LoginFrame();
		    l.setVisible(true);
		    setVisible(false);
		}
    }

}