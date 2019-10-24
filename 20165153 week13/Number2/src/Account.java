// 실습 2. 은행 계좌 클래스
import java.io.*;
public class Account {
	private String accountNo; // 계좌번호 변수 , 정보 은닉
	private String depositor; // 예금자 변수 , 정보 은닉
	private String bankName; // 은행명 변수 , 정보 은닉
	private int balance; // 잔액 변수 , 정보 은닉
	private int minusLimit; // 마이너스 한도 변수 , 정보 은닉
	private boolean internetBanking; // 인터넷 뱅킹 변수, 정보 은닉
	private boolean debitCard; // 직불카드 변수, 정보 은닉
	private boolean minusAccount; // 마이너스 변수 , 정보 은닉
	
	public Account(String accountNo, String depositor, String bankName) { // 생성자 계좌번호,예금자,은행이름
		this.accountNo = accountNo;
		this.depositor = depositor;
		this.bankName = bankName;
		minusAccount = false; 
	}
	public Account(String accountNo, String depositor, String bankName, int balance) {// 생성자 계좌번호,예금자,은행이름,잔액
		this.accountNo = accountNo;
		this.depositor = depositor;
		this.bankName = bankName;
		this.balance = balance;
		minusAccount = false;
	}
	public Account(String accountNo, String depositor, String bankName, int balance , int minusLimit) {// 생성자 계좌번호,예금자,은행이름,잔액,마이너스한도
		this.accountNo = accountNo;
		this.depositor = depositor;
		this.bankName = bankName;
		this.balance = balance;
		this.minusLimit = minusLimit;
		minusAccount = true; 
	}
	public Account(String accountNo, String depositor, String bankName, int balance, boolean internetBanking) {// 생성자 계좌번호,예금자,은행이름,잔액,인터넷뱅킹
		this.accountNo = accountNo;
		this.depositor = depositor;
		this.bankName = bankName;
		this.balance = balance;
		this.internetBanking = internetBanking;
		minusAccount = false;
	}
	public String getAccountInfo() { // 계좌번호 ,예금자명,은행명을 문자열로 리턴하는 메소드
		return "[계좌번호] : " + this.accountNo +" [예금자] : " +this.depositor+" [은행명] : " + this.bankName;
	}
	public void changeInternetBanking() { // 인터넷 뱅킹유무를 바꾸는 메소드
		if(internetBanking == true) {
			internetBanking = false;
		} else {
			internetBanking = true;
		}
	}
	public void changeDebitCard() { // 직불카드 유무를 바꾸는 메소드
		if(debitCard == true) {
			debitCard = false;
		} else {
			debitCard = true;
		}
	}
	public void changeMinusAccount() { // 마이너스 통장 유무를 바꾸는 메소드
		if(minusAccount == true) {
			if ( balance >= 0) {
				minusAccount = false;
			} else {
				System.out.println("오류! : 잔액이 부족합니다. ");
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
	public int deposit(int money) { // 입금 여부 메소드
		if (money >=0) {
			balance += money;
			if (balance >0) {
				minusAccount = false;
				minusLimit = 0;
			}
		} 
		return balance;
	}
	public int withdraw(int money) { // 출금 여부 메소드
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
	public String toString() { // 계좌에 대한 모든 정보를 문자열로 리턴하는 메소드
		return "[계좌번호] : " + this.accountNo +" [예금자] : " +this.depositor+" [은행명] : " + this.bankName 
				+ " [잔액] : "+ this.balance +" [마이너스한도] : "+ this.minusLimit+" [인터넷뱅킹] : "+this.internetBanking
				+" [직불카드] : " +debitCard +" [마이너스 통장] : " +this.minusAccount;
	}
	public boolean equals(Account obj) { // 계좌번호와 예금주 ,은행명이 같은지를 비교하는 메소드
		if(accountNo.equals(obj.accountNo) && depositor.equals(obj.depositor) && bankName.equals(obj.bankName) ) {
			return true;
		} else {
			return false;
		}
	}
}
