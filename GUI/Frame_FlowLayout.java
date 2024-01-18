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
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Frame_FlowLayout {
    public static void main(String[] args) {
        
        // Layout Manager : defines the natural layout for components within in a container
        // Flow Layout : places compenents in a row, size at their preferred size
        //               If the horizontal space in the container is too small,
        //               the FlowLayout class uses the next row.

        JFrame frame = new JFrame();
        frame.setTitle("FLOW_LAYOUT");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        // frame.setLayout(new FlowLayout(FlowLayout.CENTER, horizontalSpacing, verticalSpacing));

        JPanel panel = new JPanel();
        panel.setBackground(Color.lightGray);
        panel.setPreferredSize(new Dimension(250,250));
        panel.setSize(300, 300);
        panel.setLayout(new FlowLayout());
        
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

        // ADDING ALL THE BUTTONS TO THE PANEL
        // frame.add(new JButton("1"));
        // frame.add(new JButton("2"));
        // frame.add(new JButton("3"));
        // frame.add(new JButton("4"));
        // frame.add(new JButton("5"));
        // frame.add(new JButton("6"));
        // frame.add(new JButton("7"));
        // frame.add(new JButton("8"));
        // frame.add(new JButton("9 "));
        // frame.add(panel);

        frame.setVisible(true);
    }


}
