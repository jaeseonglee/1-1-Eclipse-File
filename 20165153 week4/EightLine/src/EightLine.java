/* 8. 시간을 초단위로 입력하여 입력된 시간이 몇시간 몇분 몇초에 해당하는지를
 * 계산하는 프로그램을 작성하시오. 
 */

import java.util.Scanner;

public class EightLine {

	public static void main(String[] args) { //프로그램 시작
		// TODO Auto-generated method stub
        int hour = 0; // 변수 입력
        int minute = 0;
        int second = 0;
        int value = 0;
        
        Scanner input = new Scanner(System.in);
		System.out.print("초단위 시간을 입력하세요: ");
		value = input.nextInt();
		second = value % 60 ;
		value = value / 60;
		minute = value % 60;
		hour = value / 60;
		
		System.out.print( hour + "시간 " + minute + "분 " + second + "초입니다.");
		// 결과 출력
		
	} // 프로그램 종료

}
