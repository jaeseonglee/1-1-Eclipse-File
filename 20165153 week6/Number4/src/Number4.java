/* �ǽ� 4. 1���� 50���� ���ڸ� for������ ����ϵ� if ���� �̿� 3�� ��� �Ǵ� 5�� ����� *�� ����Ͻÿ�. 
 * 
 * ��� : 1 2 * 4 * * 7 8 * * 11 *.............49 *
 */
public class Number4 {
	public static void main(String[] args) { // ���α׷� ����
		int i; // ���� �Է�
		
		System.out.print("��� : ");
		
		for (i=1; i<=50; i++) {
			if ( i % 3 == 0 || i % 5 == 0 ) {
				System.out.print("* ");
			} else {
				System.out.print(i +" ");
			} // if���� ���� i ���
		} // for���� ���� �ݺ� 
	}// ���α׷� ����

}
