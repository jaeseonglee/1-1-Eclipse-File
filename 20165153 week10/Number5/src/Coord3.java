// �ǽ� 5. ������ x,y ��ǥ���� ������ ��ü�� ������ ���� ��� ��- ��ü ���� ��� �޼��� toString()
import java.io.*;
public class Coord3 {
	
	private int pos_x; // x��ǥ����, ��������
	private int pos_y; // y��ǥ����, ��������
	
	public int getPos_x() { // x��ǥ ���� �޼���
		return pos_x;
	}
	public int getPos_y() { // y��ǥ ���� �޼���
		return pos_y;
	}
	public void setPos_x(int a) { // x��ǥ ���� �޼���
		pos_x =a;
	}
	public void setPos_y(int a) { // y��ǥ ���� �޼���
		pos_y = a;
	}
	public String toString() {
		return "X:" + pos_x+" Y:"+pos_y;
	}

}