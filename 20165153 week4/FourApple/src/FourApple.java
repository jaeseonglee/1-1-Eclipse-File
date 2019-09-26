/* 4. 키보드로부터 두 수를 입력 받아 두 수중 큰 값을 출력하는 프로그램을 작성하시오.  
 */

import java.util.Scanner;

public class FourApple {

	public static void main(String[] args) { // 프로그램 시작
		// TODO Auto-generated method stub
        int num1; // 변수 입력
        int num2;
        int max;
		
        Scanner input = new Scanner(System.in);
		
		System.out.print("첫 번째 수 입력 : ");
		num1 = input.nextInt();
		System.out.print("두 번째 수 입력 : ");
		num2 = input.nextInt(); // 키보드로부터  두 수를 입력받기
		
		max = ( num1 > num2 )? num1 : num2;
		
		System.out.print("큰 수는 " + max + " 입니다."); // 결과 출력
		
	} //프로그램 종료

}
