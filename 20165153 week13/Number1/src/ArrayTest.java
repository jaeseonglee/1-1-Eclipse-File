
public class ArrayTest {
	public static void main(String [] args) { // ���α׷� ����
		MyArray my = new MyArray(); // ��ü ����
		MyArray my1 = new MyArray(5); // ��ü ����
		
		if(my.isEmpty())  {
			System.out.println("�������"); 
		}
		System.out.println("index�� length��  ���� ���ΰ� : " + my.isFull());
		
		my.insertArray(10); // �迭�� �� �ֱ�
		my.insertArray(30);
		my.insertArray(50);
		my.insertArray(40);
		my.insertArray(15);
		my.insertArray(25);
		my.insertArray(35);
		my.insertArray(5);
		my.insertArray(63);
		my.insertArray(16);
		my.printArray(); // �迭 ���
		System.out.println();
		
		if(my.isEmpty()) {
			System.out.println("�������");
		} else {
			System.out.println("���� ����, ���� : " +my.getTop());
		} // �迭�� ������ ���� ���
		
		my.sortArray(1); // �迭�� ������������ ����
		my.printArray(); // �迭 ���
		
		System.out.println();
		System.out.println(my.getArray(3)); // �迭�� index[3]�� �ִ� �� ���
		System.out.println(my.getArray(9)); // �迭�� index[9]�� �ִ� �� ���
		System.out.println(my.getArray(10)); // �迭�� index[10]�� �ִ� �� ��� , ������ -1 ���
		System.out.println(my.findArray(15)); // �迭�� 15��� ���� ������ index���
		System.out.println(my.findArray(33)); // �迭�� 33�̶�� ���� ������ index��� ,������ -1 ���
		
		my.sortArray(2); // �迭�� ������������ ����
		my.printArray(); // �迭 ���
		System.out.println();
		my.clearArray(); // �迭�� index�� length�� ��� 0���� �ʱ�ȭ
		my.printArray(); // �迭 ��� 
		
		System.out.println();
		System.out.println();

		my1.insertArray(10); // �迭�� �� �ֱ�
		my1.insertArray(30);
		my1.insertArray(25);
		my1.insertArray(23);
		System.out.println("�迭�� ���� : " + my1.getSize());
		my1.printArray(); // �迭 ���
		System.out.println();
		
		if(my1.isEmpty()) {
			System.out.println("�������");
		} else {
			System.out.println("���� ����, ���� : " +my1.getTop());
		} // �迭�� ������ ���� ���
		
		my1.sortArray(1); // �迭�� ������������ ����
		my1.printArray(); // �迭 ���
		
		System.out.println();
		System.out.println(my1.getArray(1)); // �迭�� index[3]�� �ִ� �� ���
		System.out.println(my1.getArray(5)); // �迭�� index[9]�� �ִ� �� ���
		
		System.out.println(my1.findArray(10)); // �迭�� 15��� ���� ������ index���
		System.out.println(my1.findArray(50)); // �迭�� 33�̶�� ���� ������ index��� ,������ -1 ���
		
		my1.sortArray(2); // �迭�� ������������ ����
		my1.printArray(); // �迭 ���
		System.out.println();
		my1.clearArray(); // �迭�� index�� length�� ��� 0���� �ʱ�ȭ
		my1.printArray(); // �迭 ���
		
	} // ���α׷� ����

}
