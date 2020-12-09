import java.awt.*;
import javax.swing.*;

public class ch9practice6 extends JFrame {
	public practice6() {
		super("Random Labels");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		for(int i=0; i<20; i++) {
			int x = (int)(Math.random()*200) + 50;
			int y = (int)(Math.random()*200) + 50;
			JLabel la = new JLabel();
			la.setLocation(x, y);
			la.setSize(10, 10);
			la.setOpaque(true);
			la.setBackground(Color.BLUE);
			c.add(la);
		}
		
		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new practice6();
	}
}
