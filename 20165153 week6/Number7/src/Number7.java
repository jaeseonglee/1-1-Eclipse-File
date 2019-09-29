/* 실습 7. 사용자로부터 0이 아닌 정수가 입력될 때 까지의 합과 평균을 계산하는 프로그램을 작성하시오.(do while문  사용)
 * 
 * 정수입력 : 5
 * -> 합:5 평균:5
 * 정수입력 : 4
 * -> 합:9 평균:4.5
 * 정수입력 : 0
 * -> 종료
 */

import java.util.Scanner;

public class Number7 {
	public static void main(String[] args) { // 프로그램 시작
		int num, sum = 0; // 입력받을 정수와 정수의 합 입력
		double average = 0, i = 1.0; // 변수 입력
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.print("정수 입력 : ");
			num = input.nextInt(); // 사용자로부터 정수 입력받기
			
			sum = num +sum;
			average = sum / i; // 합과 평균 
			
			if (num==0) {
				System.out.print("-> 종료");
			} else {
				System.out.println("-> 합 : "+ sum +" 평균 : " + average );
			} // if문에 따른 결과 출력
			i++;
		} while (num != 0);
		 // do while에 따른 반복 출력
	} // 프로그램 종료 

}
