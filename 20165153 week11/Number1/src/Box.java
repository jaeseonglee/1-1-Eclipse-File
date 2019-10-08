/* 학번 : 20165153 이름 : 이재성  실습 11주차 
 * 실습 1. 다음 제시된 클래스를 작성하시오.(Box)
 */
import java.io.*;
public class Box {
	
	private int width; // 가로좌표변수 , 정보은닉
	private int length; // 세로좌표변수 , 정보 은닉
	private int height; // 높이좌표변수 , 정보 은닉
		
	public int getWidth() { // 가로좌표 접근 메서드
		return width;
	}
	public int getLength() { // 세로좌표 접근 메서드
		return length;
	}
	public int getHeight() { // 높이좌표 접근 메서드
		return height;
	}
	public void setWidth(int a) { // 가로좌표 수정 메서드
		width = a;
	}
	public void setLength(int a) { // 세로좌표 수정 메서드
		length = a;
	}
	public void setHeight(int a) { // 높이좌표 수정 메서드
		height = a;
	}
	public int getVolume() { // 상자의 부피를 계산하는 메서드 
		return width * length * height; 
	}
	public String toString() { //문자열로 반환하는 메서드
		return "가로: "+width +" 세로: "+length+ " 높이: "+height+" 인 상자의 부피는 " + width * length * height +" 입니다.";
	}

}
