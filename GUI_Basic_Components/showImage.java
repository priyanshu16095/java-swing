package GUI_Basic_Components;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.sound.midi.MidiDevice.Info;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class showImage {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(0, 0, 1000, 800);
        frame.setTitle("Show Image");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("../img/code.jpg"));
        JLabel label = new JLabel(image);
        frame.add(label);

        // Container c = frame.getContentPane();
        // JLabel label = new JLabel();
        // label.setIcon(new ImageIcon("../img/code.jpg"));
        // label.setBounds(0, 0, 700, 700);
        // c.add(label);

        frame.setLayout(null);
        frame.setVisible(true);
    }
}