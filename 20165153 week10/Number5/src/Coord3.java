// 실습 5. 다음은 x,y 좌표값을 가지는 객체의 구성과 생성 사용 예- 객체 정보 출력 메서드 toString()
import java.io.*;
public class Coord3 {
	
	private int pos_x; // x좌표변수, 정보은닉
	private int pos_y; // y좌표변수, 정보은닉
	
	public int getPos_x() { // x좌표 접근 메서드
		return pos_x;
	}
	public int getPos_y() { // y좌표 접근 메서드
		return pos_y;
	}
	public void setPos_x(int a) { // x좌표 수정 메서드
		pos_x =a;
	}
	public void setPos_y(int a) { // y좌표 수정 메서드
		pos_y = a;
	}
	public String toString() {
		return "X:" + pos_x+" Y:"+pos_y;
	}

}
