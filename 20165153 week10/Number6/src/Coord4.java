// 실습 6. 다음은 x,y 좌표값을 가지는 객체의 구성과 생성 사용 예 - 기타 메서드 응용 ( 좌표 이동 메서드 moveTo)
import java.io.*;
public class Coord4 {
	
	private int pos_x; // x좌표변수 , 정보은닉
	private int pos_y; // y좌표변수 , 정보은닉
	
	public int getPos_x() { // x좌표 접근 메서드
		return pos_x;
	}
	public int getPos_y() { // y좌표 접근 메서드
		return pos_y;
	}
	public void setPos_x(int a) { // x좌표 수정 메서드
		pos_x = a;
	}
	public void setPos_y(int a) { // y좌표 수정 메서드
		pos_y = a;
	}
	public String toString() {
		return "X: " + pos_x + " Y:" + pos_y;
	}
	public void moveTo(int a , int b) {
		pos_x = a;
		pos_y = b;
	}

}
