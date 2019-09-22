

import java.util.Scanner;

public class Ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int pyeong;
        double result;
        
        Scanner inputValue = new Scanner(System.in);
        System.out.print("평수를 입력하세요 : ");
        
        pyeong = inputValue.nextInt();
        result = (double) pyeong * 3.3;
        System.out.printf("입력값 " + pyeong + "평은 " + result + "평방미터입니다. ");
        
      
        
		
	}

}
