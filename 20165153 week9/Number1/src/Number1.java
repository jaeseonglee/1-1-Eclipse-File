// �й� : 20165153 �̸� :���缺  �ǽ� 1. ������Ʈ ArrayEx.java

import java.util.Scanner;

public class Number1 {
	public static void main(String[] args) { // ���α׷� ����
		int sum=0, oddSum = 0, i , number,count=0; // ���� ����
		
// 1) ������ ���� ������ 1���� �迭�� �����ϰ� �ʱ�ȭ�Ͻÿ�.
		int [] arr = {1,3,2,9,5,6,7,8,4,10}; // 1���� �迭 ���� �� �ʱ�ȭ
		
// 2) �ٸ� 1���� �迭 ������ �����ϰ� �ݺ������� ���� �迭�� �����Ͻÿ�.
		int [] another = new int [10]; // �ٸ� 1���� �迭 ����
		
		for (i=0; i<another.length; i++) {
			another [i] = arr [i]; 
		} // for���� ���� ���� �迭 ����
		
// 3) �迭�� ���� ���Ͻÿ�.
		for (i=0; i<another.length; i++) {
			sum += another[i];
		} // for���� ���� �迭���� �� ���ϱ�
		System.out.println("�迭�� �� : "+sum); // �迭���� �� ���
		
// 4) ����ڰ� �Է��� ���� ��ġ�� �迭 ���� �ε��� ��ġ�� ����Ͻÿ�.		
		Scanner input = new Scanner(System.in);
		System.out.print("ã���� �ϴ� ���� �Է��ϼ��� : "); // ����ڷκ��� ���� �Է¹ޱ�
		number = input.nextInt(); 
		
		for (i=0; i<another.length; i++) {
			if (number == another[i]) {
				System.out.println("�� " + number + "�� �ε����� [" + i + "]�Դϴ�. ");
			} // if���� ���� �Է¹��� ���� �ִ� �ε��� ���
		}
// 5) for���� if���� �̿��� Ȧ���� ������ ���� �� �հ踦 ���Ͻÿ�.
		for (i=0; i<another.length; i++) {
			if (another[i] % 2 != 0) {
				oddSum += another[i];
				count++;
			} // if���� ���ؼ� Ȧ���� �ִٸ� Ȧ���� ���� �� Ȧ���� �� ���
		}
		System.out.println("Ȧ���� ���� : "+ count+ "��"); // Ȧ���� ���� ���
		System.out.println("Ȧ���� �� : " + oddSum); // Ȧ���� �� ���
		
	} // ���α׷� ����

}
