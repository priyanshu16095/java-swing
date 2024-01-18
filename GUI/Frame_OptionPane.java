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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;


public class Frame_OptionPane {
    public static void main(String[] args) {
        // JOptionPane :  pop up standard dialog box that prompts users for a value or informs them of
        // JOptionPane.showMessageDialog(null, "This is some useless info", "INFO", JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some useless info", "INFO", JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some useless info", "INFO", JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null, "This is some useless info", "INFO", JOptionPane.ERROR_MESSAGE);

        // JOptionPane.showConfirmDialog(null, "Bro, do you even code?","INFO",JOptionPane.YES_NO_CANCEL_OPTION);

        System.out.println( JOptionPane.showConfirmDialog(null, "Bro, do you even code?","INFO",JOptionPane.YES_NO_CANCEL_OPTION));

        String name = JOptionPane.showInputDialog("What is you name ? : ");
        System.out.println("Hello " + name);

        String[] responses = {"No, you are awesome!", "Thank You!", "*blush*"};
        ImageIcon icon = new ImageIcon("range.png");
        JOptionPane.showOptionDialog(null, "You are awesome!", "secret message",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);
    }
}
