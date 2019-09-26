/* 3.키보드로부터 두 수를 입력 받아 관계연산을 수행한 결과를 출력하는 프로그램을 작성하시오.
 */

import java.util.Scanner;

public class ThirdBlue {

	public static void main(String[] args) { // 프로그램 시작
		// TODO Auto-generated method stub
        int first; //변수 입력
        int second;
        
        Scanner input = new Scanner(System.in);
        
		System.out.print("첫 번째 수 입력 : ");
		first = input.nextInt();
		System.out.print("두 번째 수 입력 : ");
		second = input.nextInt(); // 키보드로부터 두 수를 입력받기
		
		System.out.println(first + " < " + second + " 은 " + ( first < second )  + " ");
		System.out.println(first + " > " + second + " 은 " + (first > second) + " ");
        System.out.println(first + " <= " + second + " 은 " + (first <= second) + " ");
        System.out.println(first + " >= " + second + " 은 " + (first >= second) + " ");
        System.out.println(first + " == " + second + " 은 " + (first == second) + " ");
        System.out.println(first + " != " + second + " 은 " + (first != second) + " ");
        System.out.println( "!(" + (first + " != " + second) + ")" + " 은 " + !(first != second) + " ");
        // 결과 출력
		
	}// 프로그램 종료

}
