/*  실습 4. 사용자로부터 키와 몸무게를 입력받아 표준체중을 계산한 후 비만도를 계산하고 비만 정도에 따라
 * 비만여부를 출력하는 판단하는 프로그램을 작성하시어. (다중 if문사용 if,else if,else)
 */

import java.util.Scanner;

public class FourHear {
	
	public static void main(String[] args) { // 프로그램 시작
		int height; // 변수 입력
		int weight;
		double standardWeight;
		double fat;
		
		Scanner input = new Scanner(System.in);
		System.out.print("키를 입력하세요 : ");
		height = input.nextInt();
		System.out.print("몸무게를 입력하세요 : ");
		weight = input.nextInt();  // 키보들로부터 키와 몸무게 입력받기
		
		standardWeight = ( height - 100 ) * 0.9;
		fat = ( weight - standardWeight ) / standardWeight * 100;
		// 표준 체중과 비만도의 계산식
		
		if (fat < 20) {
			System.out.print("비만도는 정상입니다.");
		} else if (fat < 30) {
			System.out.print("비만도는 경도비만입니다.");
		} else if (fat < 50) {
			System.out.print("비만도는 중등도 비만입니다.");
		} else {
			System.out.print("비만도는 고도비만입니다.");
		}  // if문에 따른 결과 출력
		
	} // 프로그램 종료
}
