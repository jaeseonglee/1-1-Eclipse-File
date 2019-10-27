
public class Pixel {
	private Point point = new Point(); //좌표점을 저장하기위한 Point 객체 변수 , 정보은닉
	private int r; // 3가지 색삭을 저장하기위한 정수형 변수 r,g,b 변수 , 정보은닉
	private int g;
	private int b;
	private static int count; // 생성된 poxel의 수를 세는 정적변수 count , 정보은닉
	
	public Pixel() { // 생성자 
		Point p = new Point();
		r = 0;
		g = 0;
		b = 0;
		count++;
	}
	public Pixel(Point p , int r , int g, int b) {  // 생성자 (Point,r,g,b)
        point = p;	
		if (r>=255) {  //  r,g,b 가 입력되는 값이 255일 경우 0으로 초기화
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
	public void setRGB(int r ,int g, int b) {  // r,g,b를 변경하기 위한 메소드
		this.r=r;
		this.g=g;
		this.b=b;
	}
	public String toString() { // 정보를 출력하는 toString 메소드 
		return "R: " +r +" G: " +g +" B: "+b+ " X의 좌표: "+point.getX() +" Y의 좌표: "+point.getY(); 
	}
	public static int getCount() { // count를 리턴하는 메소드
		return count;
	}
}
