import java.util.Scanner;
public class AccountTest {
	public static void main(String [] args) { //프로그램 시작
		String word; // 변수 입력
		Scanner input = new Scanner(System.in);
		
		Account [] acc = new Account[5]; // 객체 5개를 저장하는 배열 생성
		acc[0] = new Account("1111111111111" , "김 씨" , "A은행");
		acc[1] = new Account("2222222222222" , "이 씨" , "B은행", 10000);
		acc[2] = new Account("3333333333333" , "박 씨" , "A은행", 50000, -10000);
		acc[3] = new Account("4444444444444" , "최 씨" , "B은행", 30000, true);
		acc[4] = new Account("5555555555555" , "정 씨" , "A은행", 80000, false);
		
		for (int i =0; i<acc.length; i++) { // 객체들의 정보 출력
			System.out.println(acc[i].getAccountInfo());
		}
		acc[4].changeInternetBanking(); // 객체들의  boolean 멤버 변수를 바꾸기 (?)
		acc[1].changeDebitCard();
		acc[3].changeMinusAccount();
		
		System.out.println(acc[1].isDebitCard()); // 메소드의 조건에 따라 멤버변수들의 boolean 값 출력
		System.out.println(acc[0].isInternaetBankig());
		System.out.println(acc[2].isMinusAccount());
		System.out.println(acc[2].equals(acc[2]));
		System.out.println(acc[3].equals(acc[4]));
		
		System.out.println("박 씨의 마이너스 통장 취소여부를 결정해주세요 (y or n) : "); 
		word = input.next();
		switch (word) { // 입력받은 값에 따라 switch문을 통해 출력
		case "y" :
			System.out.println("박 씨의 현재 잔액은 "+ acc[3].deposit(10000));
			break;
		default :
			break;
		}
		System.out.println("정 씨의 마이너스 통장 신청 여부를 결정해주세요 (y or n) : ");
		word = input.next();
		switch(word) { // 입력받은 값에 따라 switch문을 통해 출력
		case "y" :
			System.out.println("정 씨의 현재 잔액은 " + acc[4].withdraw(60000));
			break;
		default :
			break;
		}
		System.out.println();
		for (int i =0; i<acc.length; i++) { // 객체들의 계좌에 대한 모든 정보를 반복 출력
			System.out.println(acc[i].toString());
		}
	} // 프로그램 종료

}
