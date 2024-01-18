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
import javax.swing.JProgressBar;
import javax.swing.border.Border;

public class Frame_ProgressBar {
    static JProgressBar bar;
    public static void main(String[] args) {
        JFrame frame = new JFrame();                   
		frame.setSize(200,200);  
		frame.setTitle("RADIO_BUTTONS");  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        JProgressBar bar = new JProgressBar();
        bar.setValue(0);
        bar.setBounds(0,0,420,50);
        bar.setStringPainted(true);
        bar.setFont(new Font("Consolas", Font.BOLD, 20));

        frame.setVisible(true);             
        frame.add(bar);     
        frame.setVisible(true); 

        fill();
    }

    public static void fill(){
        int counter = 0; 
        while(counter <= 100){
            bar.setValue(counter);
            try{
                Thread.sleep(50);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            counter += 1;
        }
        bar.setString("Done!");
    }
    
}
