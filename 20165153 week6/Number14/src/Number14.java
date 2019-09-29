/* 실습 14. 사용자로부터 두 수를 입력받아 최대 공약수를 구하는 프로그램을 작성하시오.
 * 
 * 프로그램 순서: (2에서 5단계 까지가 작은수를 y로 한다.)
 * 1. 두 수 가운데 큰수를 x 작은수를 y로 한다.
 * 2. y가 0일 때까지 반복하여 결과 공약수는 x이다.
 * 3. r = x % y //x를 y로 나눈 나머지가 새로운 y가 되고
 * 4. x = y;  // 기본의 y값은 새로운 x가 된다.
 * 5. y = r;
 * 6. 2단계로 돌아간다. 
 */

import java.util.Scanner;

public class Number14 {
	public static void main(String[] args) { // 프로그램 시작
		int num1,num2, x, y, r; // 변수 입력
		
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 수를 입력해주세요. : ");
		num1 = input.nextInt(); 
		System.out.print("두번째 수를 입력해주세요. (단, 첫번째 수와 다른 수) : ");
		num2 = input.nextInt(); // 사용자로부터 두 수 입력받기
		
		if (num1>num2) {
			x = num1;
			y = num2;
		} else {
			x = num2;
			y = num1;
		} // if문에 따라 큰 수와 작은 수 구분
		for (    ; y!=0; ) {
			r = x % y;
			x = y;
			y = r ; 
		} // for문 을 통해 두 수의 최대공약수를 계산 
		System.out.print("두 수의 최대 공약수는 "+x);
		// 두 수의 최대 공약수 출력
	} // 프로그램 종료 

}
