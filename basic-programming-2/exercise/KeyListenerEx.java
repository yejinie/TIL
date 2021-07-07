import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyListenerEx extends JFrame {
	private JLabel [] keyMessage;
	
	public KeyListenerEx() {
		setTitle("keyListener ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.addKeyListener(new MyKeyListener());
		
		keyMessage = new JLabel [3];
		keyMessage[0] = new JLabel(" getKeyCode() "); //������ Ű�ڵ� (��� Ű�� �ش�)
		keyMessage[1] = new JLabel(" getKeyChar() "); //�����ڵ� �� (�����ڵ�), �����ڵ尡 �ƴ� ��� KeyEvent.CHAR_UNDEFINED ����
		keyMessage[2] = new JLabel(" getKeyText() "); //Ű �̸� ���ڿ�
		
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
		public void keyTyped(KeyEvent e) { //�����ڵ��� ��쿡�� ����
			System.out.println("keyTyped");
		}
	}
	public static void main(String[] args) {
		new KeyListenerEx();
	}
}