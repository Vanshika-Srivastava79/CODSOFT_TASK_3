import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{

    

    Score(String name, int score) {
        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300,250,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,150,300,250);
        add(image);

        JLabel heading = new JLabel("Thankyou "+ name + " for playing QuickBits!");
        heading.setBounds(185,30,700,30);
        heading.setFont(new Font("Georgia", Font.PLAIN,24));
        heading.setForeground(new Color(0,128,128));
        add(heading);

        JLabel qscore  = new JLabel("Your score is " + score);
        qscore.setBounds(380,160,300,30);
        qscore.setFont(new Font("Tahoma", Font.PLAIN,24));
        qscore.setForeground(new Color(0,107,117));
        add(qscore);

        JButton submit = new JButton("Play Again");
        submit.setBounds(400,320,120,30);
        submit.setBackground(new Color(173,216,230));
        submit.setForeground(new Color(64,64,64));
        submit.addActionListener(this);
        add(submit);

        

        setVisible(true);


    }
    public void actionPerformed (ActionEvent e) { 
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Score("User",0);

       
    }
}