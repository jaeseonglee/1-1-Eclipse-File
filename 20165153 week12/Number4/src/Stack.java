/* 실습 4. 사용자로부터 정수를 입력받아 입력받은 배열에 순차적으로 저장하고 가장 
 * 마지막에 입력된 값을 가장 먼저 꺼내는 구조인 Stack 클래스를 작성하시오.
 */
import java.io.*;
public class Stack {
	private int arr [] = new int [10]; // 배열 선언 , 정보 은닉
	private int tos = 0; // 변수 선언 , 정보 은닉
	
	public void push(int value) { // 배열에 값을 저장하고 tos의 값을 증가시키는 메서드
		if (tos >= arr.length) { // 단,  tos가 배열의 범위를 넘었을 경우 증가시키지 않는다.
			System.out.println("배열의 범위를 넘었습니다.");
			return;
		}
		arr[tos] = value;
		tos++;
	}
	public int pop() { // 배열에서 값을 가져올 메서드 , 제일 마지막 값을 리턴한다.
		if (tos == 0) { // 단, tos의 값이 0일 경우 오류를 출력한다.
			System.out.println("오류! : tos의 값이 0입니다.");
			return tos;
		}
		tos--;
		return arr[tos];
	}
	public int getTos() { // tos의 값을 리턴할 메서드
		return tos;
	}
	public void printArray() { // 배열 전체를 출력하는 메서드
		System.out.print("배열 : ");
		for (int i =0; i<tos; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}
	

}
