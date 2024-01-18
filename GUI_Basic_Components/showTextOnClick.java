package GUI_Basic_Components;

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

public class showTextOnClick {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(0, 0, 320, 400);
        frame.setTitle("Shows Text");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JLabel label = new JLabel();
        label.setText("This is some text!");
        label.setFont(new Font("Consolas", Font.BOLD, 20));
        label.setBounds(50, 50, 210, 40);
        label.setOpaque(true);

        JButton capitalButton = new JButton();
        capitalButton.setBounds(45, 90, 200, 30);
        capitalButton.setText("Capital Letters");
        capitalButton.setFont(new Font("Consolas", Font.BOLD, 17));
        capitalButton.setFocusable(false);
        capitalButton.addActionListener(null);
        capitalButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("THIS IS SOME TEXT!");
            }
        });

        JButton resetButton = new JButton();
        resetButton.setBounds(45, 170, 200, 30);
        resetButton.setText("Reset");
        resetButton.setFont(new Font("Consolas", Font.BOLD, 17));
        resetButton.setFocusable(false);
        resetButton.addActionListener(null);
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("This is some Text!");
            }
        });
        
        JButton smallButton = new JButton();
        smallButton.setBounds(45, 130, 200, 30);
        smallButton.setText("Small Letters");
        smallButton.setFont(new Font("Consolas", Font.BOLD, 17));
        smallButton.setFocusable(false);
        smallButton.addActionListener(null);
        smallButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("this is some text!");
            }
        });
        
        JButton exitButton = new JButton();
        exitButton.setBounds(45, 210, 200, 30);
        exitButton.setText("Exit");
        exitButton.setFont(new Font("Consolas", Font.BOLD, 17));
        exitButton.setFocusable(false);
        exitButton.addActionListener(null);
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.add(label);
        frame.add(capitalButton);
        frame.add(resetButton);
        frame.add(smallButton);
        frame.add(exitButton);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
