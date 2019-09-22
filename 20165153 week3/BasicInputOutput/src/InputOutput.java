/*
 * 기본 입출력 예제 클래스. Scanner라는 클래스를 이용해서 
 * 키보드로 부터 정수를 입력받아  모니터로 출력하는 프로그램
 * 작성자 : 이재성
 * 최종편집일 : 3.16
 * 소스 참고는 가능하나 복사는 하지 말것 
 * 
 * 
 */
import java.util.Scanner;

public class InputOutput {

	public static void main(String[] args) {
		// 주의 : 들여쓰기 잊지 말것
		
		// 변수 - 값을 가지고
		int width; // 너비를 입력할 변수
		int area; // 너비 * 너비
		Scanner in = new Scanner(System.in);
		
		System.out.print("너비를 입력하세요( 단 정수 ):");
		
		width = in.nextInt();
		
		// 처리- 연산 , 제어(조건 , 반복) , 명령
		area = width * width;
		
		// 출력 - 값으로 출력 , 모니터 출력 , 파일 ....
		
		System.out.println("너비가" + width +"인 박스의 면적"+ area);
      
		
		
	}

}
