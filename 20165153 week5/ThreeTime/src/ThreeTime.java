/* 실습 3. 다음과 같이 정의되는 함수의 함수값을 계산하여 보자. 사용자로부터 x 값을 입력받아서 함수값을
 * 계산하여 화면에 출력한다. 이때 x는 실수이다. (if else문 사용) 
 */

import java.util.Scanner;

public class ThreeTime {
	
	public static void main(String[] args) { // 프로그램 시작
        double x; // 변수 입력
         
        Scanner input = new Scanner(System.in);
        System.out.print("계산값 x를 입력하시오: ");
        x = input.nextInt(); // 키보드로부터 x 입력 받기
         
        if (x <= 0) 
        	System.out.print("함수 f(x)의 결과는 " + (x * x * x - 9.0 * x + 2.0));
           else 
            System.out.print("함수 f(x)의 결과는 " + (7.0 * x + 2.0) );
        	// if문에 따른 결과 출력
        
	} // 프로그램 종료
}
