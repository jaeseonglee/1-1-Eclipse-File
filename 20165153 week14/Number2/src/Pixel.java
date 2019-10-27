
public class Pixel {
	private Point point = new Point(); //��ǥ���� �����ϱ����� Point ��ü ���� , ��������
	private int r; // 3���� ������ �����ϱ����� ������ ���� r,g,b ���� , ��������
	private int g;
	private int b;
	private static int count; // ������ poxel�� ���� ���� �������� count , ��������
	
	public Pixel() { // ������ 
		Point p = new Point();
		r = 0;
		g = 0;
		b = 0;
		count++;
	}
	public Pixel(Point p , int r , int g, int b) {  // ������ (Point,r,g,b)
        point = p;	
		if (r>=255) {  //  r,g,b �� �ԷµǴ� ���� 255�� ��� 0���� �ʱ�ȭ
			this.r=0;
		} else {
			this.r=r;
		}
		if (g>=255) {
			this.g=0;
		} else {
			this.g=g;
		}
		if (b>=255) {
			this.b=0;
		} else {
			this.b=b;
		}
		count++;
	}
	public void setRGB(int r ,int g, int b) {  // r,g,b�� �����ϱ� ���� �޼ҵ�
		this.r=r;
		this.g=g;
		this.b=b;
	}
	public String toString() { // ������ ����ϴ� toString �޼ҵ� 
		return "R: " +r +" G: " +g +" B: "+b+ " X�� ��ǥ: "+point.getX() +" Y�� ��ǥ: "+point.getY(); 
	}
	public static int getCount() { // count�� �����ϴ� �޼ҵ�
		return count;
	}
}
