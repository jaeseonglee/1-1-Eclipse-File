

import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int C;
        double F;
        
        Scanner inputValue = new Scanner(System.in);
        System.out.print("섭씨온도를 입력하세요 : ");
        C = inputValue.nextInt();
        
        F = (double) 32 + (C * 180.0/100.0);
		
        System.out.println("화씨온도는 " + F + " 입니다.");
        
		
	}

}
