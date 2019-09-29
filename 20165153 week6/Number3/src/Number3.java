/* 실습 3. 1부터 10까지 숫자 중 for문을 이용해 증감식을 변경해서 홀수만 출력하시오. 
 * 출력 : 1 3 5 7 9
 */
public class Number3 {
	public static void main(String[] args) { // 프로그램 시작
		int i; // 변수 입력
		
		System.out.print("출력 : ");
		
		for (i=1; i<10; i++) {
			System.out.print(i+" ");
			i++;
		} // for문에 따른 결과 출력
	} // 프로그램 종료 

}
