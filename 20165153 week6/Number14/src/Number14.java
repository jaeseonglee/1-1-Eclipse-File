/* �ǽ� 14. ����ڷκ��� �� ���� �Է¹޾� �ִ� ������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * ���α׷� ����: (2���� 5�ܰ� ������ �������� y�� �Ѵ�.)
 * 1. �� �� ��� ū���� x �������� y�� �Ѵ�.
 * 2. y�� 0�� ������ �ݺ��Ͽ� ��� ������� x�̴�.
 * 3. r = x % y //x�� y�� ���� �������� ���ο� y�� �ǰ�
 * 4. x = y;  // �⺻�� y���� ���ο� x�� �ȴ�.
 * 5. y = r;
 * 6. 2�ܰ�� ���ư���. 
 */

import java.util.Scanner;

public class Number14 {
	public static void main(String[] args) { // ���α׷� ����
		int num1,num2, x, y, r; // ���� �Է�
		
		Scanner input = new Scanner(System.in);
		System.out.print("ù��° ���� �Է����ּ���. : ");
		num1 = input.nextInt(); 
		System.out.print("�ι�° ���� �Է����ּ���. (��, ù��° ���� �ٸ� ��) : ");
		num2 = input.nextInt(); // ����ڷκ��� �� �� �Է¹ޱ�
		
		if (num1>num2) {
			x = num1;
			y = num2;
		} else {
			x = num2;
			y = num1;
		} // if���� ���� ū ���� ���� �� ����
		for (    ; y!=0; ) {
			r = x % y;
			x = y;
			y = r ; 
		} // for�� �� ���� �� ���� �ִ������� ��� 
		System.out.print("�� ���� �ִ� ������� "+x);
		// �� ���� �ִ� ����� ���
	} // ���α׷� ���� 

}
