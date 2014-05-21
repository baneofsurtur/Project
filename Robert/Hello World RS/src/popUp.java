
import javax.swing.*;
import java.awt.Font;

//popUp Class.  The 'p' in popUp should be capitalized 
//in professional code.  I made a typo making this test class.
public class popUp {

	//Create Main Frame
	JFrame frame = new JFrame("Hello World");

	//Show Frame On Screen
	void ShowFrame() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Create Label and Set Text and Font
		JLabel label = new JLabel("Hello Caleb and Antione!");
		label.setFont(new Font("Times New Roman", Font.BOLD, 34));
		
		//Put Label In Frame
		frame.getContentPane().add(label);

		//Size and Position Frame
		frame.setSize(400,300);
		frame.setLocation(600,300);
		
		//Display Frame
		frame.setVisible(true);
	}
   
}
