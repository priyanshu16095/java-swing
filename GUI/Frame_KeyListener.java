package aGUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.Border;

public class Frame_KeyListener implements KeyListener {
    JLabel label;
    public static void main(String[] args) {

        JFrame frame = new JFrame();                   
		frame.setTitle("KEYLISTENER");  
		frame.setSize(500,500);  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);  // BECAUSE WE ADD MANUALLY

        JLabel label = new JLabel();
        label.setBounds(0, 0, 100, 100);
        label.setBackground(Color.CYAN);
        label.setOpaque(true);

        frame.add(label);
		frame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // keyTyped : invoked when a key is typed. use keychar, char output
        switch(e.getKeyChar()) {
        // YOU CAN ADD MOVE_UP, MOVE_DOWN KEYS BY THERI VALUE MOVE_UP:33
        case 'w' :label.setLocation(label.getX()+10, label.getY());
        break;
        case 'a' :label.setLocation(label.getX(), label.getY()-10);
        break;
        case 's' :label.setLocation(label.getX()-10, label.getY());
        break;
        case 'd' :label.setLocation(label.getX()-10, label.getY()+10);
        break;
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("You released key code: " + e.getKeyCode());
    }
    
}
