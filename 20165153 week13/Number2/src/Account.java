// �ǽ� 2. ���� ���� Ŭ����
import java.io.*;
public class Account {
	private String accountNo; // ���¹�ȣ ���� , ���� ����
	private String depositor; // ������ ���� , ���� ����
	private String bankName; // ����� ���� , ���� ����
	private int balance; // �ܾ� ���� , ���� ����
	private int minusLimit; // ���̳ʽ� �ѵ� ���� , ���� ����
	private boolean internetBanking; // ���ͳ� ��ŷ ����, ���� ����
	private boolean debitCard; // ����ī�� ����, ���� ����
	private boolean minusAccount; // ���̳ʽ� ���� , ���� ����
	
	public Account(String accountNo, String depositor, String bankName) { // ������ ���¹�ȣ,������,�����̸�
		this.accountNo = accountNo;
		this.depositor = depositor;
		this.bankName = bankName;
		minusAccount = false; 
	}
	public Account(String accountNo, String depositor, String bankName, int balance) {// ������ ���¹�ȣ,������,�����̸�,�ܾ�
		this.accountNo = accountNo;
		this.depositor = depositor;
		this.bankName = bankName;
		this.balance = balance;
		minusAccount = false;
	}
	public Account(String accountNo, String depositor, String bankName, int balance , int minusLimit) {// ������ ���¹�ȣ,������,�����̸�,�ܾ�,���̳ʽ��ѵ�
		this.accountNo = accountNo;
		this.depositor = depositor;
		this.bankName = bankName;
		this.balance = balance;
		this.minusLimit = minusLimit;
		minusAccount = true; 
	}
	public Account(String accountNo, String depositor, String bankName, int balance, boolean internetBanking) {// ������ ���¹�ȣ,������,�����̸�,�ܾ�,���ͳݹ�ŷ
		this.accountNo = accountNo;
		this.depositor = depositor;
		this.bankName = bankName;
		this.balance = balance;
		this.internetBanking = internetBanking;
		minusAccount = false;
	}
	public String getAccountInfo() { // ���¹�ȣ ,�����ڸ�,������� ���ڿ��� �����ϴ� �޼ҵ�
		return "[���¹�ȣ] : " + this.accountNo +" [������] : " +this.depositor+" [�����] : " + this.bankName;
	}
	public void changeInternetBanking() { // ���ͳ� ��ŷ������ �ٲٴ� �޼ҵ�
		if(internetBanking == true) {
			internetBanking = false;
		} else {
			internetBanking = true;
		}
	}
	public void changeDebitCard() { // ����ī�� ������ �ٲٴ� �޼ҵ�
		if(debitCard == true) {
			debitCard = false;
		} else {
			debitCard = true;
		}
	}
	public void changeMinusAccount() { // ���̳ʽ� ���� ������ �ٲٴ� �޼ҵ�
		if(minusAccount == true) {
			if ( balance >= 0) {
				minusAccount = false;
			} else {
				System.out.println("����! : �ܾ��� �����մϴ�. ");
			}
		} else {
			if(balance ==0) {
				minusLimit = 1000;
			} else {
				minusLimit = balance * 10;
			}
		}
		
	}
	public boolean isInternaetBankig() {
		return internetBanking;
	}
	public boolean isDebitCard() {
		return debitCard;
	}
	public boolean isMinusAccount() {
		return minusAccount;
	}
	public int deposit(int money) { // �Ա� ���� �޼ҵ�
		if (money >=0) {
			balance += money;
			if (balance >0) {
				minusAccount = false;
				minusLimit = 0;
			}
		} 
		return balance;
	}
	public int withdraw(int money) { // ��� ���� �޼ҵ�
		if (money >= 0 ) {
			if(minusAccount == true) {
				if(balance + minusLimit - money > 0 ) {
					balance -= money;
				}
			} else {
				if(balance - money > 0 ) {
					balance -= money;
				} else {
					minusAccount = true;
					minusLimit = balance * 10;
				}
			}
		}
		return balance;
	}
	public String toString() { // ���¿� ���� ��� ������ ���ڿ��� �����ϴ� �޼ҵ�
		return "[���¹�ȣ] : " + this.accountNo +" [������] : " +this.depositor+" [�����] : " + this.bankName 
				+ " [�ܾ�] : "+ this.balance +" [���̳ʽ��ѵ�] : "+ this.minusLimit+" [���ͳݹ�ŷ] : "+this.internetBanking
				+" [����ī��] : " +debitCard +" [���̳ʽ� ����] : " +this.minusAccount;
	}
	public boolean equals(Account obj) { // ���¹�ȣ�� ������ ,������� �������� ���ϴ� �޼ҵ�
		if(accountNo.equals(obj.accountNo) && depositor.equals(obj.depositor) && bankName.equals(obj.bankName) ) {
			return true;
		} else {
			return false;
		}
	}
}
