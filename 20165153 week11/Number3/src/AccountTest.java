import java.util.Scanner;
public class AccountTest {
	public static void main(String [] args) { // 프로그램 시작
		int money; // 변수 입력
		Account acc1 = new Account(); // acc1 객체 생성
		Account acc2 = new Account(); // acc2 객체 생성
		Scanner input = new Scanner(System.in);
		
		acc1.setAccountNo("123456789"); // acc1 객체에 지정
		acc1.setOwner("돈 없는 김 씨");
		acc1.setBalance(10000);
		
		acc2.setAccountNo("987654321"); // acc2 객체에 지정
		acc2.setOwner("돈 많은 이 씨");
		acc2.setBalance(100000);
		
		System.out.println(acc1.toString());
		System.out.println(acc2.toString()); // acc1, acc2 정보 출력
		
		System.out.print("돈 없는 김씨 계좌의 예금 잔액에 입금하실 금액을 입력해주세요 : ");
		money = input.nextInt();
		acc1.deposit(money);
		System.out.print("돈 없는 김씨 계좌의 예금잔액에서 출금하실 금액을 입력해주세요 : ");
		money = input.nextInt();
		acc1.withdraw(money); // acc1 객체에 대해 입출금 처리
		System.out.print("돈 많은 이씨 계좌의 예금 잔액에 입금하실 금액을 입력해주세요 : ");
		money = input.nextInt();
		acc2.deposit(money);
		System.out.print("돈 많은 이씨 계좌의 예금잔액에서 출금하실 금액을 입력해주세요 : ");
		money = input.nextInt();
		acc2.withdraw(money); // acc2 객체에 대해 입출금 처리
		
		System.out.println(acc1.toString());
		System.out.println(acc2.toString()); // acc1, acc2 에 대한 정보 출력
		
		
	} // 프로그램 종료 

}
