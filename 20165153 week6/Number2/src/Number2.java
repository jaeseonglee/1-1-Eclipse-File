/* �ǽ� 2. �ǽ� 1�� ���α׷��� while���� �̿��ؼ� ����Ͻÿ�.
 * 
 * ũ���Է� : 10
 * [0] [1] [2] [3] [4] [5] [6] [7] [8] [9]
 */

import java.util.Scanner;

public class Number2 {
	public static void main(String[] args) { //���α׷� ����
		int num; // ���� �Է�
		int i =0; 
		
		Scanner input = new Scanner(System.in);
		System.out.print("ũ���Է� : ");
		num = input.nextInt(); //Ű����κ��� �����Է¹ޱ�
		
		while (i<num) {
			System.out.print("[" + i + "] ");
			i++;
		} // while���� ���� ��� ���
	} // ���α׷� ����

}
