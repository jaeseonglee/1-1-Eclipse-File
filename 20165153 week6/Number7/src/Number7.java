/* �ǽ� 7. ����ڷκ��� 0�� �ƴ� ������ �Էµ� �� ������ �հ� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(do while��  ���)
 * 
 * �����Է� : 5
 * -> ��:5 ���:5
 * �����Է� : 4
 * -> ��:9 ���:4.5
 * �����Է� : 0
 * -> ����
 */

import java.util.Scanner;

public class Number7 {
	public static void main(String[] args) { // ���α׷� ����
		int num, sum = 0; // �Է¹��� ������ ������ �� �Է�
		double average = 0, i = 1.0; // ���� �Է�
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("���� �Է� : ");
			num = input.nextInt(); // ����ڷκ��� ���� �Է¹ޱ�
			
			sum = num +sum;
			average = sum / i; // �հ� ��� 
			
			if (num==0) {
				System.out.print("-> ����");
			} else {
				System.out.println("-> �� : "+ sum +" ��� : " + average );
			} // if���� ���� ��� ���
			i++;
		} while (num != 0);
		 // do while�� ���� �ݺ� ���
	} // ���α׷� ���� 

}
