package aGUI;

import java.awt.Color;
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

public class Frame_Button extends Creating_A_GUI {
    public static void main(String[] args) {

        // JButton : a button that performs an action when clicked.

        JLabel label = new JLabel();
        ImageIcon ic = new ImageIcon("range.png");
        label.setIcon(ic);

        MyFrame frame = new MyFrame();  // new MyFrame();
        ImageIcon icon = new ImageIcon("range.png");
        
        JButton button = new JButton();
        button.setBounds(20, 20, 200, 100);
        frame.setLayout(null);
        frame.add(button);
        button.setText("BUTTON");
        button.setFocusable(false);
        // button.addActionListener(this);
        button.setForeground(Color.red);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setFont(new Font("Monospace", Font.BOLD, 20));
        frame.add(label);
    }
    // @Override
    // public void actionPerformed(ActionEvent e) {
    //     if (e.getSource()==button){
    //         System.out.println("hello");
    //         button.setEnabled(false);
    //         label.setVisible(true);
    //     }
    // }
    
}
