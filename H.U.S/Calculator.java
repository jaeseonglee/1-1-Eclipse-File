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
	
	private double result=0; 				// 연산의 계산 결과를 가지는 변수
	private String operator = "=";  		// 입력된 연산을 기억하는 변수
	private boolean startOfNumber = true;  	// 숫자를 입력되기를 기다리는 상태이면 true
											// 숫자가 입력되는 중이면 false
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
		String command = e.getActionCommand(); //버튼에 씌어진 텍스트르 반환
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
			if (startOfNumber) {  // 숫자 입력이 시작되는 경우를 처리
				if (command.equals("-")) {
					display.setText(command);
					startOfNumber = false;
				} else 
					operator = command;
			}else {
				double x =Double.parseDouble(display.getText());  // 텍스트 필드의 내용을 실수로 변경
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
			result += n; // 덧셈   
		else if (operator.equals("-"))
			result -= n; // 뺄셈
		else if (operator.equals("x"))
			result *=n;  // 곱셈
		else if (operator.equals("/"))
			result /= n;  // 나눗셈
		else if (operator.equals("="))
			result = n;  // 결과
		else if (operator.equals("%"))
			result %= n;  // x를 y로 나눈 나머지
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
