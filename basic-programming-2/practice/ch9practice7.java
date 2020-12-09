
import java.awt.*;
import javax.swing.*;

public class ch9practice7 extends JFrame{
	public practice7() {
		super("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		//c.setLayout(new BorderLayout()); 디폴트
		
		c.add(new CalcNorthPanel(), BorderLayout.NORTH);
		c.add(new CalcCenterPanel(), BorderLayout.CENTER);
		c.add(new CalcSouthPanel(), BorderLayout.SOUTH);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new practice7();
	}
}
	
class CalcNorthPanel extends JPanel {
	public CalcNorthPanel() {
		//JPanel이 디폴트로 FlowLayout
		setBackground(Color.GRAY);
		add(new JLabel("수식입력"));
		add(new JTextField(20));
	}
} 
	
class CalcCenterPanel extends JPanel {
	public CalcCenterPanel() {
		setLayout(new GridLayout(4, 4, 2, 2));
		setBackground(Color.WHITE);
		
		for(int i=0; i<10; i++) {
			JButton b = new JButton(Integer.toString(i));
			add(b);
		}
		add(new JButton("CE"));
		add(new JButton("계산"));
			
		String [] op = {"+", "-", "x", "/"};
			
		for(int i=0; i<4; i++) {
			JButton b = new JButton(op[i]);
			b.setBackground(Color.CYAN);
			add(b);
		}
	}
} 
	
class CalcSouthPanel extends JPanel {
	public CalcSouthPanel() {
	    setLayout(new FlowLayout(FlowLayout.LEFT));
		setBackground(Color.YELLOW);
		add(new JLabel("계산 결과"));
		add(new JTextField(20));
	}
} 
	

