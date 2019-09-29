/* 실습 12. 피보나치수열을 출력하기위한 프로그램을 작성하시오.
 * -피보나치수열은 첫번째 항의 값이 0이고 두번째 항의 값이 1일때 이후의 항들은 이전의 
 * 두 항을 더한 값으로 이루어지는 수열을 말한다.
 */

import java.util.Scanner;

public class Number12 {
	public static void main(String[] args) { // 프로그램 시작
		int num, sum=0,result; // 변수 입력
		int one=0, two=1; 
		
		Scanner input = new Scanner(System.in);
		System.out.print("피보나치 수열의 마지막 항을 입력하시오. : ");
		num =input.nextInt(); // 키보드로부터 마지막 항 입력받기
		
		System.out.print("피보나치수열 : " + one+", "+two);
		
		for (int i =3; i<=num; i++) {
			result = one+two;
			System.out.print(", "+result);
			one=two;
			two=result;
			sum =result +sum;
		} //for문을 통해 수열 출력 및 수열의 합 계산
		System.out.println();
		System.out.print("수열 합계 : "+sum); //수열의 합 출력
	} // 프로그램 종료 

}
