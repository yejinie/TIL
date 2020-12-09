import javax.swing.*;
import java.awt.*;

public class Quiz13 extends JFrame {
	public Quiz13() {
		setTitle("나의 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new BorderLayout());
		
		c.add(new NorthPanel(), BorderLayout.NORTH);
		c.add(new CenterPanel(), BorderLayout.CENTER);
		c.add(new SouthPanel(), BorderLayout.SOUTH);
		
		setSize(300, 350);
		setVisible(true);
	}
	
	class NorthPanel extends JPanel {
		public NorthPanel() {
			setBackground(Color.GRAY);
			add(new JLabel("수식입력"));
			add(new JTextField(16));
		}
	}
	
	class CenterPanel extends JPanel {
		public CenterPanel() {
			setLayout(new GridLayout(4, 4));
			for(int i=0; i<10; i++) {
				add(new JButton(Integer.toString(i)));
			}
			
			String op[] = {"CE", "계산", "+", "-", "x", "/"};
			for(int i=0; i<op.length; i++) {
				JButton obt = new JButton(op[i]);
				obt.setBackground(Color.CYAN);
				add(obt);
			}
		}
	}
	
	class SouthPanel extends JPanel {
		public SouthPanel() {
			setBackground(Color.YELLOW);
			add(new JLabel("계산결과"));
			add(new JTextField(16));
		}
	}

	public static void main(String[] args) {
		new Quiz13();
	}
}
