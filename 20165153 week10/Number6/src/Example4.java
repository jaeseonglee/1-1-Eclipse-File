
public class Example4 {
	public static void main(String [] args) {
		Coord4 crd = new Coord4(); // ��ü ����
		
		crd.setPos_x(10);
		crd.setPos_y(20);
		
		System.out.println( crd.toString() ); // ��ü ������ ���
		
		crd.moveTo(20, 30); // ��ǥ �̵�?
		
		System.out.println( crd ); // ��ü ������ ���
	}

}
