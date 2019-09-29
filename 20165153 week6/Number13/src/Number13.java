/* 실습 13. 1900년부터 2015년 까지 중 윤년에 해당하는 년도만 출력하도록 프로그램을 작성하시오.
 * -윤년은 년도를 4로 나눈 나머지가 0이면서 100으로 나눈 나머지가 0이 아니거나 400으로 나눈 나머지가 0인 년도이다.
 */
public class Number13 {
	public static void main(String[] args) { // 프로그램 시작
		int year; // 변수 입력
		
		for(year=1900; year<=2015; year++) {
			if ( ( (year%4==0)&& (year%100 !=0) ) || (year%400==0) ) {
				System.out.print(year +" ");
			} // if문을 통해 윤년 확인 및 출력
			
		} // for문을 통해 반복 
		
	} // 프로그램 종료 

}
