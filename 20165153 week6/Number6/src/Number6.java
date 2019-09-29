/* 실습 6. 사용자로부터 높이와 너비를 입력받아 중첨된 반복문을 이용해서 다음의 패턴들을 출력하시오.
 * 
 * 도형의 높이 : 4
 * 도형의 너비 : 5
 * 
 * 사각형 
 * *****
 * *****
 * *****
 * *****
 * 직각삼각형
 * *
 * **
 * ***
 * ****
 * 이등변삼각형
 *    *
 *   ***
 *  *****
 * *******
 * 역삼각형
 * *******
 *  *****
 *   ***
 *    *
 *    
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 
 * 1
 * 13
 * 135
 * 1357
 * 13579
 * 
 * [0][0] [0][1] [0][2] [0][3] [0][4]
 * [1][0] [1][1] [1][2] [1][3] [1][4]
 * [2][0] [2][1] [2][2] [2][3] [2][4]
 * [3][0] [3][1] [3][2] [3][3] [3][4]
 */

import java.util.Scanner;

public class Number6 {
	public static void main(String[] args) { // 프로그램 시작
		int height, width, i, n; // 변수 입력
		
		Scanner input = new Scanner(System.in);
		System.out.print("도형의 높이 : ");
		height = input.nextInt(); // 사용자로부터 높이 입력받기
		System.out.print("도형의 너비 : ");
		width = input.nextInt(); // 사용자로부터 너비 입력받기
		System.out.println();
		
		System.out.println("사각형");
		for ( i=1; i<=height; i++) {
			for ( n=1; n<=width; n++) {
				System.out.print("*");
			}
			System.out.println();
		} // 중첩 for문을 통한 사각형 모양 출력
		
		System.out.println("직각삼각형");
		for (i=1; i<=height; i++) {
			for (n=1; n<=i; n++) {
				System.out.print("*");
			}
			System.out.println();
		} // 중첩 for문을 통한 직각삼각형 모양 출력
		
		System.out.println("이등변삼각형");
		for (i=1; i<=height; i++) {
			for (n=1; n<width-i; n++) {
				System.out.print(" ");
			} 
			for (n=1; n<=i; n++) {
				System.out.print("*");
			}
			for (n=1; n<i; n++) {
				System.out.print("*");
			}
			System.out.println();
		} // 중첩 for문을 통한 이등변 삼각형 모양 출력
		
		System.out.println("역삼각형");
		for (i=1; i<=height; i++) {
			for (n=1; n<i; n++) {
				System.out.print(" ");
			}
			for (n=1; n<=width-i; n++) {
				System.out.print("*");
			}
			for (n=1; n<width-i; n++) {
				System.out.print("*");
			}
			System.out.println();
		} // 중첩 for문을 통한 역삼각형 모양 출력
		System.out.println();
		
		for (i=1; i<=height+1; i++) {
			for(n=1; n<=i; n++) {
				System.out.print(n);
			}
			System.out.println();
		} // 중첩 for문을 통한 숫자로 이루어진 직각삼각형 모양 출력
		System.out.println();
		
		for (i=1; i<= height+1; i++) {
			for (n=1; n<=2*i; n++) {
				System.out.print(n);
				n++;
			}
			System.out.println();
		} // 중첩 for문을 통한 홀수로 이루어진 직각삼각형 모양 출력
		System.out.println();
		
		for (i=1; i<=height; i++) {
			for (n=1; n<=width; n++) {
				System.out.print("["+ (i-1) +"]" +"["+(n-1)+"] ");
			} 
			System.out.println();
		} // 중첩 for문을 통한 대괄호와 숫자로 이루어진 모양 출력
		
	}// 프로그램 종료 

}
