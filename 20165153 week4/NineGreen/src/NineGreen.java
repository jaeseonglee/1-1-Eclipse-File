/* 9. 10000���� ���� ������ �Է¹޾Ƽ� �̰��� õ���ڸ�, ���� �ڸ� , �����ڸ� ,
 * �����ڸ��� �и��Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
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
		System.out.print("������ �Է��Ͻÿ� : ");
		number = input.nextInt();
		thousand = number / 1000;
		number = number % 1000;
		hundred = number / 100;
		number = number % 100;
		ten = number/ 10;
		number = number % 10;
		one = number;
		
		System.out.println("õ�� �ڸ� : " + thousand);
		System.out.println("���� �ڸ� : " + hundred );
		System.out.println("���� �ڸ� : " + ten );
		System.out.println("���� �ڸ� : " + one );
	}

}
