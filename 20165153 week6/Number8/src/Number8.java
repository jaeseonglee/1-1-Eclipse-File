/* �ǽ� 8. ���� �ݺ��� (��ø for��) �� ���ǹ� if�� continue�� �̿��ؼ� ����ڷκ��� �Է¹��� ���ڱ�����
 *  ��� ���� �� �Ҽ�(1�� �ڱ� �ڽ� �����θ� ������ �������� 1���� ū ���� ����)���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * ��� ���� )
 * ��� �ִ밪 �Է� : 16
 * 
 * �Ҽ� : 2 3 5 7 11 13
 */

import java.util.Scanner;

public class Number8 {
	public static void main(String[] args) { // ���α׷� ����
		int num, i ,n; // ���� �Է�
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("�ִ� ��°� �Է� : ");
		num = input.nextInt(); //����ڷκ��� ���� �Է¹ޱ�
		System.out.print("�Ҽ� : ");
		
		for (i = 2; i<num; i++) {
			for (n=2; n<i; n++) {
				if( i%n==0) { // if���� ���� �Ҽ����� �ƴ��� Ȯ��
					i++;
					continue; // ���� i�� n���� ������ �� 0�̶�� i�� �������� ���ο� �ݺ�
				}
		    }
			if (i>num){
				// �ݺ��� ���� if���� ���ؼ� i�� num���� Ŀ���ٸ� �ƹ��͵� ������� �ʴ´�.
			}
			else if (i==n) {
				System.out.print(i+" ");
			} // i�� �Ҽ���� ��� 
		} //for���� ���� �Էµ� ���ڰ� �Ҽ����� �ƴ��� �ݺ�
	} // ���α׷� ���� 

}
