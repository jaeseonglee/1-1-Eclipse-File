/* �й� : 20165153 �̸�: ���缺  �ǽ� 12����
 * �ǽ� 1. �ټ� ���� ���ڿ��� �����ϴ� ������ �迭�� ������ �� ���ڿ� �����͸� 
 * �Է¹޾� ������ �� ������ ����Ͻÿ�.
 */
import java.util.Scanner;
public class Number1 { // ���α׷� ����
	public static void main(String [] args) {
        String [] arr = new String[5]; // �迭 ���� 
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i <arr.length; i++) {
			System.out.println(i+"��° �迭�� �Է����ּ��� : ");
			arr[i] = input.next(); // �迭�� ���ڿ� �����͸� �Է¹ޱ�
		}
		
		System.out.print("�Է� ���� �迭�� : ");
		for (String value : arr) {
			System.out.print(value+" "); // �迭 ���
		}
		
	} // ���α׷� ���� 
	

}
