import java.util.Scanner;
public class ObesityTest {
	public static void main (String [] args) { //���α׷� ����
		double bmi; // ���� ����
		Obesity ob =new Obesity(); //��ü ����
		ob.setHeight(0); // ��ü������ Scanner�� Ű �Է¹��� ���� �Ҵ�?
		ob.setWeight(0); // ��ü������ Scanner�� ������ �Է¹��� ���� �Ҵ�?
		ob.calcStandardWeight();
		bmi = ob.calcBmi(); // ���ڿ��� �񸸵��� ���Ϲ��� �� ����?
		System.out.println("�񸸵��� " + bmi+" �� " +ob.printBmi() + "�Դϴ�."); //�񸸵� �� �񸸵��� ���� ������ ���
	} // ���α׷� ����

}
