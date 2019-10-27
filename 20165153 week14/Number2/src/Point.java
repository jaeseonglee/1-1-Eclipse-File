// �ǽ� 2. ���� ���ÿ� ���� Point Ŭ������ PixelŬ������ �ۼ��ϰ� �׽�Ʈ Ŭ������ ����� �׽�Ʈ�Ͻÿ�.
public class Point { 
	private int x; // x ���� , ��������
	private int y; // y ���� , ��������
	private static final int MAX_POSX = 1280;  // ����� ���� , ��������
	private static final int MAX_POSY = 1024;  // ����� ���� , ��������
	private static int count;  // count ���� ����, ��������
	
	public Point() { // ������ (x,y ���� 0)
		this.x = 0;
		this.y = 0;
		count++;
	}
	public Point(int x ,int y) { //������ ( x,y���� ����)
		this.x = x;
		this.y = y;
		count++;
	}
	public int getX() { // x ���� �޼ҵ�
		return x;
	}
	public int getY() { // y ���� �޼ҵ�
		return y;
	}
	public void moveBy(int x ,int y) {  // x,y���� ������ ��ŭ �̵���Ű�� �޼ҵ�
		if( (this.x + x ) < MAX_POSX ) {
			this.x += x;
		}
		if ( (this.y + y ) < MAX_POSY) {
			this.y += y;
		}
	}
	public String toString() { // x,y�� ��ġ�� ���ڿ��� �����ϴ� �޼ҵ�
		return "X�� ��ġ : "+x +"  Y�� ��ġ : "+ y;
	}
	public boolean equals(Point p) {  // �� ��ü�� ������ Ȯ���ϴ� equals �޼ҵ�
		if (this == p ) {
			return true;
		} else {
			return false;
		}
	}
	public static int getCount() {  // count ���� �����ϴ� �޼ҵ�
		return count;
	}
}
