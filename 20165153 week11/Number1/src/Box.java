/* �й� : 20165153 �̸� : ���缺  �ǽ� 11���� 
 * �ǽ� 1. ���� ���õ� Ŭ������ �ۼ��Ͻÿ�.(Box)
 */
import java.io.*;
public class Box {
	
	private int width; // ������ǥ���� , ��������
	private int length; // ������ǥ���� , ���� ����
	private int height; // ������ǥ���� , ���� ����
		
	public int getWidth() { // ������ǥ ���� �޼���
		return width;
	}
	public int getLength() { // ������ǥ ���� �޼���
		return length;
	}
	public int getHeight() { // ������ǥ ���� �޼���
		return height;
	}
	public void setWidth(int a) { // ������ǥ ���� �޼���
		width = a;
	}
	public void setLength(int a) { // ������ǥ ���� �޼���
		length = a;
	}
	public void setHeight(int a) { // ������ǥ ���� �޼���
		height = a;
	}
	public int getVolume() { // ������ ���Ǹ� ����ϴ� �޼��� 
		return width * length * height; 
	}
	public String toString() { //���ڿ��� ��ȯ�ϴ� �޼���
		return "����: "+width +" ����: "+length+ " ����: "+height+" �� ������ ���Ǵ� " + width * length * height +" �Դϴ�.";
	}

}
