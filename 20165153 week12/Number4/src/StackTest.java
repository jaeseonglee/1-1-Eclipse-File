
public class StackTest {
	public static void main(String [] args) { 
		Stack s = new Stack(); // ��ü ����
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		s.push(60);
		s.push(70);
		s.push(80);
		s.push(90);
		System.out.println("���� ���� ���� ���� : " + s.getTos() );
		s.printArray();
		System.out.println("������ �� ��� : " + s.pop() );
		System.out.println("������ �� ��� : " + s.pop() );
		System.out.println("������ �� ��� : " + s.pop() );
		System.out.println("������ �� ��� : " + s.pop() );
		System.out.println("���� ���� ���� ���� : " + s.getTos() );
		s.printArray();
	}

}
