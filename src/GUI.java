
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI {
    private String path;
    public GUI(){
        JFrame frame = new JFrame();
        JLabel label = new JLabel("Hello, what is your name?");
        label.setFont(new Font("Arial", Font.BOLD, 13));
        JTextField jt = new JTextField(30);
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(label);
        jt.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                path = jt.getText();
                jt.setText("");
            }
        });
        String name = path;
        jt.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                label.setText("Nice to meet you, what is your weekly salary?");
                path = jt.getText();
                jt.setText("");  
            }
        }); 
        String weeklySalary = path;
        label.setText("Thank you " + name + ", we will increase your weekly salary by 50 dollars. \nYour new weekly salary is: " + weeklySalary);   
        jt.setFont(new Font("Arial", Font.ITALIC, 11));
        panel.add(jt);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Assignment 1");
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new GUI();
    }
}