/* 8. �ð��� �ʴ����� �Է��Ͽ� �Էµ� �ð��� ��ð� ��� ���ʿ� �ش��ϴ�����
 * ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 */

import java.util.Scanner;

public class EightLine {

	public static void main(String[] args) { //���α׷� ����
		// TODO Auto-generated method stub
        int hour = 0; // ���� �Է�
        int minute = 0;
        int second = 0;
        int value = 0;
        
        Scanner input = new Scanner(System.in);
		System.out.print("�ʴ��� �ð��� �Է��ϼ���: ");
		value = input.nextInt();
		second = value % 60 ;
		value = value / 60;
		minute = value % 60;
		hour = value / 60;
		
		System.out.print( hour + "�ð� " + minute + "�� " + second + "���Դϴ�.");
		// ��� ���
		
	} // ���α׷� ����

}
