
import java.util.Scanner;

public class Eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int value;
        long result;
        
        Scanner inputValue = new Scanner(System.in);
        System.out.print("x 의 값을 입력하세요 : ");
        value = inputValue.nextInt();
        
        result = 3 * value * value * value - 7 * value * value + 9;
        System.out.println("다항식 3x^3 - 7x^2 + 9에서 x의 값이 "
        		+ value + "일 때 다항식의 값은 " + result + "입니다");
		
		
		
	}

}
