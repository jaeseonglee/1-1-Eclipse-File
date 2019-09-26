/* 5. 다음은 여러 조건을 만족하기 위해 관계연산자와 논리연산자를 사용한 조건식이다.
 * TURE / FALSE로 출력해보시오.
 */

public class FiveCost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i = 3 , j = 3  , k = 5;
        
        System.out.println( "( i <= k ) && ( i >= j ) 조건은 " + ( ( i <= k ) && ( i >= j ) )+" ");
		System.out.println( "( i < k ) || ( k == j ) 조건은 " + ( ( i < k ) || ( k == j ) ) + " ");
		System.out.println( "( i != k) && ( ( i + j ) < k ) 조건은 " + ( ( i != k) && ( ( i + j ) < k ) ) + " ");
		// 조건 처리 및 결과 출력
		
	} // 프로그램 종료

}
