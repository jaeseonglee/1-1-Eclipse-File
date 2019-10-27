
public class PixelTest {
	public static void main (String [] args) {
		Point p1 = new Point();   //  ��ü ���� - Point 
		Point p2 = new Point(100,100);  //  ��ü ���� - Point 
		Pixel pixel1 = new Pixel(); // ��ü ���� - Pixel
		Pixel pixel2 = new Pixel(p2,100,100,100);  // ��ü ���� - Pixel
		Pixel pixel3 = new Pixel(p2,150,150,150);  // ��ü ���� - Pixel
		
		System.out.println(p1.toString());  // �� ��ü�� ���� ���� ��� 
		System.out.println(p2.toString());
		System.out.println(pixel1.toString());
		System.out.println(pixel2.toString());
		System.out.println(pixel3.toString());
		
		p1.moveBy(200, 200);  // x��ǥ�� y��ǥ �̵�
		p2.moveBy(-150, 50); // x��ǥ�� y��ǥ �̵�
		System.out.println();
		System.out.println("p1.x�� ��ǥ " + p1.getX()); // ���� x��ǥ ���
		System.out.println("p2.y�� ��ǥ " +p2.getY());  // ���� y��ǥ ���
		System.out.println(p1.toString());  // �ٲ� ���� ��� 
		System.out.println(p2.toString());
		System.out.println(p1.equals(p1));  // ��ü���� ������ Ȯ��
		System.out.println(p1.equals(p2));
		System.out.println("Point ��ü�� ������ Ƚ�� : " + p2.getCount());  // Point count Ȯ��
		
		pixel1.setRGB(123, 231, 132); // pixel1 �� r,g,b�� ����
		System.out.println(pixel1.toString()); // pixel1 ���� ���
		System.out.println("Pixel ��ü�� ������ Ƚ�� : " +pixel3.getCount());  // Pixel count Ȯ��
	} // ���α׷� ���� 

}
