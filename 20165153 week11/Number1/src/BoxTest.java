
public class BoxTest {
	public static void main(String [] args ) {
		Box box1 = new Box(); // ��ü ����
		Box box2 = new Box(); // ��ü ����
		
		box1.setWidth(10); // box1�� ����,����,���̸� ���� 10,10,10���� ����
		box1.setLength(10);
		box1.setHeight(10);
		
		box2.setWidth(5); // box2�� ����,����,���̸� ���� 5,5,5�� ����
		box2.setLength(5);
		box2.setHeight(5);
		
		System.out.println(box1.getVolume()); // box1 ���� ���
		System.out.println(box2.getVolume()); // box2 ���� ���
		System.out.println(box1.toString()); // box1�� ���� ���
		System.out.println(box2); // box2�� ���� ���
		
		
	}

}
