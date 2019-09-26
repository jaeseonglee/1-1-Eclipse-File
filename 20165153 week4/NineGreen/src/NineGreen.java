/* 9. 10000보다 작은 정수를 입력받아서 이것을 천의자리, 백의 자리 , 십의자리 ,
 * 일의자리로 분리하여 출력하는 프로그램을 작성하시오. 
 */

import java.util.Scanner;

public class NineGreen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int number;
        int thousand;
        int hundred;
		int ten;
		int one;
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		number = input.nextInt();
		thousand = number / 1000;
		number = number % 1000;
		hundred = number / 100;
		number = number % 100;
		ten = number/ 10;
		number = number % 10;
		one = number;
		
		System.out.println("천의 자리 : " + thousand);
		System.out.println("백의 자리 : " + hundred );
		System.out.println("십의 자리 : " + ten );
		System.out.println("일의 자리 : " + one );
	}

}
