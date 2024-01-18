package aGUI;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Frame_LayeredPane {
    public static void main(String[] args) {
        
        // Layered Pane : provides depth/three-dimension for positioning components

        JLabel label1 = new JLabel();
        label1.setOpaque(true);  // to make visible
        label1.setBackground(Color.RED);
        label1.setBounds(100, 100, 200, 200);

        JLabel label2 = new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.GREEN);
        label2.setBounds(150, 150, 200, 200);
        
        JLabel label3 = new JLabel();
        label3.setOpaque(true);
        label3.setBackground(Color.BLUE);
        label3.setBounds(200, 200, 200, 200);
        

        JLayeredPane layeredpane = new JLayeredPane();
        layeredpane.setBounds(0,0,500,500);
        layeredpane.add(label1);
        layeredpane.add(label2);
        layeredpane.add(label3);

        JFrame frame = new JFrame();                   
		frame.setSize(500,500);  
		frame.setTitle("GRID_LAYOUT");  
		frame.setVisible(true);                    
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.add(layeredpane); 
    }   
}
