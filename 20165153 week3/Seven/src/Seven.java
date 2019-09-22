

import java.util.Scanner;


public class Seven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 필요한 변수를 선언하시오.
		//길이 , 너비 , 높이 , 부피
		int length;
		int width;
		int height;
		int volume; 
		Scanner inputValue = new Scanner(System.in);
		Scanner apple = new Scanner(System.in);
		Scanner bomb = new Scanner(System.in);
		System.out.print("상자의 길이를 입력하시오 : ");
		length = inputValue.nextInt();
		System.out.print("상자의 너비를 입력하시오 : ");
		width = apple.nextInt();
		System.out.print("상자의 높이를 입력하시오 : ");
		
		height = bomb.nextInt();
		volume = length * width * height;
		System.out.println(" 상자의 부피는 " + volume + "입니다.");
			
		
	}

}
