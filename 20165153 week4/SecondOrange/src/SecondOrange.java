/*2. ����ڷκ��� Ű�� �����Ը� �Է¹޾� ǥ��ü�߰� �񸸵��� ����Ͽ� ����ϴ�
 * ���α׷��� �ۼ��Ͻÿ�.
 */

import java.util.Scanner;

public class SecondOrange { 

	public static void main(String[] args) { //���α׷� ����
		// TODO Auto-generated method stub
        double height; // ���� �Է�
        double weight;
        double x;
        double y;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Ű�� �Է��ϼ��� : ");
        height = input.nextInt(); 
        System.out.print("�������� �Է��ϼ��� : ");
        weight = input.nextInt();  // ����ڷκ��� Ű�� ������ �Է¹ޱ�
        
        x = ( height - 100 ) * 0.9; 
        y = ( weight - x ) / x * 100;
        
        System.out.println("ǥ��ü���� " + x + "�̰� �񸸵��� " + y + "�Դϴ�.");
		// ǥ��ü�߰� �񸸵� ���
	} //���α׷� ����

} 