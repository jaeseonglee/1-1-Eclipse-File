import java.util.Scanner;
public class AccountTest {
	public static void main(String [] args) { //���α׷� ����
		String word; // ���� �Է�
		Scanner input = new Scanner(System.in);
		
		Account [] acc = new Account[5]; // ��ü 5���� �����ϴ� �迭 ����
		acc[0] = new Account("1111111111111" , "�� ��" , "A����");
		acc[1] = new Account("2222222222222" , "�� ��" , "B����", 10000);
		acc[2] = new Account("3333333333333" , "�� ��" , "A����", 50000, -10000);
		acc[3] = new Account("4444444444444" , "�� ��" , "B����", 30000, true);
		acc[4] = new Account("5555555555555" , "�� ��" , "A����", 80000, false);
		
		for (int i =0; i<acc.length; i++) { // ��ü���� ���� ���
			System.out.println(acc[i].getAccountInfo());
		}
		acc[4].changeInternetBanking(); // ��ü����  boolean ��� ������ �ٲٱ� (?)
		acc[1].changeDebitCard();
		acc[3].changeMinusAccount();
		
		System.out.println(acc[1].isDebitCard()); // �޼ҵ��� ���ǿ� ���� ����������� boolean �� ���
		System.out.println(acc[0].isInternaetBankig());
		System.out.println(acc[2].isMinusAccount());
		System.out.println(acc[2].equals(acc[2]));
		System.out.println(acc[3].equals(acc[4]));
		
		System.out.println("�� ���� ���̳ʽ� ���� ��ҿ��θ� �������ּ��� (y or n) : "); 
		word = input.next();
		switch (word) { // �Է¹��� ���� ���� switch���� ���� ���
		case "y" :
			System.out.println("�� ���� ���� �ܾ��� "+ acc[3].deposit(10000));
			break;
		default :
			break;
		}
		System.out.println("�� ���� ���̳ʽ� ���� ��û ���θ� �������ּ��� (y or n) : ");
		word = input.next();
		switch(word) { // �Է¹��� ���� ���� switch���� ���� ���
		case "y" :
			System.out.println("�� ���� ���� �ܾ��� " + acc[4].withdraw(60000));
			break;
		default :
			break;
		}
		System.out.println();
		for (int i =0; i<acc.length; i++) { // ��ü���� ���¿� ���� ��� ������ �ݺ� ���
			System.out.println(acc[i].toString());
		}
	} // ���α׷� ����

}
