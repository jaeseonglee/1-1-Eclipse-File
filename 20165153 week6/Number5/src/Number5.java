/* �ǽ� 5. Ű����κ��� 1���� 9 ������ ������ �Է¹޾� �ش� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * ��� : 
 * ������ ���� �Է��ϼ��� : 3
 * 3 * 1 = 3
 * 3 * 2 = 6
 * 3 * 3 = 9  
 * .....
 * 3 * 9 =27
 */

import java.util.Scanner;

public class Number5 {
	public static void main(String[] args) { // ���α׷� ����
		int num; // ���� �Է�
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ ���� �Է��ϼ��� : ");
		num = input.nextInt();  //Ű����κ��� �������� �� �Է¹ޱ�
		
		for(int i=1; i<=9; i++) {
			System.out.println(num +" * "+ i +" = " + num * i);
		} // for���� ���� ��� ���
		
	} // ���α׷� ����

}
