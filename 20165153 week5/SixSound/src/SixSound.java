/* �ǽ� 6.����ڷκ��� �� ���� ���ڸ� �Է��ϵ��� �Ͽ� ���� ���� ��, ���� ū ��, �հ� �Ǵ� ��� �� ��
 * �ϳ��� �����Ͽ� ����ϴ� �޴���� ���α׷��� ���α׷��� �ۼ��϶�. �޴��� �� ������ ���� �ϳ���
 * �Լ��� �����Ǿ�� �ϴ�. switch ���� ����Ͽ� ��� ����� �ؾ� ������ �����ϵ��� �϶�.
 * ���� ��ȿ���� ���� ������ �ԷµǸ� ���� �޼����� ����϶�. 
 */

import java.util.Scanner;

public class SixSound {
    
	public static void main(String[] arg) { // ���α׷� ����
		int num1 , num2; // ���� �Է� 
		int choice;
		double result;
		
		Scanner input = new Scanner(System.in);
		System.out.print("�� ������ �Է����ּ��� : ");
		num1 = input.nextInt(); 
		num2 = input.nextInt(); // ����ڷκ��� �� ���� �Է¹ޱ� 
		
		System.out.println("�޴�");
		System.out.println("1. ���� ��");
		System.out.println("2. ū ��");
		System.out.println("3. �հ�");
		System.out.println("4. ���");
		System.out.println("5. ����");
		System.out.print("�޴��� �����ϼ��� : ");
		choice = input.nextInt(); // �޴� ��� �� ����ڷκ��� �޴��� ������ �Է¹ޱ�
		
		switch(choice){
		  case 1 : if (num1 < num2){
			          result = num1;
			          System.out.print("��� : " + result);
		          } else {
		        	  result = num2;
		        	  System.out.print("��� : " + result);
		          } break;
		  case 2 : if (num1 < num2) {
                       result = num2;
                       System.out.print("��� : " + result);
                  } else {
        	           result = num1;
        	           System.out.print("��� : " + result);
                  } break;
		  case 3 : 
			      result = num1 + num2;
			      System.out.print("��� : " + result);
		          break;
		  case 4 : 
			      result = (num1 + num2) / 2.0;
			      System.out.print("��� : " + result);
			      break;
		  case 5 :
			      System.out.print("��� : ����");
			      break;
	      default :
	    	  System.out.print("��� : �޴����ÿ���");
		} // switch���� ���� ������ ����� ��� 
		
	} // ���α׷� ����
}
 