// 실습 2. 다음 제시에 따라 Point 클래스와 Pixel클래스를 작성하고 테스트 클래스를 만들어 테스트하시오.
public class Point { 
	private int x; // x 변수 , 정보은닉
	private int y; // y 변수 , 정보은닉
	private static final int MAX_POSX = 1280;  // 상수형 변수 , 정보은닉
	private static final int MAX_POSY = 1024;  // 상수형 변수 , 정보은닉
	private static int count;  // count 정적 변수, 정보은닉
	
	public Point() { // 생성자 (x,y 값이 0)
		this.x = 0;
		this.y = 0;
		count++;
	}
	public Point(int x ,int y) { //생성자 ( x,y값을 받음)
		this.x = x;
		this.y = y;
		count++;
	}
	public int getX() { // x 접근 메소드
		return x;
	}
	public int getY() { // y 접근 메소드
		return y;
	}
	public void moveBy(int x ,int y) {  // x,y값을 지정한 만큼 이동시키는 메소드
		if( (this.x + x ) < MAX_POSX ) {
			this.x += x;
		}
		if ( (this.y + y ) < MAX_POSY) {
			this.y += y;
		}
	}
	public String toString() { // x,y의 위치를 문자열로 리턴하는 메소드
		return "X의 위치 : "+x +"  Y의 위치 : "+ y;
	}
	public boolean equals(Point p) {  // 두 객체가 같은지 확인하는 equals 메소드
		if (this == p ) {
			return true;
		} else {
			return false;
		}
	}
	public static int getCount() {  // count 값을 리턴하는 메소드
		return count;
	}
}
