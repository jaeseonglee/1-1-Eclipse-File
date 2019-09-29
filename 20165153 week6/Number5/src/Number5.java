/* 실습 5. 키보드로부터 1부터 9 사이의 정수를 입력받아 해당 구구단을 출력하는 프로그램을 작성하시오.
 * 
 * 출력 : 
 * 구구단 단을 입력하세요 : 3
 * 3 * 1 = 3
 * 3 * 2 = 6
 * 3 * 3 = 9  
 * .....
 * 3 * 9 =27
 */

import java.util.Scanner;

public class Number5 {
	public static void main(String[] args) { // 프로그램 시작
		int num; // 변수 입력
		
		Scanner input = new Scanner(System.in);
		System.out.print("구구단 단을 입력하세요 : ");
		num = input.nextInt();  //키보드로부터 구구단의 단 입력받기
		
		for(int i=1; i<=9; i++) {
			System.out.println(num +" * "+ i +" = " + num * i);
		} // for문에 따른 결과 출력
		
	} // 프로그램 종료

}
