/* 6. ���� �־��� ������ ���迬��� ���������� ����� ����ϴ� ���α׷���  �ۼ��Ͻÿ�.
 * �� �� �ʿ��� ������ ����� ������ �����ؼ� ����Ͻÿ�.
 */

import java.util.Scanner;

public class SixRing {

	public static void main(String[] args) {//���α׷� ����
		// TODO Auto-generated method stub
        final int M = 1; // ���� �Է�
		final int W = 2;
		int married;
		int age,gender;
		int computer,english,math,sum;
		double average;
		int not;
		int year;
		int num7;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("��ȥ�̽Ű���? (�´ٸ� 1, �ƴ϶�� 2) : "); //1��
	    married = input.nextInt();
	    System.out.println("1. ��ȥ�ΰ� " + (married == M) + " " );
		
		System.out.print("���̸� �Է����ּ��� : "); // 2��
		age = input.nextInt();
		System.out.print("������ �Է����ּ��� (���ڸ� 1 , ���ڸ� 2) : ");
		gender = input.nextInt();
		System.out.println("2. ���̰� 19�� �̻��̰� �����ΰ� " +  ( ( age >= 19 ) && ( gender == M ) ) + " " );
		
		
		System.out.print("��ǻ�� ������ �Է����ּ��� : "); //3,4,5��
		computer = input.nextInt();
		System.out.print("���� ������ �Է����ּ��� : ");
		english = input.nextInt();
	    System.out.print("���� ������ �Է����ּ��� : ");
	    math =input.nextInt();
	    System.out.print("�Ἦ ȹ���� �Է����ּ��� : ");
		not = input.nextInt();
	    
		
		System.out.println("3. ��ǻ�Ϳ� ���� �׸��� ���� ��ΰ� 90�� �̻��ΰ� " 
	    + ( ( (computer>=90) && (english >=90) ) && (math >= 90) )+ " ");
		
		average = (computer + english + math) /3 ;
		sum = computer + english + math;
		System.out.println("4.������ 200�� �̻��̰ų� ����� 60�� �̻��ΰ� " + ( (sum >= 200) || (average>=60) ) + " ");
	
		System.out.println("5.������ 60�� �̸��̰ų� �Ἦȹ���� 4�� �̻��ΰ� " + ( ( (computer < 60) || (english < 60) || (math < 60)) || (not >= 4) ) + " ");            
		
		
		System.out.print("������ ������ �Է����ּ��� : "); //6��
		year = input.nextInt();
		System.out.println("6.������ �⵵�� �����ΰ� " + ( (year % 4) ==0) + " ");
		
		
		System.out.print("���ڸ� �Է����ּ��� : "); //7,8��
		
		num7  = input.nextInt();
		System.out.println("7.�Էµ� ���ڰ� ¦���ΰ� " + (num7 % 2 == 0) + " " );
		System.out.print("8.�Էµ� ���ڰ� 3�� 5�� ������ΰ� " + ( ( (num7 % 3) == 0 ) && (num7%5) == 0) + " " );    
        // ��� ó�� �� ��� 
	} //���α׷� ����

}
