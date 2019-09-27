/* 학번 : 20165153 이름 : 이재성 
 * 실습 1. 사용자로부터 두 수를 입력받아 두 수의 크기를 비교하는 프로그램을 작성하시오.
 * 
 */

import java.util.Scanner;

public class OneWalk {
	
	public static void main(String[] args) { // 프로그램 시작
		int num1; // 변수 입력
		int num2;
		
		Scanner input = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하시오. : ");
		num1 = input.nextInt();
		System.out.print("두 번째 정수를 입력하시오. : ");
		num2 = input.nextInt();  //키보드로부터 두 정수 입력받기
		
		if (num1 > num2) {
			  System.out.print("결과 : 두 번째 정수 " + num2 + " 이(가) 첫 번째 정수 " + num1 + " 보다 작다.");
		}  else if (num1 < num2) {
			  System.out.print("결과 : 첫 번째 정수 " + num1 + " 이(가) 두 번째 정수 " + num2 + " 보다 작다.");
		}  else {
			System.out.print("결과 : 두 정수의 값은 같다.");
		}// if문에 따른 결과 출력
		
	} // 프로그램 종료
}
