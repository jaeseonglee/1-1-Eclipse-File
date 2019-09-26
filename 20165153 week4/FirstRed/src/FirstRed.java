/* 학번 : 20165153 이름 : 이재성  
 *실습 1. 키보드로부터 반지름 r을 입력받아 공의 부피(V) 와 표면적 (S)을 구하여 출력하는
 * 프로그램을 작성하시오.
 */
import java.util.Scanner;

public class FirstRed { 

	public static void main(String[] args) {//프로그램 시작
		// TODO Auto-generated method stub
        final double pi = 3.14;  // 상수,변수 입력
		int r;
		double volume;
		double S;
		
		Scanner input = new Scanner(System.in);
		System.out.print("반지름을 입력하세요 : ");  // 키보드로 부터 반지름 입력받기
		r = input.nextInt();
		
		volume = (4.0/3.0)* pi * r * r * r;
		S = 4 * pi * r * r;
		
		System.out.println("반지름 r에 따른 부피는 " + 
		volume + "이고 표면적은 " + S + " 입니다."); // 부피와 표면적 출력
		
	}// 프로그램 종료

} 
