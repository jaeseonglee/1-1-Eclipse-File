
import java.util.Scanner;

public class Eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int value;
        long result;
        
        Scanner inputValue = new Scanner(System.in);
        System.out.print("x �� ���� �Է��ϼ��� : ");
        value = inputValue.nextInt();
        
        result = 3 * value * value * value - 7 * value * value + 9;
        System.out.println("���׽� 3x^3 - 7x^2 + 9���� x�� ���� "
        		+ value + "�� �� ���׽��� ���� " + result + "�Դϴ�");
		
		
		
	}

}
