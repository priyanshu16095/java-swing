package aGUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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

public class Frame_MouseListener_02 implements MouseListener {
    JLabel label;
    ImageIcon smile;
    ImageIcon shocked;
    ImageIcon blush;
    ImageIcon saitama;
    public static void main(String[] args) {

        JFrame frame = new JFrame();                   
		frame.setTitle("MOUSE_LISTENER");  
		frame.setSize(500,500);  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        ImageIcon smile = new ImageIcon("smile.png");
        ImageIcon shocked = new ImageIcon("shocked.png");
        ImageIcon blush = new ImageIcon("blush.png");
        ImageIcon saitama = new ImageIcon("saitama.png");

        JLabel label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.RED);
        label.setOpaque(true);
        // label.addMouseListener(this);
        label.setIcon(smile);

        frame.add(label);
		frame.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // INVOKED WHEN THE MOUSE CLICKED A COMPONENT
        System.out.println("You clicked the mouse.");
        label.setIcon(smile);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // INVOKED WHEN THE MOUSE PRESSED A ELEMENT
        System.out.println("You pressed the mouse.");
        label.setIcon(shocked);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // INVOKED WHEN THE MOUSE RELEASE A COMPONENT
        System.out.println("You released the mouse.");
        label.setIcon(blush);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // INVOKDE WHEN THE MOUSE ENTERS A COMPONENT
        System.out.println("You entered the  component");
        label.setIcon(saitama);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // INVOKED WHEN THE MOUSE EXITS A COMPONENT
        System.out.println("You exited the component");
    }

}
