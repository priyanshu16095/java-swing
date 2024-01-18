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
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.Border;

public class Frame_ChoosingFile implements ActionListener {
    JButton button;
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();                   
		frame.setTitle("RADIO_BUTTONS");  
		frame.setSize(200,200);  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
		frame.setVisible(true);

        JButton button = new JButton("Select File");
        // button.addActionListener(this);
            
        frame.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showOpenDialog(null);  // SELECT FILE TO OPEN
            // fileChooser.setCurrentDirectory(new File("."));
            // System.out.println(fileChooser.showOpenDialog(null));
            // int response = fileChooser.showOpenDialog(fileChooser);
            int response = fileChooser.showSaveDialog(fileChooser);
            if(response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }
        }
    }
    
}
