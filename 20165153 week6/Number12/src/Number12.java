/* �ǽ� 12. �Ǻ���ġ������ ����ϱ����� ���α׷��� �ۼ��Ͻÿ�.
 * -�Ǻ���ġ������ ù��° ���� ���� 0�̰� �ι�° ���� ���� 1�϶� ������ �׵��� ������ 
 * �� ���� ���� ������ �̷������ ������ ���Ѵ�.
 */

import java.util.Scanner;

public class Number12 {
	public static void main(String[] args) { // ���α׷� ����
		int num, sum=0,result; // ���� �Է�
		int one=0, two=1; 
		
		Scanner input = new Scanner(System.in);
		System.out.print("�Ǻ���ġ ������ ������ ���� �Է��Ͻÿ�. : ");
		num =input.nextInt(); // Ű����κ��� ������ �� �Է¹ޱ�
		
		System.out.print("�Ǻ���ġ���� : " + one+", "+two);
		
		for (int i =3; i<=num; i++) {
			result = one+two;
			System.out.print(", "+result);
			one=two;
			two=result;
			sum =result +sum;
		} //for���� ���� ���� ��� �� ������ �� ���
		System.out.println();
		System.out.print("���� �հ� : "+sum); //������ �� ���
	} // ���α׷� ���� 

}
