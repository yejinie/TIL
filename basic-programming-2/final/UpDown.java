import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UpDown extends JFrame {
	private int num = 0;
	private JLabel la = new JLabel("count = "+num);
	
	public UpDown() {
		setTitle("Counter ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		la.setLocation(100, 50);
		la.setSize(70, 20);
		c.add(la);
		
		c.addKeyListener(new MyKeyListener());
		
		setSize(300, 200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			if(keyCode == KeyEvent.VK_UP) num += 1;
			else if (keyCode == KeyEvent.VK_DOWN) num -= 1;

			la.setText("count = "+num);
		}
	}

	public static void main(String[] args) {
		new UpDown();
	}
}
