// �ǽ� 3. ���� ���õ� Ŭ������ �ۼ��Ͻÿ� (Account)
import java.io.*;
public class Account {
	private String accountNo; // ���¹�ȣ ���� �Է� , ��������
	private String owner; // ������ �����Է� , ��������
	private int balance; // �����ܾ� ���� �Է� , ��������
	
	public String getAccountNo() { // ���¹�ȣ ���� �޼���
		return accountNo;
	}
	public String getOwner() { // ������ ���� �޼���
		return owner;
	}
	public int getBalance() { // �����ܾ� ���� �޼���
		return balance;
	}
	public void setAccountNo(String a) { // ���¹�ȣ ���� �޼��� 
		accountNo = a;
	}
	public void setOwner(String a) { // ������ ���� �޼��� 
		owner = a;
	}
	public void setBalance(int a) { // �����ܾ� ���� �޼���
		balance = a;
	}
	public String toString() { // ���������� ���ڿ��� �����ϴ� toString �޼���
		return "���¹�ȣ: " +accountNo+" ������: "+owner + " �����ܾ�: "+balance;
	}
	public int deposit(int money) { // �����ܾ׿� �Ա��ϴ� �޼���
		if (money < 0 ) {
			System.out.println("���̳ʽ� �ݾ��� �Աݵ��� �ʽ��ϴ�."); // ���̳ʽ� �ݾ��� �Աݵ��� �ʵ��� ����
		} else {
			balance += money;
		}
		return balance;
	}
	public int withdraw (int money) { // �����ܾ׿� ����ϴ� �޼���
		if (money <0 ) {
			System.out.println("���̳ʽ� �ݾ��� ��ݵ��� �ʽ��ϴ�.");  // ���̳ʽ� �ݾ��� ��ݵ��� �ʵ��� ����
		} else if (balance < money){
			System.out.println("����ϰ��� �ϴ� �ݾ��� �����ܾ׺��� ũ�� ������ ��ݵ��� �ʽ��ϴ�. "); 
			// ��ݱݾ��� �����ܾ׺��� ũ�� ��ݵ��� �ʵ��� ����
		} else {
			balance -= money;
		}
		return balance;
	}
	
	

}
