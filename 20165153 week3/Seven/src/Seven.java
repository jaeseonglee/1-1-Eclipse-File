

import java.util.Scanner;


public class Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // �ʿ��� ������ �����Ͻÿ�.
		//���� , �ʺ� , ���� , ����
		int length;
		int width;
		int height;
		int volume; 
		Scanner inputValue = new Scanner(System.in);
		Scanner apple = new Scanner(System.in);
		Scanner bomb = new Scanner(System.in);
		System.out.print("������ ���̸� �Է��Ͻÿ� : ");
		length = inputValue.nextInt();
		System.out.print("������ �ʺ� �Է��Ͻÿ� : ");
		width = apple.nextInt();
		System.out.print("������ ���̸� �Է��Ͻÿ� : ");
		
		height = bomb.nextInt();
		volume = length * width * height;
		System.out.println(" ������ ���Ǵ� " + volume + "�Դϴ�.");
			
		
	}

}
