/* �ǽ� 5. ����ڷκ��� 2�� �������� ��� a , b , c�� �Ǽ��� �Է¹޾� 2�� �������� ����
 * ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * (�� ����� ����� ��쿡�� i �� ���� �ƴ� ���ڷ� �����ؼ� ����Ѵ�.) 
 */

import java.util.*;

public class FiveWater {
	
	public static void main (String arg[]) { // ���α׷� ����
		double a , b , c;
		double D , result1 , result2; // ���� �Է�
		
		Scanner input = new Scanner(System.in);
		System.out.print("ax^2 + bx +c = 0 ������ x^2�� ��� a�� �Է����ּ���. : ");
		a = input.nextInt();
		System.out.print("x�� ��� b�� �Է����ּ���. : ");
		b = input.nextInt();
		System.out.print("��� c�� �Է����ּ���. : ");
		c = input.nextInt(); // Ű����κ��� 2�� �������� ����� �Է¹ޱ�
		
		D = b * b - 4 * a * c; // �Ǻ��� D ����
		
		if (D > 0) {
			result1 = (-b + Math.sqrt( (b * b) - (4.0 * a * c) ) ) / (2.0 * a); 
			result2 = (-b - Math.sqrt( (b * b) - (4.0 * a * c) ) ) / (2.0 * a);
			System.out.print("�Է��Ͻ� 2�� �������� ����� ���� ���� �ٸ� �� �Ǳ��� " + result1 + 
					" �� " + result2 + "�Դϴ�.");
		} else if (D == 0) {
			result1 = result2 = -b /(2.0 * a);  // (-b + 0) / (2.0 *a) = (-b - 0 ) / (2.0 * a)
			System.out.print("�Է��Ͻ� 2�� �������� ����� ���� ���� " + result1 + "(�߱�) �Դϴ�." );
		} else {
			result1 = (-b + Math.sqrt ( (4.0 * a * c) - (b * b) ) ) / (2.0 * a); 
			result2 = (-b - Math.sqrt ( (4.0 * a * c) - (b * b) ) ) / (2.0 * a);
			System.out.print("�Է��Ͻ� 2�� �������� ����� ���� ���� �ٸ� �� ����� " + result1 + 
					"i �� " + result2 + "i �Դϴ�. (�Ǳ��� �����ϴ�.)");
		} // if���� ���� ��� ���
		
	} // ���α׷� ����
}
