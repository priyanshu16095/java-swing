package GUI_Basic_Components;

import java.awt.Color;
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

public class simpleQuizGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(0, 0, 0, 0);
        frame.setTitle("Another Mouse Listener");
        frame.setBounds(0, 0, 300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel();
        label.setText("Quiz Game");
        label.setFont(new Font("Consolas", Font.BOLD, 20));
        label.setBounds(80, 50, 210, 40);
        label.setOpaque(true);

        JButton startButton = new JButton();
        startButton.setBounds(85, 90, 100, 30);
        startButton.setText("Start");
        startButton.setFont(new Font("Consolas", Font.BOLD, 18));
        startButton.setFocusable(false);
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showInputDialog("What is your name?");
                JOptionPane.showConfirmDialog(null, "Do you code?", "INFO", JOptionPane.YES_NO_CANCEL_OPTION);

                String[] responses = {"No, you are awesome!", "Thank You!", "*blush*"};
                JOptionPane.showOptionDialog(null, "You are awesome!", "secret message",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, responses, 0);
                System.exit(0);
            }
        });

        JButton exitButton = new JButton();
        exitButton.setText("Exit");
        exitButton.setBounds(85, 130, 100, 30);
        exitButton.setFont(new Font("Consolas", Font.BOLD, 18));
        exitButton.setFocusable(false);
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.add(label);
        frame.add(startButton);
        frame.add(exitButton);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}
