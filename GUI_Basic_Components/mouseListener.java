package GUI_Basic_Components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class mouseListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Mouse Listener");
        frame.setBounds(0, 0, 300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton();
        button.setBounds(90, 150, 120, 40);
        button.setText("Exit");
        button.setFont(new Font("Consolas", Font.BOLD, 20));
        button.setForeground(Color.BLACK);
        button.setFocusable(false);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        frame.add(button);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}