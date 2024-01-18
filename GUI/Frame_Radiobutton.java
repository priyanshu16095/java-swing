package aGUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class Frame_Radiobutton implements ActionListener{

    JRadioButton pizzaButton;
    JRadioButton burgerButton;
    JRadioButton friesButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame();                   
		frame.setTitle("RADIO_BUTTONS");  
		frame.setSize(200,200);  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
		frame.setVisible(true);                    
       

        JRadioButton pizzaButton = new JRadioButton("Pizza");
        JRadioButton burgerButton = new JRadioButton("Burger");
        JRadioButton friesButton = new JRadioButton("Fries");

        // TO SELECT ONLY ONE AT A TIME
        ButtonGroup group = new ButtonGroup();
        group.add(pizzaButton);
        group.add(burgerButton);
        group.add(friesButton);

        // TO PRINT WHEN SELECTED
        // pizzaButton.addActionListener(this);
        // burgerButton.addActionListener(this);
        // friesButton.addActionListener(this);

        frame.add(pizzaButton);
        frame.add(burgerButton);
        frame.add(friesButton);
        frame.pack(); 


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pizzaButton){
            System.out.println("You ordered Pizza!");
        } 
        else if(e.getSource()==burgerButton){
            System.out.println("You ordered Burger!");
        }
        else if(e.getSource()==friesButton){
            System.out.println("You ordered Fries!");
        }
    }
    
}
