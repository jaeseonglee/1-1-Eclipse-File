/* 실습 2 . 다음의 값을 가지는 2차원 배열을 선언하고 각 행의 합을 저장하기 위한 배열을 선언하고 
 * 배열의 각 행의 합을 구하고 각 행의 합을 출력하시오.
 */
public class Number2 {
	public static void main(String [] args) { // 프로그램 시작
		int sum; // 배열 합 변수 입력
		int [][] arr = {
				{4,2,1,2,3,4,5,6,7,8},
				{1,2,4,3,5,2,6,7,8,9},
				{3,2,4,5,2,3,4,5,3,1}
		}; // 2차원 배열 선언 
		
		for (int i =0; i<arr.length; i++) {
			sum = 0; // 합을 반복할 때마다 0으로 초기화
			for(int n=0; n< arr[i].length; n++) {
				sum += arr[i][n]; // 배열의 합 계산
			}
			System.out.println("arr[" + i + "] 의 합 : " + sum); // 배열의 합 출력
		} // 반복문을 통해 배열의 각 행의 합 출력
	}

}
