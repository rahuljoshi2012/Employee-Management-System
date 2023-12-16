package Employee;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;

public class Home_page extends JFrame implements ActionListener {

    public Statement s;
    JButton view, add, update, remove;
    Home_page(){

        setSize(1120,630);
        setLocation(50 , 30);
        setVisible(true);

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("Icons/home.jpg"));
        Image i1 = i.getImage().getScaledInstance(1120,630,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        JLabel img = new JLabel(i2);
        img.setBounds(0,0,1120,630);
        add(img);

        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(620, 20, 400, 40);
        heading.setFont(new Font("Raleway", Font.BOLD, 25));
        img.add(heading);

        add = new JButton("Add Employee");
        add.setBounds(650, 80, 150, 40);
        add.addActionListener(this);
        img.add(add);

        view = new JButton("View Employees");
        view.setBounds(820, 80, 150, 40);
        view.addActionListener(this);
        img.add(view);

        update = new JButton("Update Employee");
        update.setBounds(650, 140, 150, 40);
        update.addActionListener(this);
        img.add(update);

        remove = new JButton("Remove Employee");
        remove.setBounds(820, 140, 150, 40);
        remove.addActionListener( this);
        img.add(remove);
    }

    public static void main(String[] args) {
        new Home_page();
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            setVisible(false);
            new AddEmployee();
        } else if (e.getSource() == view) {
            setVisible(false);
            new ViewEmployee();
        } else if (e.getSource() == update) {
            setVisible(false);
            new ViewEmployee();
        } else {
            setVisible(false);
            new RemoveEmployee();
        }
    }
}
