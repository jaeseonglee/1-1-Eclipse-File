/* 실습 4. 1부터 50까지 숫자를 for문으로 출력하되 if 문을 이용 3의 배수 또는 5의 배수는 *로 출력하시오. 
 * 
 * 출력 : 1 2 * 4 * * 7 8 * * 11 *.............49 *
 */
public class Number4 {
	public static void main(String[] args) { // 프로그램 시작
		int i; // 변수 입력
		
		System.out.print("출력 : ");
		
		for (i=1; i<=50; i++) {
			if ( i % 3 == 0 || i % 5 == 0 ) {
				System.out.print("* ");
			} else {
				System.out.print(i +" ");
			} // if문에 따른 i 출력
		} // for문에 따른 반복 
	}// 프로그램 종료

}
