/* 4. Ű����κ��� �� ���� �Է� �޾� �� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.  
 */

import java.util.Scanner;

public class FourApple {

	public static void main(String[] args) { // ���α׷� ����
		// TODO Auto-generated method stub
        int num1; // ���� �Է�
        int num2;
        int max;
		
        Scanner input = new Scanner(System.in);
		
		System.out.print("ù ��° �� �Է� : ");
		num1 = input.nextInt();
		System.out.print("�� ��° �� �Է� : ");
		num2 = input.nextInt(); // Ű����κ���  �� ���� �Է¹ޱ�
		
		max = ( num1 > num2 )? num1 : num2;
		
		System.out.print("ū ���� " + max + " �Դϴ�."); // ��� ���
		
	} //���α׷� ����

}
