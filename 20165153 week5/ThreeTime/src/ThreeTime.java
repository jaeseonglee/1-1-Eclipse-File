/* �ǽ� 3. ������ ���� ���ǵǴ� �Լ��� �Լ����� ����Ͽ� ����. ����ڷκ��� x ���� �Է¹޾Ƽ� �Լ�����
 * ����Ͽ� ȭ�鿡 ����Ѵ�. �̶� x�� �Ǽ��̴�. (if else�� ���) 
 */

import java.util.Scanner;

public class ThreeTime {
	
	public static void main(String[] args) { // ���α׷� ����
        double x; // ���� �Է�
         
        Scanner input = new Scanner(System.in);
        System.out.print("��갪 x�� �Է��Ͻÿ�: ");
        x = input.nextInt(); // Ű����κ��� x �Է� �ޱ�
         
        if (x <= 0) 
        	System.out.print("�Լ� f(x)�� ����� " + (x * x * x - 9.0 * x + 2.0));
           else 
            System.out.print("�Լ� f(x)�� ����� " + (7.0 * x + 2.0) );
        	// if���� ���� ��� ���
        
	} // ���α׷� ����
}
