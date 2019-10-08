// 실습 3. 다음 제시된 클래스를 작성하시오 (Account)
import java.io.*;
public class Account {
	private String accountNo; // 계좌번호 변수 입력 , 정보은닉
	private String owner; // 예금자 변수입력 , 정보은닉
	private int balance; // 예금잔액 변수 입력 , 정보은닉
	
	public String getAccountNo() { // 계좌번호 접근 메서드
		return accountNo;
	}
	public String getOwner() { // 예금자 접근 메서드
		return owner;
	}
	public int getBalance() { // 예금잔액 접근 메서드
		return balance;
	}
	public void setAccountNo(String a) { // 계좌번호 수정 메서드 
		accountNo = a;
	}
	public void setOwner(String a) { // 예금자 수정 메서드 
		owner = a;
	}
	public void setBalance(int a) { // 예금잔액 수정 메서드
		balance = a;
	}
	public String toString() { // 계좌정보를 문자열로 리턴하는 toString 메서드
		return "계좌번호: " +accountNo+" 예금자: "+owner + " 예금잔액: "+balance;
	}
	public int deposit(int money) { // 예금잔액에 입금하는 메서드
		if (money < 0 ) {
			System.out.println("마이너스 금액은 입금되지 않습니다."); // 마이너스 금액은 입금되지 않도록 제어
		} else {
			balance += money;
		}
		return balance;
	}
	public int withdraw (int money) { // 예금잔액에 출금하는 메서드
		if (money <0 ) {
			System.out.println("마이너스 금액은 출금되지 않습니다.");  // 마이너스 금액은 출금되지 않도록 제어
		} else if (balance < money){
			System.out.println("출금하고자 하는 금액이 예금잔액보다 크기 때문에 출금되지 않습니다. "); 
			// 출금금액이 예금잔액보다 크면 출금되지 않도록 제어
		} else {
			balance -= money;
		}
		return balance;
	}
	
	

}
