// �ǽ� 9. ������ ���� �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

public class Number9 {
	public static void main(String[] args) { // ���α׷� ����
		
		for (int i=1; i<=9; i++) {
			for (int n=2;n<=9;n++) {
				if (n*i<10) {
					System.out.print(n+"*"+i+ "=" + n*i+"  ");
				} else {
					System.out.print(n+"*"+i+ "=" + n*i+" ");
				} // if���� ���� ���, ���µ� ���ϱ����� ���ڸ����� ��� ��ĭ,���ڸ����ΰ�� ��ĭ�� ���⸦ ���� ���
			} //��ø for���� ���� ��� 
			System.out.println(); 
		} //���α׷� ���� 
	}

}
