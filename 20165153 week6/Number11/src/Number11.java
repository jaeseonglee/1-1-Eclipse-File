// 실습 11. 사용자로부터 n값을 입력받고 n! 을 구하는 프로그램을 작성하시오.

import java.util.Scanner;

public class Number11 {
	public static void main(String[] args) { // 프로그램 시작
		int num; // 입력받을 n
		long result=1; // 결과 입력
		
		Scanner input = new Scanner(System.in);
		System.out.print("팩토리얼 n 값을 입력하시오 : ");
		num = input.nextInt(); // 사용자로부터 n값 입력받기
		
		for (int i=1; i<=num; i++) {
			result= result*i;
		} // for문을 통한 n! 계산
		System.out.print(num+"! = "+result);
		// 결과 출력
	} // 프로그램 종료 

}
