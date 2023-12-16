package Employee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
public class LoginPage extends JFrame implements ActionListener {

    JTextField userTEXT;
    JTextField passTEXT;

    LoginPage(){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel LoginHere = new JLabel("Login Here");
        LoginHere.setFont((new Font("Times new Roman " , Font.BOLD , 20)));
        LoginHere.setBounds(170, 10, 200, 30);
        add(LoginHere);

        JLabel username = new JLabel("Username");
        username.setBounds(40, 70, 100, 30);
        add(username);

        userTEXT = new JTextField();
        userTEXT.setBounds(150, 70, 150, 30);
        add(userTEXT);

        JLabel password = new JLabel("Password");
        password.setBounds(40, 110, 100, 30);
        add(password);

        passTEXT = new JTextField();
        passTEXT.setBounds(150, 110, 150, 30);
        add(passTEXT);

        JButton login = new JButton("LOGIN");
        login.setBounds(150, 180, 150, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        setSize(600, 300);
        setLocation(450, 200);
        setVisible(true);
        setResizable(false);

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("Icons/Emp.png"));
        Image i1 = i.getImage().getScaledInstance(150,100, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel img = new JLabel(i2);
        img.setBounds(350, 60, 150, 100);
        add(img);


    }
    public static void main(String[] args) {

        new LoginPage();
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            String username = userTEXT.getText();
            String password = passTEXT.getText();

            JDBC_Connect c = new JDBC_Connect();
            String query = "select * from login where username = '"+username+"' and password = '"+password+"'";

            ResultSet rs = c.s.executeQuery(query);
            if (rs.next()) {
                setVisible(false);
                new Home_page();

            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password");
                setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

