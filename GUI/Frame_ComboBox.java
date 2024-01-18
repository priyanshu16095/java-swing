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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Frame_ComboBox implements ActionListener {

    JComboBox comboBox;

    public static void main(String[] args) {
        JFrame frame = new JFrame();                   
		frame.setSize(200,200);  
		frame.setTitle("COMBOBOX");  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        
        String[] animals = {"Dog", "Cat", "Elephant"};
        JComboBox comboBox = new JComboBox(animals);
        // comboBox.addActionListener();  [TO PRINT THE SELECTED]
        // comboBox.setEditable(true);
        // System.out.println(comboBox.getItemCount());
        comboBox.insertItemAt("Pig", 0);
        comboBox.setSelectedIndex(0);
        // comboBox.removeItem("Cat");
        // comboBox.removeItemAt(2);
        // comboBox.removeAllItems();
        
        frame.add(comboBox);
        frame.pack();
		frame.setVisible(true);                    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox);
        System.out.println(comboBox.getSelectedItem());
        System.out.println(comboBox.getSelectedIndex());
    }

}
