import java.util.Scanner;
public class StockTest {
	public static void main(String [] args) { // ���α׷� ����
		String goods; // ���� �Է�
		int number;
		Scanner input = new Scanner(System.in);
		
		GoodsStock goods1 = new GoodsStock(); // goods1 ��ü ����
		GoodsStock goods2 = new GoodsStock(); // goods2 ��ü ����
		
		goods1.setGoodsName("��ǰA");
		goods1.setStocNumber(10);  // goods1 ��ü�� ����
		
		goods2.setGoodsName("��ǰB");
		goods2.setStocNumber(20); // goods2 ��ü�� ����
		
		System.out.println(goods1.toString()); // goods1,goods2 ��ü ���� ���
		System.out.println(goods2.toString());
		
		if (goods1.getStockNumber() < goods2.getStockNumber() ) {
			System.out.println("��ǰ��� �� ���� ��ǰ�� ���� -> "+goods2.toString());
		} else {
			System.out.println("��� �� ���� ��ǰ�� ���� -> "+goods1.toString());
		} // ��� �� ���� ��ǰ�� ���� ���
		
		System.out.println("� ��ǰ�� ��� ����Ͻðڽ��ϱ� (���� : ��ǰA �Ǵ� ��ǰB): ");
		goods = input.next(); // �� �� �ϳ��� ���㿡 ���� ����� ������ �Է¹ޱ�
		
		switch(goods) {
		case "��ǰA" :
			System.out.print("�󸶸�ŭ ����Ͻðڽ��ϱ� : ");
			number = input.nextInt(); // ����� �� �Է¹ޱ�
			goods1.releaseStock(number); // releaseStock�޼��带 ���� ���
			System.out.println(goods1.toString()); // ��� ���� ��ǰ ���� ���
			break;
			
		case "��ǰB" :
			System.out.print("�󸶸�ŭ ����Ͻðڽ��ϱ� : ");
			number = input.nextInt(); // ����� �� �Է¹ޱ�
			goods2.releaseStock(number); // releaseStock�޼��带 ���� ���
			System.out.println(goods2.toString()); //��� ���� ��ǰ ���� ���
			break;
			
		default :
			System.out.println("�޴����ÿ���"); // ��ǰA �Ǵ� ��ǰB��� �Էµ��� �ʾҴٸ� ���
			break;
		}
		
	} // ���α׷� ���� 

}
