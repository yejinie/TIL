import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyListenerEx extends JFrame {
	private JLabel [] keyMessage;
	
	public KeyListenerEx() {
		setTitle("keyListener 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());
		
		keyMessage = new JLabel [3];
		keyMessage[0] = new JLabel(" getKeyCode() "); //정수형 키코드 (모든 키에 해당)
		keyMessage[1] = new JLabel(" getKeyChar() "); //유니코드 값 (문자코드), 유니코드가 아닌 경우 KeyEvent.CHAR_UNDEFINED 리턴
		keyMessage[2] = new JLabel(" getKeyText() "); //키 이름 문자열
		
		for(int i=0; i<keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true);
			keyMessage[i].setBackground(Color.YELLOW);
		}
		
		setSize(300, 150);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}

	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			keyMessage[0].setText(Integer.toString(keyCode));
			keyMessage[1].setText(Character.toString(keyChar));
			keyMessage[2].setText(KeyEvent.getKeyText(keyCode));
			
			System.out.println("KeyPressed");
		}
		public void keyReleased(KeyEvent e) {
			System.out.println("keyReleased");
		}
		public void keyTyped(KeyEvent e) { //유니코드의 경우에만 적용
			System.out.println("keyTyped");
		}
	}
	public static void main(String[] args) {
		new KeyListenerEx();
	}
}
