package aGUI;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener {
    // CREATED A CONSTRUCTOR FOR FURTHER USE
    MyFrame() {
        JFrame frame = new JFrame();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(420, 420);
        this.setVisible(true);
        this.setTitle("A_GUI_FOR_PRACTICE");
        this.setResizable(true);

        JCheckBox checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot!");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.BOLD, 35));
        this.add(checkBox);   
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}