/* �й� : 20165153 �̸� : ���缺  
 *�ǽ� 1. Ű����κ��� ������ r�� �Է¹޾� ���� ����(V) �� ǥ���� (S)�� ���Ͽ� ����ϴ�
 * ���α׷��� �ۼ��Ͻÿ�.
 */
import java.util.Scanner;

public class FirstRed { 

	public static void main(String[] args) {//���α׷� ����
		// TODO Auto-generated method stub
        final double pi = 3.14;  // ���,���� �Է�
		int r;
		double volume;
		double S;
		
		Scanner input = new Scanner(System.in);
		System.out.print("�������� �Է��ϼ��� : ");  // Ű����� ���� ������ �Է¹ޱ�
		r = input.nextInt();
		
		volume = (4.0/3.0)* pi * r * r * r;
		S = 4 * pi * r * r;
		
		System.out.println("������ r�� ���� ���Ǵ� " + 
		volume + "�̰� ǥ������ " + S + " �Դϴ�."); // ���ǿ� ǥ���� ���
		
	}// ���α׷� ����

} 
