
import javax.swing.*;
import java.awt.*;

public class ch9practice5 extends JFrame {
	public practice5() {
		setTitle("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4, 4);
		
		Container c = getContentPane();
		c.setLayout(grid);
		
		Color[] color = {
	            Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
	            Color.CYAN, Color.BLUE, Color.MAGENTA, Color.DARK_GRAY,
	            Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.BLACK,
	            Color.BLACK, Color.ORANGE, Color.BLUE, Color.MAGENTA
	        };
		
		for(int i=0; i<16; i++) {
			JLabel la = new JLabel(Integer.toString(i));
			la.setBackground(color[i]);
			la.setOpaque(true);
			c.add(la);
		}
		
		setSize(500, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new practice5();
	}
}
