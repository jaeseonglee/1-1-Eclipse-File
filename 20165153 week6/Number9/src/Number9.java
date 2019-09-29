// 실습 9. 다음과 같은 구구단을 출력하는 프로그램을 작성하시오.

public class Number9 {
	public static void main(String[] args) { // 프로그램 시작
		
		for (int i=1; i<=9; i++) {
			for (int n=2;n<=9;n++) {
				if (n*i<10) {
					System.out.print(n+"*"+i+ "=" + n*i+"  ");
				} else {
					System.out.print(n+"*"+i+ "=" + n*i+" ");
				} // if문을 통한 출력, 보는데 편하기위해 한자리수인 경우 두칸,두자리수인경우 한칸의 띄어쓰기를 더한 출력
			} //중첩 for문을 통한 출력 
			System.out.println(); 
		} //프로그램 종료 
	}

}
