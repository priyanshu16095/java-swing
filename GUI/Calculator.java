package aGUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
    
    JTextField textField = new JTextField();
    JFrame frame;
    JPanel panel;
    JButton[] numButtons = new JButton[11];
    JButton[] funButton = new JButton[8];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton;

    Font myFont = new Font("Consolas", Font.BOLD, 30);

    double num1 = 0, num2 = 0, result = 0;
    String operator;


    Calculator() {
        frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setSize(335,540);
        frame.setLayout(null);
        frame.setResizable(false);

        textField.setBounds(20,35,280,50);
        textField.setFont(myFont);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("Delete");
        clrButton = new JButton("Clear");

        // ADDING BUTTON IN THE ARRAY funButtons[]
        funButton[0] = addButton;
        funButton[1] = subButton;
        funButton[2] = mulButton;
        funButton[3] = divButton;
        funButton[4] = decButton;
        funButton[5] = equButton;
        funButton[6] = delButton;
        funButton[7] = clrButton;

        // USING A FOR LOOP TO ITERATE THROUGH THESE BUTTONS
        for(int i = 0; i < 8; i++) {
            funButton[i].addActionListener((ActionListener) this);
            funButton[i].setFont(myFont);
            funButton[i].setFocusable(false);
        }

        for(int i = 0; i < 10; i++) {
            numButtons[i] = new JButton(String.valueOf(i));
            numButtons[i].addActionListener((ActionListener) this);
            numButtons[i].setFont(myFont);
            numButtons[i].setFocusable(false);
        }

        delButton.setBounds(40,530,135,40);
        clrButton.setBounds(170,430,135,40);

        panel = new JPanel();
        panel.setBounds(20,110,280,300);
        panel.setLayout(new GridLayout(4,4,5,5));
        // panel.setBackground(Color.GRAY);
        panel.add(numButtons[1]);
        panel.add(numButtons[2]);
        panel.add(numButtons[3]);
        panel.add(addButton);
        panel.add(numButtons[4]);
        panel.add(numButtons[5]);
        panel.add(numButtons[6]);
        panel.add(subButton);
        panel.add(numButtons[7]);
        panel.add(numButtons[8]);
        panel.add(numButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        frame.add(panel);
        frame.add(delButton);
        frame.add(clrButton);
        frame.add(textField);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0; i < 11; i++){
            if(e.getSource()==numButtons[i]){
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
            if(e.getSource()==decButton){
                textField.setText(textField.getText().concat("."));
            }
            if(e.getSource()==addButton){
                num1 = Double.parseDouble(textField.getText());   // PARSEDOUBLE : CONVERTS STRING INTO DOUBLE VALUE
                operator = "+" ;
                textField.setText("");
            }
            if(e.getSource()==subButton){
                num1 = Double.parseDouble(textField.getText());   // PARSEDOUBLE : CONVERTS STRING INTO DOUBLE VALUE
                operator = "-" ;
                textField.setText("");
            }
            if(e.getSource()==mulButton){
                num1 = Double.parseDouble(textField.getText());   // PARSEDOUBLE : CONVERTS STRING INTO DOUBLE VALUE
                operator = "*" ;
                textField.setText("");
            }
            if(e.getSource()==divButton){
                num1 = Double.parseDouble(textField.getText());   // PARSEDOUBLE : CONVERTS STRING INTO DOUBLE VALUE
                operator = "/" ;
                textField.setText("");
            }

            // switch(operator) {
            //     case '+' :
            //        result = num1 + num2;
            //        break;
            //     case '-' :
            //        result = num1 - num2;
            //        break;
            //     case '*' :
            //        result = num1 * num2;
            //        break;
            //     case '/' :
            //        result = num1 / num2;
            //        break;
            // }
            textField.setText(String.valueOf(result));
            num1 = result;
        }

        // if(e.gerSource()==clrButton) {
        //     textField.setText("");
        // }
        if(e.getSource()==delButton) {
            
        }


        }

   

}
