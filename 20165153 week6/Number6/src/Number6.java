/* �ǽ� 6. ����ڷκ��� ���̿� �ʺ� �Է¹޾� ��÷�� �ݺ����� �̿��ؼ� ������ ���ϵ��� ����Ͻÿ�.
 * 
 * ������ ���� : 4
 * ������ �ʺ� : 5
 * 
 * �簢�� 
 * *****
 * *****
 * *****
 * *****
 * �����ﰢ��
 * *
 * **
 * ***
 * ****
 * �̵�ﰢ��
 *    *
 *   ***
 *  *****
 * *******
 * ���ﰢ��
 * *******
 *  *****
 *   ***
 *    *
 *    
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 
 * 1
 * 13
 * 135
 * 1357
 * 13579
 * 
 * [0][0] [0][1] [0][2] [0][3] [0][4]
 * [1][0] [1][1] [1][2] [1][3] [1][4]
 * [2][0] [2][1] [2][2] [2][3] [2][4]
 * [3][0] [3][1] [3][2] [3][3] [3][4]
 */

import java.util.Scanner;

public class Number6 {
	public static void main(String[] args) { // ���α׷� ����
		int height, width, i, n; // ���� �Է�
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ ���� : ");
		height = input.nextInt(); // ����ڷκ��� ���� �Է¹ޱ�
		System.out.print("������ �ʺ� : ");
		width = input.nextInt(); // ����ڷκ��� �ʺ� �Է¹ޱ�
		System.out.println();
		
		System.out.println("�簢��");
		for ( i=1; i<=height; i++) {
			for ( n=1; n<=width; n++) {
				System.out.print("*");
			}
			System.out.println();
		} // ��ø for���� ���� �簢�� ��� ���
		
		System.out.println("�����ﰢ��");
		for (i=1; i<=height; i++) {
			for (n=1; n<=i; n++) {
				System.out.print("*");
			}
			System.out.println();
		} // ��ø for���� ���� �����ﰢ�� ��� ���
		
		System.out.println("�̵�ﰢ��");
		for (i=1; i<=height; i++) {
			for (n=1; n<width-i; n++) {
				System.out.print(" ");
			} 
			for (n=1; n<=i; n++) {
				System.out.print("*");
			}
			for (n=1; n<i; n++) {
				System.out.print("*");
			}
			System.out.println();
		} // ��ø for���� ���� �̵ �ﰢ�� ��� ���
		
		System.out.println("���ﰢ��");
		for (i=1; i<=height; i++) {
			for (n=1; n<i; n++) {
				System.out.print(" ");
			}
			for (n=1; n<=width-i; n++) {
				System.out.print("*");
			}
			for (n=1; n<width-i; n++) {
				System.out.print("*");
			}
			System.out.println();
		} // ��ø for���� ���� ���ﰢ�� ��� ���
		System.out.println();
		
		for (i=1; i<=height+1; i++) {
			for(n=1; n<=i; n++) {
				System.out.print(n);
			}
			System.out.println();
		} // ��ø for���� ���� ���ڷ� �̷���� �����ﰢ�� ��� ���
		System.out.println();
		
		for (i=1; i<= height+1; i++) {
			for (n=1; n<=2*i; n++) {
				System.out.print(n);
				n++;
			}
			System.out.println();
		} // ��ø for���� ���� Ȧ���� �̷���� �����ﰢ�� ��� ���
		System.out.println();
		
		for (i=1; i<=height; i++) {
			for (n=1; n<=width; n++) {
				System.out.print("["+ (i-1) +"]" +"["+(n-1)+"] ");
			} 
			System.out.println();
		} // ��ø for���� ���� ���ȣ�� ���ڷ� �̷���� ��� ���
		
	}// ���α׷� ���� 

}
