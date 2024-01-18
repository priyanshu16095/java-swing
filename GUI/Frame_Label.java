package aGUI;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Frame_Label {
    public static void main(String[] args) {
        
    // Jlabel : a GUI display area for a string, image, etc.
        
    MyFrame frame = new MyFrame();    
    ImageIcon image = new ImageIcon("di.png");
    Border border = BorderFactory.createLineBorder(Color.RED,6, true);
    
    JLabel label = new JLabel("Bro do you even code!", null, 0);
    frame.add(label);
    label.setIcon(image);
    label.setHorizontalTextPosition(JLabel.CENTER);
    label.setVerticalAlignment(JLabel.TOP);
    label.setFont(new Font("Sans Serif", Font.BOLD, 20));
    label.setBackground(Color.ORANGE);
    label.setIconTextGap(50);   // ADDS MARGIN
    label.setOpaque(true);         // SHOW THE BACKGROUND COLOR
    label.setBorder(border);
    label.setVerticalAlignment(JLabel.CENTER);
    label.setHorizontalAlignment(JLabel.CENTER);
    frame.setLayout(null);
    // label.setBounds(10, 10, 300, 300);
    }
}


