
import java.awt.*;
import javax.swing.*;

public class ch9practice8 extends JFrame{
	public practice8() {
		super("여러 개의 패널을 가진 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		
		c.add(new NorthPanel(), BorderLayout.NORTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		c.add(new SouthPanel(), BorderLayout.SOUTH);
		
		setSize(300, 300);
		setVisible(true);
	}
		
	public static void main(String[] args) {
		new practice8();
	}
}

class NorthPanel extends JPanel {
	public NorthPanel() {
		setBackground(Color.GRAY);
		add(new JButton("열기"));
		add(new JButton("닫기"));
		add(new JButton("나가기"));
	}
}

class CenterPanel extends JPanel {
	public CenterPanel() {
		setBackground(Color.WHITE);
		setLayout(null);
		for(int i=0; i<10; i++) {
			JLabel la = new JLabel("*");
			int x = (int)(Math.random()*300);
			int y = (int)(Math.random()*200+50);
			la.setLocation(x, y);
			la.setForeground(Color.RED);
			add(la);
		}
	}
}

class SouthPanel extends JPanel {
	public SouthPanel() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setBackground(Color.YELLOW);
		add(new JLabel("Word Input"));
		add(new JTextField(20));
	}
} 
