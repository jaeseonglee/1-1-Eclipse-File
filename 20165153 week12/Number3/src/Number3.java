/* �ǽ� 3. ������ ������ ������ 2���� �迭�� �����ϰ� ����ڷκ��� �Էµ� ���� �迭��
 * ��� ÷�ڿ� �ִ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 */
import java.util.Scanner;
public class Number3 {
	public static void main(String [] args) { // ���α׷� ����
		int number; // ���� ����
		int [][] num = {
				{1,5,7,8,4,10,15,78,45,33},
				{99,2,6,9,3,66,55,12,11,13}
		}; // 2Ÿ�� �迭 ����
		
		Scanner input = new Scanner(System.in);
		System.out.print("�迭 : num[][] = { ");
		for(int i=0; i<num.length; i++) {
			System.out.print("{");
			for (int n =0; n<num[i].length; n++) {
				System.out.print(num[i][n]+" ");
			}
			System.out.print("} ");
		}
		System.out.println("}"); // 2���� �迭 ��ü�� ���
		System.out.print("ã�����ϴ� ���� �Է����ּ��� : ");
		number = input.nextInt(); // ���κ��� ã�����ϴ� �� �Է¹ޱ�
		
		for (int i=0; i<num.length; i++) {
			for (int n =0; n<num[i].length; n++) {
				if (number == num[i][n]) {
					System.out.println("ã�� ���� �迭 [" + i + "][" + n +"] �� ��ġ�մϴ�.");
					break; // �Է¹��� ���� ã�Ҵٸ� ���
				} 
			}
		} // ��ø �ݺ����� ���� �Է¹��� �� ���
	} // ���α׷� ���� 

}
