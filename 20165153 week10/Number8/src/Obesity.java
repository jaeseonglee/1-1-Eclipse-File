/* �ǽ� 8 . ���� ���õ� Ŭ������ �ۼ��Ͻÿ�. 
 * ����ڷκ��� Ű�� �����Ը� �Է¹޾� ǥ�� ü���� ����� �� �񸸵��� ����ϰ� �� ������ ���� �񸸿��θ� ����ϴ� Ŭ������ �ۼ��ϰ�
 * �Ʒ� �ڵ�� �׽�Ʈ�Ͻÿ�. ǥ��ü�߰� �񸸵��� ������ ������ ����.
 * ǥ��ü�� = (Ű -100) *0.9  
 * �񸸵� =(������ -ǥ��ü��) / ǥ��ü�� *100 
 * 
 * �񸸵� : -20 �̸� -> ��ü��
 * �񸸵� : -20~20 -> ����
 * �񸸵� : 20~30 -> �浵��
 * �񸸵� : 30~50 -> ���� ��
 * �񸸵� : 50 �̻� -> ����
 */
import java.io.*;
import java.util.Scanner;
public class Obesity {
	
	private double height; // Ű ��ǥ ���� ,��������
	private double weight; // ������ ��ǥ ���� , ���� ����
	private double bmi; // �񸸵� ��ǥ ���� , ���� ����
	private double standardWeight; // ǥ��ü�� ��ǥ ���� , ���� ����
	
	Scanner input = new Scanner(System.in); // Scanner �� ���� Ű�� ������ �Է¹��� �غ�
	
	public double getHeight() { // Ű ��ǥ ���� �޼���
		return height;
	}
	public double getWeight() { // ������ ��ǥ ���� �޼���
		return weight;
	}
	public double getBmi() { // �񸸵� ��ǥ ���� �޼��� 
		return bmi;
	}
	public double grtStandardWeight() { // ǥ��ü�� ��ǥ ���� �޼���
		return standardWeight;
	}
	public void setHeight(double h) { // Ű ��ǥ ���� �޼���
		System.out.print("����� Ű : "); // Ű����κ��� Ű �Է¹ޱ�
		h = input.nextDouble();
		height = h;
	}
	public void setWeight(double w) { // ������ ��ǥ ���� �޼���
		System.out.print("����� ������ : "); // Ű����κ��� ������ �Է¹ޱ�
		w = input.nextDouble();
		weight = w;
	}
	public void calcStandardWeight() { // ǥ�� ü�� ���
		standardWeight = (height - 100) * 0.9;
	}
	public double calcBmi() { // �񸸵� ��� �� ��� ����
		bmi = (weight - standardWeight) / standardWeight * 100;
		return bmi;
	}
	public String printBmi() { // �������� ���� ���ڿ��� �񸸵� ����
		if ( bmi < -20) {
			return "��ü��";
		} else if ( bmi < 20 ) {
			return "����";
		} else if ( bmi < 30) {
			return "�浵��";
		} else if ( bmi < 50) {
			return "���� ��";
		} else if (50 <= bmi ) {
			return "����";
		} // ���ǹ��� ���� �񸸵� ����
		return "�񸸵�";
	}
	
	

}
