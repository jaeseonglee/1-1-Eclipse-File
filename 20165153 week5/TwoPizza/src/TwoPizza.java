/* �ǽ� 2 . ����ڷκ��� �Է¹��� ������ Ȧ������ ¦�������� �Ǵ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ¦���� 2�� ���� �������� 0�� �� 
 */

import java.util.Scanner;

public class TwoPizza {
	
	public static void main(String[] args) { // ���α׷� ����
		int value; //���� �Է�
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		value = input.nextInt(); // Ű����κ��� ���� �Է¹ޱ�
		
		if (value % 2 == 0) {
			System.out.print(value + "��(��) ¦���Դϴ�.");
		}  else {
			System.out.print(value + "��(��) Ȧ���Դϴ�.");
		} // if���� ���� ��� ���

	} // ���α׷� ����
}
