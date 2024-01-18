package aGUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Frame_Panel {
    public static void main(String[] args) {

        // JPanel ; a GUI component that acts as a container to hold other components.

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        panel1.setBounds(0,0,200,200);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.BLUE);
        panel2.setBounds(200,0,200,200);

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.GREEN);
        panel3.setBounds(0,200,400,200);

        JLabel label = new JLabel();
        ImageIcon icon = new ImageIcon("range.png");
        label.setText("Hi");
        label.setFont(new Font("Sans Serif",Font.BOLD, 20));
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(420,440);
        frame.setLayout(null);
        frame.setBackground(Color.blue);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        panel1.add(label);
        panel3.setLayout(new BorderLayout()); 
        
    }
}
