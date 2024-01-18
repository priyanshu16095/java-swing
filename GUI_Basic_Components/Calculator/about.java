package GUI_Basic_Components.Calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

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
import javax.swing.border.Border;

public class about {
    about() {
        JFrame frame = new JFrame();
        frame.setTitle("About");
        frame.setBounds(0, 0, 400, 380);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setFont(new Font("Consolas", Font.BOLD, 30));
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.lightGray);

        JPanel panel = new JPanel();
        panel.setBounds(40, 20, 300, 100);
        JLabel name = new JLabel("Author : Priyanshu Gupta");
        name.setFont(new Font("Consolas", Font.BOLD, 20));
        JLabel date = new JLabel("15-oct, 2023");
        date.setFont(new Font("Consolas", Font.BOLD, 20));
        panel.add(name);
        panel.add(date);


        JButton exitButton = new JButton("Back");
        exitButton.setBounds(120, 130, 120, 35);
        exitButton.setFocusable(false);
        exitButton.setForeground(Color.white);
        exitButton.setFont(new Font("Consolas", Font.BOLD, 25));
        exitButton.setBackground(Color.decode("#be3144"));
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new calc();
                frame.setVisible(false);
            }
        });

        frame.add(exitButton);
        frame.add(panel);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
