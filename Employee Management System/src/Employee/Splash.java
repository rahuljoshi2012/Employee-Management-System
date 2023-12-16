package Employee;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Splash extends JFrame implements ActionListener {

    Splash(){

        getContentPane().setBackground(Color.black);

        setLayout(null);

        JLabel h = new JLabel("Employee Management  "); // Creates a heading but to how we need to add it to frame
        add(h);
        h.setBounds(270, 0 , 1500,70 );
        h.setFont((new Font("Times new Roman " , Font.BOLD , 40))); // takes 3 arguments font , type - bold, plain etc , size
        h.setForeground(Color.darkGray);

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("Icons/effective-employee-management.jpg"));
        Image i1 = i.getImage().getScaledInstance(1100,500,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel img = new JLabel(i2);
        img.setBounds(0,0,1080,500);
        add(img);

        JButton button = new JButton("Click to Continue");
        button.setBounds(390,420,200,30);
        button.setBackground(Color.white);
        button.setForeground(Color.black);
        img.add(button); // adds the button on top of the image
        button.addActionListener(this);

        setSize(1000 , 500);
        setResizable(false);
        setVisible(true);
        setLocation(12,50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {

        new Splash();
    }

    public void actionPerformed(ActionEvent e) {

        setVisible(false);
        new LoginPage();

    }
}
