/* �ǽ� 4. ����ڷκ��� ������ �Է¹޾� �Է¹��� �迭�� ���������� �����ϰ� ���� 
 * �������� �Էµ� ���� ���� ���� ������ ������ Stack Ŭ������ �ۼ��Ͻÿ�.
 */
import java.io.*;
public class Stack {
	private int arr [] = new int [10]; // �迭 ���� , ���� ����
	private int tos = 0; // ���� ���� , ���� ����
	
	public void push(int value) { // �迭�� ���� �����ϰ� tos�� ���� ������Ű�� �޼���
		if (tos >= arr.length) { // ��,  tos�� �迭�� ������ �Ѿ��� ��� ������Ű�� �ʴ´�.
			System.out.println("�迭�� ������ �Ѿ����ϴ�.");
			return;
		}
		arr[tos] = value;
		tos++;
	}
	public int pop() { // �迭���� ���� ������ �޼��� , ���� ������ ���� �����Ѵ�.
		if (tos == 0) { // ��, tos�� ���� 0�� ��� ������ ����Ѵ�.
			System.out.println("����! : tos�� ���� 0�Դϴ�.");
			return tos;
		}
		tos--;
		return arr[tos];
	}
	public int getTos() { // tos�� ���� ������ �޼���
		return tos;
	}
	public void printArray() { // �迭 ��ü�� ����ϴ� �޼���
		System.out.print("�迭 : ");
		for (int i =0; i<tos; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
	

}
