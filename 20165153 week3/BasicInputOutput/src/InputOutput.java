/*
 * �⺻ ����� ���� Ŭ����. Scanner��� Ŭ������ �̿��ؼ� 
 * Ű����� ���� ������ �Է¹޾�  ����ͷ� ����ϴ� ���α׷�
 * �ۼ��� : ���缺
 * ���������� : 3.16
 * �ҽ� ����� �����ϳ� ����� ���� ���� 
 * 
 * 
 */
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		// ���� : �鿩���� ���� ����
		
		// ���� - ���� ������
		int width; // �ʺ� �Է��� ����
		int area; // �ʺ� * �ʺ�
		Scanner in = new Scanner(System.in);
		
		System.out.print("�ʺ� �Է��ϼ���( �� ���� ):");
		
		width = in.nextInt();
		
		// ó��- ���� , ����(���� , �ݺ�) , ���
		area = width * width;
		
		// ��� - ������ ��� , ����� ��� , ���� ....
		
		System.out.println("�ʺ�" + width +"�� �ڽ��� ����"+ area);
      
		
		
	}

}
