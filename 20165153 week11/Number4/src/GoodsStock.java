// �ǽ� 4. ��ǰ��� �����ϴ� GoodsStock Ŭ������ �ۼ��Ͻÿ�. 
import java.io.*;
public class GoodsStock {
	private String goodsName; // ��ǰ�� ���� �Է� , ��������
	private int stockNumber; //������ ���� �Է� , ��������
	
	public String getGoodsName() { // ��ǰ�� ���� �޼���
		return goodsName;
	}
	public int getStockNumber() { // ������ ���� �޼���
		return stockNumber;
	}
	public void setGoodsName(String a) { // ��ǰ�� ���� �޼���
		goodsName = a;
	}
	public void setStocNumber(int a) { // ������ ���� �޼���
		stockNumber = a;
	}
	public String toString() { // ������ ����ϴ� toString �޼���
		return "��ǰ��: " + goodsName + " ������: " +stockNumber; 
	}
	public int releaseStock(int rel) { // ���������� �������� ����ϱ� ���� releaseStock �޼���
		if (rel > stockNumber) {
			System.out.println("����� ������� �����ϴ�. "); // ����� ������� ���� ��츸 ����ϵ��� ����
		} else {
			stockNumber -= rel;
		}
		return stockNumber;
	}
	
}
