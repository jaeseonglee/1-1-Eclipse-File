/* �й� : 20165153 �ۼ��� : ���缺
 * �ǽ� 1. ������ ���� ����� ��Ÿ���� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * ũ���Է� : 10
 * [0] [1] [2] [3] [4] [5] [6] [7] [8] [9]  
 */

import java.util.Scanner;

public class Number1 {
	public static void main(String[] args) { // ���α׷� ����
		int num; //���� �Է�
		
		Scanner input = new Scanner(System.in);
		System.out.print("ũ���Է� : ");
		num = input.nextInt();  // Ű����κ��� ���� �Է¹ޱ�
		
		for (int i=0; i<num;i++) {
			System.out.print("[" + i + "] ");
		} // for���� ���� ��� ���
		
	} // ���α׷� ����

}
