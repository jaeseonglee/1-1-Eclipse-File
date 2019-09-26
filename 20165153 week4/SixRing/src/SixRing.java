/* 6. 다음 주어진 조건을 관계연산과 논리연산으로 결과를 출력하는 프로그램을  작성하시오.
 * 이 때 필요한 변수와 상수를 적절히 선언해서 사용하시오.
 */

import java.util.Scanner;

public class SixRing {

	public static void main(String[] args) {//프로그램 시작
		// TODO Auto-generated method stub
        final int M = 1; // 변수 입력
		final int W = 2;
		int married;
		int age,gender;
		int computer,english,math,sum;
		double average;
		int not;
		int year;
		int num7;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("미혼이신가요? (맞다면 1, 아니라면 2) : "); //1번
	    married = input.nextInt();
	    System.out.println("1. 미혼인가 " + (married == M) + " " );
		
		System.out.print("나이를 입력해주세요 : "); // 2번
		age = input.nextInt();
		System.out.print("성별을 입력해주세요 (남자면 1 , 여자면 2) : ");
		gender = input.nextInt();
		System.out.println("2. 나이가 19세 이상이고 남자인가 " +  ( ( age >= 19 ) && ( gender == M ) ) + " " );
		
		
		System.out.print("컴퓨터 점수를 입력해주세요 : "); //3,4,5번
		computer = input.nextInt();
		System.out.print("영어 점수를 입력해주세요 : ");
		english = input.nextInt();
	    System.out.print("수학 점수를 입력해주세요 : ");
	    math =input.nextInt();
	    System.out.print("결석 획수를 입력해주세요 : ");
		not = input.nextInt();
	    
		
		System.out.println("3. 컴퓨터와 영어 그리고 수학 모두가 90점 이상인가 " 
	    + ( ( (computer>=90) && (english >=90) ) && (math >= 90) )+ " ");
		
		average = (computer + english + math) /3 ;
		sum = computer + english + math;
		System.out.println("4.총점이 200점 이상이거나 평균이 60점 이상인가 " + ( (sum >= 200) || (average>=60) ) + " ");
	
		System.out.println("5.점수가 60점 미만이거나 결석획수가 4번 이상인가 " + ( ( (computer < 60) || (english < 60) || (math < 60)) || (not >= 4) ) + " ");            
		
		
		System.out.print("현재의 연도를 입력해주세요 : "); //6번
		year = input.nextInt();
		System.out.println("6.현재의 년도는 윤년인가 " + ( (year % 4) ==0) + " ");
		
		
		System.out.print("숫자를 입력해주세요 : "); //7,8번
		
		num7  = input.nextInt();
		System.out.println("7.입력된 숫자가 짝수인가 " + (num7 % 2 == 0) + " " );
		System.out.print("8.입력된 숫자가 3과 5의 공배수인가 " + ( ( (num7 % 3) == 0 ) && (num7%5) == 0) + " " );    
        // 결과 처리 및 출력 
	} //프로그램 종료

}
