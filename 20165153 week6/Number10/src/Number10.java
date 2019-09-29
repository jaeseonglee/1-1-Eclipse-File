// 실습 10. 다음의 수식을 계산하는 프로그램을 작성하시오. (단일 for문 사용)

public class Number10 {
	public static void main(String[] args) { // 프로그램 시작
		int sum, result=0;
		
		for (int i=1; i<=30; i++) {
			sum= i*i +1;
			result = result +sum;
		} // for문을 통해 식 계산
		System.out.print("수식의 결과는 " +result);
		// 결과 출력
	} // 프로그램 종료

}
