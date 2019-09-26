/*2. 사용자로부터 키와 몸무게를 입력받아 표준체중과 비만도를 계산하여 출력하는
 * 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class SecondOrange { 

	public static void main(String[] args) { //프로그램 시작
		// TODO Auto-generated method stub
        double height; // 변수 입력
        double weight;
        double x;
        double y;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("키를 입력하세오 : ");
        height = input.nextInt(); 
        System.out.print("몸무게을 입력하세오 : ");
        weight = input.nextInt();  // 사용자로부터 키와 몸무게 입력받기
        
        x = ( height - 100 ) * 0.9; 
        y = ( weight - x ) / x * 100;
        
        System.out.println("표준체중은 " + x + "이고 비만도는 " + y + "입니다.");
		// 표준체중과 비만도 출력
	} //프로그램 종료

} 