import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HW14 extends JFrame {
	private JLabel la = new JLabel("Love Java");
	
	public HW14() {
		setTitle("Left 키로 문자열 이동");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		c.addKeyListener(new MyListener());
		
		la.setLocation(50, 50);
		la.setSize(70, 20);
		c.add(la);
		
		setSize(300, 200);
		setVisible(true);
	
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			
			if(keyCode == KeyEvent.VK_LEFT) {
				if(la.getText() == "Love Java")
					la.setText("avaJ evoL");
				else
					la.setText("Love Java");
			}
		}
	}
	
	public static void main(String[] args) {
		new HW14();
	}
}
