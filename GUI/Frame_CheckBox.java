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
import javax.swing.border.Border;

public class Frame_CheckBox extends MyFrame implements ActionListener {
    public  void main(String[] args) {
        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(420, 420);
        frame.setVisible(true);
        frame.setTitle("A_GUI_FOR_PRACTICE");
        frame.setResizable(true);
        
        JButton button = new JButton();
        button.setText("Submit");
        button.getActionListeners();

        JCheckBox checkBox = new JCheckBox();
        checkBox.setText("I'm not a robot!");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas", Font.BOLD, 35));
        frame.add(checkBox);
        frame.add(button);

    }
    
    // @Override
    // public void actionPerformed(ActionEvent e) {
    //     if(e.getSource()==button) {
    //         System.out.println(checkBox.isSelected());

    //     }
    // }
    
}
