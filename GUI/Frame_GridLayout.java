package aGUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Frame_GridLayout {
    public static void main(String[] args) {
        
        // Grid Layout : place components in a grid of cells
        //               a layout manager that lays out a container's components in a rectangular grid.
        //               The container is divided into equal-sized rectangles, and one component is placed in
        //               each rectangle.

        JFrame frame = new JFrame();                   
		frame.setSize(420,420);  
		frame.setTitle("GRID_LAYOUT");  
		frame.setVisible(true);                    
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.lightGray);
        panel.setPreferredSize(new Dimension(250,250));
        panel.setLayout(new GridLayout(3,3,5,5));
        // panel.setLayout(new GridLayout(ROWS, COLOUMNS, HORIZONTAL_SPACING, VERTICAL_SPACING));
        
        panel.add(new JButton("1"));
        panel.add(new JButton("2"));
        panel.add(new JButton("3"));
        panel.add(new JButton("4"));
        panel.add(new JButton("5"));
        panel.add(new JButton("6"));
        panel.add(new JButton("7"));
        panel.add(new JButton("8"));
        panel.add(new JButton("9 "));
        frame.add(panel);
        
    }
    
}
