package GUI_Basic_Components.Login;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;

import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.Border;

import java.util.HashMap;

public class login {
    HashMap<String, String> loginInfo = new HashMap<String, String>();
    login(HashMap<String, String> loginInfo) {
        JFrame frame = new JFrame();
        frame.setTitle("Login Page");
        frame.setBounds(0, 0, 350, 280);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setFont(new Font("Consolas", Font.BOLD, 30));
        frame.setResizable(false);

        JLabel userIDlabel = new JLabel();
        userIDlabel.setFont(new Font("Consolas", Font.BOLD, 23));
        userIDlabel.setText("userID");
        userIDlabel.setBounds(20, 30, 120, 40);
        userIDlabel.setForeground(Color.BLACK);
        
        JLabel passlabel = new JLabel();
        passlabel.setFont(new Font("Consolas", Font.BOLD, 23));
        passlabel.setText("Password");
        passlabel.setBounds(20, 80, 150, 40);
        passlabel.setForeground(Color.BLACK);
        
        JTextField nameField = new JTextField();
        nameField.setBounds(145, 30, 150, 30);
        nameField.setFont(new Font("Monospace", Font.BOLD,18));
        
        JPasswordField passField = new JPasswordField();
        passField.setBounds(145, 80, 150, 30);
        passField.setFont(new Font("Monospace", Font.BOLD,18));

        
        JLabel out = new JLabel();
        out.setBounds(52 ,185, 250, 40);
        out.setFont(new Font("Consolas", Font.BOLD, 25));
        out.setForeground(Color.red);

        JButton loginButton = new JButton();
        loginButton.setText("Login");
        loginButton.setFont(new Font("Consolas", Font.BOLD, 20));
        loginButton.setBounds(110, 130, 100, 40);
        loginButton.setFocusable(false);
        loginButton.setBackground(Color.decode("#be3144"));
        loginButton.setForeground(Color.white);
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userID =  nameField.getText();
                String password = String.valueOf(passField.getPassword());

                if(loginInfo.containsKey(userID)) {
                    if(loginInfo.get(userID).equals(password)) {
                        out.setText("Login Successful!");
                        out.setForeground(Color.green);
                    } else {
                        out.setText("Login Failed! :(");
                        out.setForeground(Color.RED);
                    }
                } else {
                    out.setFont(new Font("Consolas", Font.BOLD, 23));
                    out.setText("Username not found!");
                    out.setForeground(Color.RED);
                }
                nameField.setText("");
                passField.setText("");
            }
        });
        
        frame.add(userIDlabel);
        frame.add(passlabel);
        frame.add(out);
        frame.add(loginButton);
        frame.add(nameField);
        frame.add(passField);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
