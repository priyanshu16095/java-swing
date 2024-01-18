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
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class Frame_Slider implements ActionListener {
    JLabel label;
    JSlider slider;
    public static void main(String[] args) {

        JFrame frame = new JFrame();                   
		frame.setSize(400,400);  
		frame.setTitle("SLIDER");  
		frame.setVisible(true);                    
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        JSlider slider = new JSlider();
        JLabel label = new JLabel();
        
        slider.setPreferredSize(new Dimension(400,400));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(20);
        slider.setPaintLabels(true);
        slider.setFont(new Font("Consolas", Font.BOLD, 20));
        label.setFont(new Font("Consolas", Font.BOLD, 20));
        // slider.setOrientation(SwingConstants.VERTICAL);

        label.setText("°C = " + slider.getValue());
        // slider.addChangeListener(this);
        
        panel.add(slider);
        panel.add(label);
        panel.add(slider);
        frame.add(panel);

        frame.pack();
        frame.setLayout(new FlowLayout());
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("°C = " + slider.getValue());
       
    }
}
