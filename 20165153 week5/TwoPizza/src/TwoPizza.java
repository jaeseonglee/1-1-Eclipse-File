/* 실습 2 . 사용자로부터 입력받은 정수가 홀수인지 짝수인지를 판단하는 프로그램을 작성하시오.
 * 짝수는 2로 나눈 나머지가 0인 값 
 */

import java.util.Scanner;

public class TwoPizza {
	
	public static void main(String[] args) { // 프로그램 시작
		int value; //변수 입력
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		value = input.nextInt(); // 키보드로부터 정수 입력받기
		
		if (value % 2 == 0) {
			System.out.print(value + "는(은) 짝수입니다.");
		}  else {
			System.out.print(value + "는(은) 홀수입니다.");
		} // if문에 따른 결과 출력

	} // 프로그램 종료
}
