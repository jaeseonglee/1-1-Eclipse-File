/* �ǽ� 2 . main �޼��忡�� ������ ���� ������ 1���� �迭�� ����� ���ÿ� �ʱ�ȭ�ϰ� ����� ���� printOneDim�޼��带
 * ����� �� �޼��带 �̿��� ����Ͻÿ�.
 */

import java.util.Scanner;

public class Number2 {
// 1) �迭�� �����ϰ� �ʱ�ȭ�Ͻÿ�.
	public static void printOneDim(int[] arr) {
		for(int i=0;i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		} // for���� ���� �迭 ���
		System.out.println();
	}
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9,10}; // �迭 ���� �� �ʱ�ȭ
		int value;
		
		printOneDim(arr); // �޼��� ȣ�� 
		value = find(arr);
		sumArray(arr);
	}
// 2) Ű����κ��� ������ �Է¹޾� �迭���� �˻��ϰ� �迭 ���� ��ġ�� ����Ͻÿ�.
	public static int find(int[] arr) {
		int number; // ���� ����
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է����ּ��� : ");
		number = input.nextInt(); // Ű����κ��� ���� �Է¹ޱ�
		
		for (int i=0; i<arr.length;i++) {
			if (number == arr[i]) {
				System.out.println("�Է��Ͻ� ������ ��ġ�� [" + i +"] �Դϴ�. ");
				return i; // i�� ��ȯ�ϸ鼭 ����
			} // if���� ���� �Է¹��� ������ ��ġ�� ã�´ٸ� ���
		}
		return -1; // for���� ������ -1 ���� ��ȯ�ϸ鼭 ����
	}
// 3) 1���� �迭�� ���� ������ִ� sumArray �޼��带 �ۼ��Ͻÿ�.
	public static void sumArray(int [] arr) {
		int sum=0; // ���� ���� 
		for(int i =0; i< arr.length; i++) {
			sum +=arr[i]; // �迭�� �� ���
		}
		System.out.print("1���� �迭�� ���� "+sum+" �Դϴ�.");
	} // �迭�� �� ���
}
