/* 3.Ű����κ��� �� ���� �Է� �޾� ���迬���� ������ ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */

import java.util.Scanner;

public class ThirdBlue {

	public static void main(String[] args) { // ���α׷� ����
		// TODO Auto-generated method stub
        int first; //���� �Է�
        int second;
        
        Scanner input = new Scanner(System.in);
        
		System.out.print("ù ��° �� �Է� : ");
		first = input.nextInt();
		System.out.print("�� ��° �� �Է� : ");
		second = input.nextInt(); // Ű����κ��� �� ���� �Է¹ޱ�
		
		System.out.println(first + " < " + second + " �� " + ( first < second )  + " ");
		System.out.println(first + " > " + second + " �� " + (first > second) + " ");
        System.out.println(first + " <= " + second + " �� " + (first <= second) + " ");
        System.out.println(first + " >= " + second + " �� " + (first >= second) + " ");
        System.out.println(first + " == " + second + " �� " + (first == second) + " ");
        System.out.println(first + " != " + second + " �� " + (first != second) + " ");
        System.out.println( "!(" + (first + " != " + second) + ")" + " �� " + !(first != second) + " ");
        // ��� ���
		
	}// ���α׷� ����

}
