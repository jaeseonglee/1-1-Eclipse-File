/* 실습 5. 사용자로부터 2차 방정식의 계수 a , b , c를 실수로 입력받아 2차 방정식의 근을
 * 계산 출력하는 프로그램을 작성하시오.
 * (단 허근을 계산할 경우에는 i 는 값이 아닌 문자로 포함해서 출력한다.) 
 */

import java.util.*;

public class FiveWater {
	
	public static void main (String arg[]) { // 프로그램 시작
		double a , b , c;
		double D , result1 , result2; // 변수 입력
		
		Scanner input = new Scanner(System.in);
		System.out.print("ax^2 + bx +c = 0 에서의 x^2의 계수 a를 입력해주세요. : ");
		a = input.nextInt();
		System.out.print("x의 계수 b를 입력해주세요. : ");
		b = input.nextInt();
		System.out.print("상수 c를 입력해주세요. : ");
		c = input.nextInt(); // 키보드로부터 2차 방정식의 계수를 입력받기
		
		D = b * b - 4 * a * c; // 판별식 D 정의
		
		if (D > 0) {
			result1 = (-b + Math.sqrt( (b * b) - (4.0 * a * c) ) ) / (2.0 * a); 
			result2 = (-b - Math.sqrt( (b * b) - (4.0 * a * c) ) ) / (2.0 * a);
			System.out.print("입력하신 2차 방정식의 계수에 따른 서로 다른 두 실근은 " + result1 + 
					" 과 " + result2 + "입니다.");
		} else if (D == 0) {
			result1 = result2 = -b /(2.0 * a);  // (-b + 0) / (2.0 *a) = (-b - 0 ) / (2.0 * a)
			System.out.print("입력하신 2차 방정식의 계수에 따른 근은 " + result1 + "(중근) 입니다." );
		} else {
			result1 = (-b + Math.sqrt ( (4.0 * a * c) - (b * b) ) ) / (2.0 * a); 
			result2 = (-b - Math.sqrt ( (4.0 * a * c) - (b * b) ) ) / (2.0 * a);
			System.out.print("입력하신 2차 방정식의 계수에 따른 서로 다른 두 허근은 " + result1 + 
					"i 과 " + result2 + "i 입니다. (실근이 없습니다.)");
		} // if문에 따른 결과 출력
		
	} // 프로그램 종료
}
