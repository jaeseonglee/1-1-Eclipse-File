/* 학번 : 20165153 작성자 : 이재성
 * 실습 1. 다음과 같은 출력을 나타내는 프로그램을 작성하시오.
 * 
 * 크기입력 : 10
 * [0] [1] [2] [3] [4] [5] [6] [7] [8] [9]  
 */

import java.util.Scanner;

public class Number1 {
	public static void main(String[] args) { // 프로그램 시작
		int num; //변수 입력
		
		Scanner input = new Scanner(System.in);
		System.out.print("크기입력 : ");
		num = input.nextInt();  // 키보드로부터 변수 입력받기
		
		for (int i=0; i<num;i++) {
			System.out.print("[" + i + "] ");
		} // for문에 따른 결과 출력
		
	} // 프로그램 종료

}
