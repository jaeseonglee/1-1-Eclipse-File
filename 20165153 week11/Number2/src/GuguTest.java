import java.util.Scanner;
public class GuguTest {
	public static void main(String [] args) {
		Gugu dan2 = new Gugu(); // dan2 ��ü ����
		int dan; // �������� ���� �Է¹��� ���� 
		
		Scanner input =new Scanner(System.in);
		
		System.out.print("�������� ���� �Է����ּ��� : ");
		dan = input.nextInt(); // ����ڷκ��� �� �Է¹ޱ�
		
		dan2.setDan(dan); // �޼��带 ���� �Է¹��� dan ����
		dan2.printGugu(); // �Է¹��� �� ���
		System.out.println();
		dan2.setDan(8); // �޼��带 ���� 8������  ����
		dan2.printGugu(); // 8������ ������ �� ���
	}

}
