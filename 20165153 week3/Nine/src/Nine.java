

import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int C;
        double F;
        
        Scanner inputValue = new Scanner(System.in);
        System.out.print("�����µ��� �Է��ϼ��� : ");
        C = inputValue.nextInt();
        
        F = (double) 32 + (C * 180.0/100.0);
		
        System.out.println("ȭ���µ��� " + F + " �Դϴ�.");
        
		
	}

}
