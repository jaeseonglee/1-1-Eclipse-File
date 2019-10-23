/* 학번 : 20165153 이름: 이재성  실습 12주차
 * 실습 1. 다섯 개의 문자열을 저장하는 일차원 배열을 생성한 후 문자열 데이터를 
 * 입력받아 저장한 후 내용을 출력하시오.
 */
import java.util.Scanner;
public class Number1 { // 프로그램 시작
	public static void main(String [] args) {
        String [] arr = new String[5]; // 배열 생성 
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i <arr.length; i++) {
			System.out.println(i+"번째 배열을 입력해주세요 : ");
			arr[i] = input.next(); // 배열의 문자열 데이터를 입력받기
		}
		
		System.out.print("입력 받은 배열은 : ");
		for (String value : arr) {
			System.out.print(value+" "); // 배열 출력
		}
		
	} // 프로그램 종료 
	

}
