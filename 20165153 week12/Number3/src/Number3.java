/* 실습 3. 다음의 정수를 가지는 2차원 배열을 선언하고 사용자로부터 입력된 값이 배열의
 * 어느 첨자에 있는지를 출력하는 프로그램을 작성하시오.
 */
import java.util.Scanner;
public class Number3 {
	public static void main(String [] args) { // 프로그램 시작
		int number; // 변수 선언
		int [][] num = {
				{1,5,7,8,4,10,15,78,45,33},
				{99,2,6,9,3,66,55,12,11,13}
		}; // 2타원 배열 선언
		
		Scanner input = new Scanner(System.in);
		System.out.print("배열 : num[][] = { ");
		for(int i=0; i<num.length; i++) {
			System.out.print("{");
			for (int n =0; n<num[i].length; n++) {
				System.out.print(num[i][n]+" ");
			}
			System.out.print("} ");
		}
		System.out.println("}"); // 2차원 배열 전체를 출력
		System.out.print("찾고자하는 값을 입력해주세요 : ");
		number = input.nextInt(); // 사용로부터 찾고자하는 값 입력받기
		
		for (int i=0; i<num.length; i++) {
			for (int n =0; n<num[i].length; n++) {
				if (number == num[i][n]) {
					System.out.println("찾는 값은 배열 [" + i + "][" + n +"] 에 위치합니다.");
					break; // 입력받은 값을 찾았다면 출력
				} 
			}
		} // 중첩 반복문을 통해 입력받은 값 출력
	} // 프로그램 종료 

}
