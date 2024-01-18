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
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class showsMessage {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Another Mouse Listener");
        frame.setBounds(0, 0, 300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

        JLabel label = new JLabel();
        label.setText("This is some text!");
        label.setFont(new Font("Consolas", Font.BOLD, 20));
        label.setBounds(30, 50, 210, 40);
        label.setOpaque(true);

        JButton showButton = new JButton();
        showButton.setBounds(85, 90, 100, 30);
        showButton.setText("Button");
        showButton.setFont(new Font("Consolas", Font.BOLD, 18));
        showButton.setFocusable(false);
        
        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello World!");
            }
        });

        JButton exitButton = new JButton();
        exitButton.setText("Exit");
        exitButton.setBounds(85, 130, 100, 30);
        exitButton.setFont(new Font("Consolas", Font.BOLD, 18));
        exitButton.setFocusable(false);
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.add(showButton);
        frame.add(exitButton);
        frame.add(label);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}
