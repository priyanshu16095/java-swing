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

public class menuBarItem {
    public static void main(String[] args) {
        // STEPS TO MAKE A MENU BAR
        // STEP1: CREATE JMENUBAR
        // STEP2: CREATE JMENU AND ADD IT TO JMENUBAR
        // STEP3: CREATE JMENUITEM AND ADD IT TO PARTICULAR JMENU
        // NO LAYOUT MANAGER REQUIRED
        JFrame frame = new JFrame();
        frame.setTitle("Menu Bar Item");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 300, 400);

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu saveMenu = new JMenu("Save");
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(saveMenu);

        // FILE MENU ITEMS
        JMenuItem loadItem = new JMenuItem("Load");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
    
}
