/* �й� : 20165153 �̸� : ���缺 
 * �ǽ� 1. ����ڷκ��� �� ���� �Է¹޾� �� ���� ũ�⸦ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 */

import java.util.Scanner;

public class OneWalk {
	
	public static void main(String[] args) { // ���α׷� ����
		int num1; // ���� �Է�
		int num2;
		
		Scanner input = new Scanner(System.in);
		System.out.print("ù ��° ������ �Է��Ͻÿ�. : ");
		num1 = input.nextInt();
		System.out.print("�� ��° ������ �Է��Ͻÿ�. : ");
		num2 = input.nextInt();  //Ű����κ��� �� ���� �Է¹ޱ�
		
		if (num1 > num2) {
			  System.out.print("��� : �� ��° ���� " + num2 + " ��(��) ù ��° ���� " + num1 + " ���� �۴�.");
		}  else if (num1 < num2) {
			  System.out.print("��� : ù ��° ���� " + num1 + " ��(��) �� ��° ���� " + num2 + " ���� �۴�.");
		}  else {
			System.out.print("��� : �� ������ ���� ����.");
		}// if���� ���� ��� ���
		
	} // ���α׷� ����
}
