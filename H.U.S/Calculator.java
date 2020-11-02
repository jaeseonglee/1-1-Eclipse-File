import java.util.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator extends JFrame implements ActionListener{
	private JPanel panel;
	private JTextField display;
	private JButton[] buttons;
	private String[] labels = {
			"","","","","C","7","8","9","/","sqrt",
			"4","5","6","x","%","1","2","3","-","","0","+/-",".","+","="};
	
	private double result=0; 				// ������ ��� ����� ������ ����
	private String operator = "=";  		// �Էµ� ������ ����ϴ� ����
	private boolean startOfNumber = true;  	// ���ڸ� �ԷµǱ⸦ ��ٸ��� �����̸� true
											// ���ڰ� �ԷµǴ� ���̸� false
	public Calculator() {
		display = new JTextField(35);
		panel = new JPanel();
		display.setText("0.0");
		//display.setEnabled(false);
		
		panel.setLayout(new GridLayout(0, 5, 3, 3) );
		buttons = new JButton[25];
		int index = 0;
		for(int rows=0; rows< 5; rows++){
			for(int cols=0; cols<5; cols++) {
				buttons[index] = new JButton(labels[index]);
				if(cols>=3) 
					buttons[index].setForeground(Color.red);
				else
					buttons[index].setForeground(Color.black);
				buttons[index].setBackground(Color.white);
				panel.add(buttons[index]);
				buttons[index].addActionListener(this);
				index++;
			}
		}
		add(display, BorderLayout.NORTH);
		add(panel, BorderLayout.CENTER);
		setVisible(true);
		pack();
	}
	
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand(); //��ư�� ������ �ؽ�Ʈ�� ��ȯ
		if (command.charAt(0) == 'C' ) {
			startOfNumber = true;
			result = 0;
			operator = "=";
			display.setText("0.0");
		} 
		else if (command.charAt(0) >= '0' && command.charAt(0) <= '9' || command.equals(".")) {
			if(startOfNumber == true) {
				display.setText(command);
			} else {
				display.setText(display.getText() + command);
			}
			startOfNumber = false;
		} 
		else {
			if (startOfNumber) {  // ���� �Է��� ���۵Ǵ� ��츦 ó��
				if (command.equals("-")) {
					display.setText(command);
					startOfNumber = false;
				} else 
					operator = command;
			}else {
				double x =Double.parseDouble(display.getText());  // �ؽ�Ʈ �ʵ��� ������ �Ǽ��� ����
				calculate(x);
				operator = command;
				if(operator.equals("sqrt") || operator.equals("+/-") ) {
					startOfNumber = false;
				} else {
					startOfNumber = true;
				}
			}
		}	
		
	}
	
	private void calculate (double n) {
		if(operator.equals("+"))
			result += n; // ����   
		else if (operator.equals("-"))
			result -= n; // ����
		else if (operator.equals("x"))
			result *=n;  // ����
		else if (operator.equals("/"))
			result /= n;  // ������
		else if (operator.equals("="))
			result = n;  // ���
		else if (operator.equals("%"))
			result %= n;  // x�� y�� ���� ������
		else if (operator.equals("sqrt")) 
			result = Math.sqrt(n);
		else if (operator.equals("+/-")) {
			result =  (double) n * -1.0;
		}
		display.setText(" " + result);
	}
	
	public static void main(String[] args) {
		Calculator s = new Calculator();
	}
}
