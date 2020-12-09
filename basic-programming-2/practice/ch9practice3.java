
import javax.swing.*;
import java.awt.*;

public class ch9practice3 extends JFrame {
	public practice3() {
		setTitle("The Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10));
		
		for(int i=0; i<10; i++) {
			c.add(new JButton(Integer.toString(i)));
		}
		
		setSize(500, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new practice3();
	}
}
