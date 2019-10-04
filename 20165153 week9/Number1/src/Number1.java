// 학번 : 20165153 이름 :이재성  실습 1. 프로젝트 ArrayEx.java

import java.util.Scanner;

public class Number1 {
	public static void main(String[] args) { // 프로그램 시작
		int sum=0, oddSum = 0, i , number,count=0; // 변수 선언
		
// 1) 다음의 값을 가지는 1차원 배열을 선언하고 초기화하시오.
		int [] arr = {1,3,2,9,5,6,7,8,4,10}; // 1차원 배열 선언 및 초기화
		
// 2) 다른 1차원 배열 변수를 선언하고 반복문으로 기존 배열을 복사하시오.
		int [] another = new int [10]; // 다른 1차원 배열 선언
		
		for (i=0; i<another.length; i++) {
			another [i] = arr [i]; 
		} // for문을 통해 기존 배열 복사
		
// 3) 배열들 합을 구하시오.
		for (i=0; i<another.length; i++) {
			sum += another[i];
		} // for문을 통해 배열들의 합 구하기
		System.out.println("배열의 합 : "+sum); // 배열들의 합 출력
		
// 4) 사용자가 입력한 값이 위치한 배열 내에 인덱스 위치를 출력하시오.		
		Scanner input = new Scanner(System.in);
		System.out.print("찾고자 하는 값을 입력하세요 : "); // 사용자로부터 정수 입력받기
		number = input.nextInt(); 
		
		for (i=0; i<another.length; i++) {
			if (number == another[i]) {
				System.out.println("값 " + number + "의 인덱스는 [" + i + "]입니다. ");
			} // if문을 통해 입력받은 값이 있는 인덱스 출력
		}
// 5) for문과 if문을 이용해 홀수인 값들의 개수 및 합계를 구하시오.
		for (i=0; i<another.length; i++) {
			if (another[i] % 2 != 0) {
				oddSum += another[i];
				count++;
			} // if문에 의해서 홀수가 있다면 홀수의 개수 및 홀수의 합 계산
		}
		System.out.println("홀수의 개수 : "+ count+ "개"); // 홀수의 개수 출력
		System.out.println("홀수의 합 : " + oddSum); // 홀수의 합 출력
		
	} // 프로그램 종료

}
