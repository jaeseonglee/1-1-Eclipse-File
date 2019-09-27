/* 실습 6.사용자로부터 두 개의 숫자를 입력하도록 하여 가장 작은 수, 가장 큰 수, 합계 또는 평균 값 중
 * 하나를 선택하여 계산하는 메뉴기반 프로그램을 프로그램을 작성하라. 메뉴와 각 선택은 각각 하나의
 * 함수로 구현되어야 하다. switch 문을 사용하여 어떠한 계산을 해야 할지를 선택하도록 하라.
 * 만약 유효하지 않은 선택이 입력되면 오류 메세지를 출력하라. 
 */

import java.util.Scanner;

public class SixSound {
    
	public static void main(String[] arg) { // 프로그램 시작
		int num1 , num2; // 변수 입력 
		int choice;
		double result;
		
		Scanner input = new Scanner(System.in);
		System.out.print("두 정수를 입력해주세요 : ");
		num1 = input.nextInt(); 
		num2 = input.nextInt(); // 사용자로부터 두 정수 입력받기 
		
		System.out.println("메뉴");
		System.out.println("1. 작은 수");
		System.out.println("2. 큰 수");
		System.out.println("3. 합계");
		System.out.println("4. 평균");
		System.out.println("5. 종료");
		System.out.print("메뉴를 선택하세요 : ");
		choice = input.nextInt(); // 메뉴 출력 및 사용자로부터 메뉴의 선택을 입력받기
		
		switch(choice){
		  case 1 : if (num1 < num2){
			          result = num1;
			          System.out.print("결과 : " + result);
		          } else {
		        	  result = num2;
		        	  System.out.print("결과 : " + result);
		          } break;
		  case 2 : if (num1 < num2) {
                       result = num2;
                       System.out.print("결과 : " + result);
                  } else {
        	           result = num1;
        	           System.out.print("결과 : " + result);
                  } break;
		  case 3 : 
			      result = num1 + num2;
			      System.out.print("결과 : " + result);
		          break;
		  case 4 : 
			      result = (num1 + num2) / 2.0;
			      System.out.print("결과 : " + result);
			      break;
		  case 5 :
			      System.out.print("결과 : 종료");
			      break;
	      default :
	    	  System.out.print("결과 : 메뉴선택오류");
		} // switch문에 따른 각각의 결과들 출력 
		
	} // 프로그램 종료
}
 