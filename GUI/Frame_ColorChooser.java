package aGUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.Border;
import javax.xml.namespace.QName;

public class Frame_ColorChooser implements ActionListener {
    JButton button;
    JLabel label;
    public static void main(String[] args) {

        JFrame frame = new JFrame();                   
		frame.setTitle("COLOR_CHOOSER");  
		frame.setSize(200,200);  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton button = new JButton("Pick a color");
        //  button.addActionListener(this);\
        button.setFocusable(false);
        button.setFont(new Font("Consolas", Font.BOLD, 15));
        
        JLabel label = new JLabel();
        label.setBackground(Color.white);
        label.setOpaque(true);
        label.setText("This is some info!");
        label.setFont(new Font("Consolas", Font.BOLD, 30));

        frame.add(label);
        frame.add(button);
        frame.pack();
		frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button) {
            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null, "Pick a color...I guess", Color.BLACK);
            // label.setForeground(color);
            label.setBackground(color);
        }  
    }
    
}
