/* 실습 2. 실습 1의 프로그램을 while문을 이용해서 출력하시오.
 * 
 * 크기입력 : 10
 * [0] [1] [2] [3] [4] [5] [6] [7] [8] [9]
 */

import java.util.Scanner;

public class Number2 {
	public static void main(String[] args) { //프로그램 시작
		int num; // 변수 입력
		int i =0; 
		
		Scanner input = new Scanner(System.in);
		System.out.print("크기입력 : ");
		num = input.nextInt(); //키보드로부터 변수입력받기
		
		while (i<num) {
			System.out.print("[" + i + "] ");
			i++;
		} // while문에 따른 결과 출력
	} // 프로그램 종료

}
