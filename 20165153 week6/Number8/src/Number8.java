/* 실습 8. 이중 반복문 (중첩 for문) 과 조건문 if와 continue를 이용해서 사용자로부터 입력받은 숫자까지의
 *  모든 숫자 중 소수(1과 자기 자신 만으로만 나누어 떨어지는 1보다 큰 양의 정수)만을 출력하는 프로그램을 작성하시오.
 * 
 * 출력 예시 )
 * 출력 최대값 입력 : 16
 * 
 * 소수 : 2 3 5 7 11 13
 */

import java.util.Scanner;

public class Number8 {
	public static void main(String[] args) { // 프로그램 시작
		int num, i ,n; // 변수 입력
		
		
		Scanner input = new Scanner(System.in);
		System.out.print("최대 출력값 입력 : ");
		num = input.nextInt(); //사용자로부터 숫자 입력받기
		System.out.print("소수 : ");
		
		for (i = 2; i<num; i++) {
			for (n=2; n<i; n++) {
				if( i%n==0) { // if문을 통해 소수인지 아닌지 확인
					i++;
					continue; // 만약 i를 n으로 나눴을 때 0이라면 i를 증가시켜 새로운 반복
				}
		    }
			if (i>num){
				// 반복문 속의 if문에 의해서 i가 num보다 커진다면 아무것도 출력하지 않는다.
			}
			else if (i==n) {
				System.out.print(i+" ");
			} // i가 소수라면 출력 
		} //for문을 통해 입력된 숫자가 소수인지 아닌지 반복
	} // 프로그램 종료 

}
