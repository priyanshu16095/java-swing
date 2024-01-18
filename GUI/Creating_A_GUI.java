package aGUI;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Creating_A_GUI {
	public static void main(String[] args) {
		JFrame frame = new JFrame();                   
		frame.setSize(420,420);  
		frame.setTitle("Priyanshu Gupta");  
		frame.setVisible(true);                    
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

		// SETS THE BORDER OF JLabel IN JFrame
		// Border border = BorderFactory.createLineBorder(Color.RED,5, true);
		// label.setBorder(border);

		// SETS THE BACKGROUND COLOR
        // this.getContentPane().setBackground(Color.red)

		// SETS THE CONTENT POSITION
		// label.setVeticalAlignment(Jlabel.TOP);

		// SETS THE IMAGE IS LABEL
		// ImageIcon image = new ImageIcon("di.png");
		// label.setIcon(image);

		// SETS THE SIZE OF THE LABLE
		// frame.setLayout(null);
		// label.setBounds(0, 0, 350, 350);

		// WILL FILL THE COMPLETE SIZE OF THE COMPONENTS
		// frame.pack();
		// FIRST ADD ALL THE COMPONENTS AND THE PACK 

		// IF YOU ARE USING SETLAYOUT(); THEN YOU HAVE TO MANUALLY PLACE BY USING SETBOUNDS();
	
	}
}


