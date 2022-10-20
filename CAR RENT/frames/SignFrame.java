package frames;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignFrame extends JFrame implements ActionListener
{
	JPanel panel;
	JLabel label1,label2;
	JButton signupJB,signinJB;
	Font myFont,BTFont1,BTFont2;
	
	public SignFrame()
	{
		super("Sign In / Sign Up");
		this.setSize(1024,720);//Frame Size X=720,Y=1080
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		panel.setLayout(null);
		myFont=new Font("Cambria",Font.BOLD,19);
		
		
		label1=new JLabel("New here ? Sign Up!");
		label1.setBounds(420,150,200,40);
		label1.setFont(myFont);
		panel.add(label1);
		
		signupJB=new JButton("Sign Up");
		signupJB.setBounds(420,210,160,40);
		panel.add(signupJB);
		
		label2=new JLabel("Already have an account? Sign In");
		label2.setBounds(350,290,300,40);
		label2.setFont(myFont);
		panel.add(label2);
		
		signinJB=new JButton("Sign In");
		signinJB.setBounds(420,350,160,40);
		panel.add(signinJB);
		
		signupJB.addActionListener(this);
		signinJB.addActionListener(this);
		
		this.add(panel);
		
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == signupJB)
		{
			RegFrame r=new RegFrame();
		    r.setVisible(true);
		    setVisible(false);
		}
		else if(ae.getSource() == signinJB)
		{
			LoginFrame l=new LoginFrame();
		    l.setVisible(true);
		    setVisible(false);
		}
	}
}
		