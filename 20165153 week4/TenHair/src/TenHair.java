/* 10. 어떤 학생이 이번 학기에 컴퓨터 개론, c언어 프로그래밍, 영어, 일반 수학을 수강신청하였다.
 * 각 과목의 점수를 입력하면 그 학생의 이번 학기 평균 점수를 계산하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class TenHair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int computer;
		int C;
		int english;
		int math;
		double result;
		
		Scanner input = new Scanner(System.in);
		System.out.print("컴퓨터 개론 과목의 점수를 입력하시오. : ");
		computer = input.nextInt();
		System.out.print("C언어 프로그래밍 과목의 점수를 입력하시오. : ");
		C = input.nextInt();
		System.out.print("영어 과목의 점수를 입력하시오. : ");
		english = input.nextInt();
		System.out.print("일반 수학 과목의 점수를 입력하시오. : ");
		math = input.nextInt();
		
		result = ( computer + C + english + math ) / 4.0;
		
		System.out.print("평균 점수는 " + result + " 점 입니다.");
		
	}

}
