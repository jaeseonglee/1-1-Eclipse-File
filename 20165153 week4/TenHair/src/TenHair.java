/* 10. � �л��� �̹� �б⿡ ��ǻ�� ����, c��� ���α׷���, ����, �Ϲ� ������ ������û�Ͽ���.
 * �� ������ ������ �Է��ϸ� �� �л��� �̹� �б� ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

import java.util.Scanner;

public class TenHair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int computer;
		int C;
		int english;
		int math;
		double result;
		
		Scanner input = new Scanner(System.in);
		System.out.print("��ǻ�� ���� ������ ������ �Է��Ͻÿ�. : ");
		computer = input.nextInt();
		System.out.print("C��� ���α׷��� ������ ������ �Է��Ͻÿ�. : ");
		C = input.nextInt();
		System.out.print("���� ������ ������ �Է��Ͻÿ�. : ");
		english = input.nextInt();
		System.out.print("�Ϲ� ���� ������ ������ �Է��Ͻÿ�. : ");
		math = input.nextInt();
		
		result = ( computer + C + english + math ) / 4.0;
		
		System.out.print("��� ������ " + result + " �� �Դϴ�.");
		
	}

}
