// �ǽ� 2. ���� ���õ� Ŭ������ �ۼ��Ͻÿ�. (Gugu)
import java.io.*;
public class Gugu {
	
    private int dan; // ������ ���� dan, ��������
	
	public int getDan() { // dan ���� �޼���
		return dan;
	}
	public void setDan(int a) { // dan ���� �޼���
		dan =a;
	}
	public void printGugu() { // dan�� ����ϴ� �޼���
		for (int i =1; i<10; i++) {
			System.out.println(dan +" * "+i +" = "+dan*i); 
		}	
	}

}
