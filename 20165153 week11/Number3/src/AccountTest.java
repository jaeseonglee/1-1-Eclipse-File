import java.util.Scanner;
public class AccountTest {
	public static void main(String [] args) { // ���α׷� ����
		int money; // ���� �Է�
		Account acc1 = new Account(); // acc1 ��ü ����
		Account acc2 = new Account(); // acc2 ��ü ����
		Scanner input = new Scanner(System.in);
		
		acc1.setAccountNo("123456789"); // acc1 ��ü�� ����
		acc1.setOwner("�� ���� �� ��");
		acc1.setBalance(10000);
		
		acc2.setAccountNo("987654321"); // acc2 ��ü�� ����
		acc2.setOwner("�� ���� �� ��");
		acc2.setBalance(100000);
		
		System.out.println(acc1.toString());
		System.out.println(acc2.toString()); // acc1, acc2 ���� ���
		
		System.out.print("�� ���� �达 ������ ���� �ܾ׿� �Ա��Ͻ� �ݾ��� �Է����ּ��� : ");
		money = input.nextInt();
		acc1.deposit(money);
		System.out.print("�� ���� �达 ������ �����ܾ׿��� ����Ͻ� �ݾ��� �Է����ּ��� : ");
		money = input.nextInt();
		acc1.withdraw(money); // acc1 ��ü�� ���� ����� ó��
		System.out.print("�� ���� �̾� ������ ���� �ܾ׿� �Ա��Ͻ� �ݾ��� �Է����ּ��� : ");
		money = input.nextInt();
		acc2.deposit(money);
		System.out.print("�� ���� �̾� ������ �����ܾ׿��� ����Ͻ� �ݾ��� �Է����ּ��� : ");
		money = input.nextInt();
		acc2.withdraw(money); // acc2 ��ü�� ���� ����� ó��
		
		System.out.println(acc1.toString());
		System.out.println(acc2.toString()); // acc1, acc2 �� ���� ���� ���
		
		
	} // ���α׷� ���� 

}
