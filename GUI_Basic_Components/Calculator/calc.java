package GUI_Basic_Components.Calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.Action;
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
import javax.swing.JTextField;
import javax.swing.border.Border;

public class calc {
    calc() {
        JFrame frame = new JFrame();
        frame.setTitle("Calculator");
        frame.setBounds(0, 0, 400, 380);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setFont(new Font("Consolas", Font.BOLD, 30));
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.lightGray);

        JMenuBar menuBar = new JMenuBar();        
        JMenu option = new JMenu("Option");
        JMenuItem exit = new JMenuItem("Exit");
        JMenuItem about = new JMenuItem("About");
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Working...");
                System.exit(0);
            }
        });
        about.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new about();
                frame.setVisible(false);
            }
        });
        option.add(about);
        option.add(exit);
        
        JMenu theme = new JMenu("Theme");
        JMenuItem light = new JMenuItem("Light");
        JMenuItem dark = new JMenuItem("Dark");
        theme.add(light);
        theme.add(dark);
        menuBar.add(theme);
        menuBar.add(option);
        
        JPanel panel = new JPanel();
        panel.setBounds(55, 30, 270, 45);
        panel.setBackground(Color.lightGray);
        JLabel label = new JLabel();
        label.setText("Calculator");
        label.setFont(new Font("Consolas", Font.BOLD, 30));
        label.setForeground(Color.WHITE);
        panel.setBackground(Color.decode("#303841"));
        panel.add(label);
        
        JTextField textField1 = new JTextField();
        textField1.setBounds(55, 90, 270, 45);
        textField1.setFont(new Font("Consolas", Font.BOLD, 30));
        
        JTextField textField2 = new JTextField();
        textField2.setBounds(55, 150, 270, 45);
        textField2.setFont(new Font("Consolas", Font.BOLD, 30));
        int num2 = 0;

        JPanel panel2 = new JPanel();
        panel2.setBounds(95, 260, 150, 40);
        panel2.setBackground(Color.decode("#303841"));
        JLabel out = new JLabel("Sum : ");
        out.setFont(new Font("Consolas", Font.BOLD, 30));
        out.setForeground(Color.white);
        panel2.add(out);
        
        JButton addButton = new JButton();
        addButton.setBounds(126, 210, 100, 38);
        addButton.setText("Add");
        addButton.setFont(new Font("Consolas", Font.BOLD, 25));
        addButton.setForeground(Color.BLACK);
        addButton.setFocusable(false);
        addButton.setBackground(Color.decode("#be3144"));
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(textField1.getText());
                int num2 = Integer.parseInt(textField2.getText());
                int sum = num1 + num2;
                String add = Integer.toString(sum);
                out.setText("Sum : " + add);
                panel2.setBounds(105, 260, 150, 40);
                textField1.setText("");
                textField2.setText("");
            }
        });
        
        light.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().setBackground(Color.lightGray);
                panel.setBackground(Color.decode("#303841"));
                label.setForeground(Color.WHITE);
                addButton.setBackground(Color.decode("#be3144"));
                panel2.setBackground(Color.decode("#303841"));
                out.setForeground(Color.white);
            }
        });
        dark.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // frame.getContentPane().setBackground(Color.decode("#3a4750"));
                frame.getContentPane().setBackground(Color.decode("#454545"));
                panel.setBackground(Color.decode("#303841"));
                label.setForeground(Color.WHITE);
                addButton.setBackground(Color.decode("#be3144"));
                panel2.setBackground(Color.decode("#303841"));
                out.setForeground(Color.white);

            }
        });
       
        frame.setJMenuBar(menuBar);
        frame.add(addButton);
        frame.add(textField1);
        frame.add(textField2);
        frame.add(panel);
        frame.add(panel2);
        frame.setLayout(null);
        frame.setVisible(true);
    }    

    public static void main(String[] args) {
        new calc();
    }

}
