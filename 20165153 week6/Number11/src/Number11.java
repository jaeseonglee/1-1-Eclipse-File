// �ǽ� 11. ����ڷκ��� n���� �Է¹ް� n! �� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

import java.util.Scanner;

public class Number11 {
	public static void main(String[] args) { // ���α׷� ����
		int num; // �Է¹��� n
		long result=1; // ��� �Է�
		
		Scanner input = new Scanner(System.in);
		System.out.print("���丮�� n ���� �Է��Ͻÿ� : ");
		num = input.nextInt(); // ����ڷκ��� n�� �Է¹ޱ�
		
		for (int i=1; i<=num; i++) {
			result= result*i;
		} // for���� ���� n! ���
		System.out.print(num+"! = "+result);
		// ��� ���
	} // ���α׷� ���� 

}
