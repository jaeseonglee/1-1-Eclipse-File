/*  �ǽ� 4. ����ڷκ��� Ű�� �����Ը� �Է¹޾� ǥ��ü���� ����� �� �񸸵��� ����ϰ� �� ������ ����
 * �񸸿��θ� ����ϴ� �Ǵ��ϴ� ���α׷��� �ۼ��Ͻþ�. (���� if����� if,else if,else)
 */

import java.util.Scanner;

public class FourHear {
	
	public static void main(String[] args) { // ���α׷� ����
		int height; // ���� �Է�
		int weight;
		double standardWeight;
		double fat;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Ű�� �Է��ϼ��� : ");
		height = input.nextInt();
		System.out.print("�����Ը� �Է��ϼ��� : ");
		weight = input.nextInt();  // Ű����κ��� Ű�� ������ �Է¹ޱ�
		
		standardWeight = ( height - 100 ) * 0.9;
		fat = ( weight - standardWeight ) / standardWeight * 100;
		// ǥ�� ü�߰� �񸸵��� ����
		
		if (fat < 20) {
			System.out.print("�񸸵��� �����Դϴ�.");
		} else if (fat < 30) {
			System.out.print("�񸸵��� �浵���Դϴ�.");
		} else if (fat < 50) {
			System.out.print("�񸸵��� �ߵ ���Դϴ�.");
		} else {
			System.out.print("�񸸵��� �����Դϴ�.");
		}  // if���� ���� ��� ���
		
	} // ���α׷� ����
}
