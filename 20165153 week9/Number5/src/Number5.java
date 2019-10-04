// 실습5. 프로젝트 : TwoDimArrayEx.java
public class Number5 {
	public static void main(String[] args) { //프로그램 시작
// 1)다음의 값을 가지는 2차원 배열을 선언하고 초기화 하시오.
		int [][] arr = {
				{4,2,1,2,3,4,5,6,7,8},
				{1,2,4,3,5,2,6,7,8,9},
				{3,2,4,5,2,3,4,5,3,1}
		}; // 2차원 배열 선언 및 초기화
// 2) 배열에 대해 각 행의 합을 저장하기 위한 배열을 선언하고 배열을 선언하고 배열의 각 행의 합을 구하시오.
		//(필요한 배열 : 데이터를 저장할 2차원 배열, 행  단위 합계를 저장할 1차원 배열, 열 단위 합계를 저장할 1차원 배열)
		int [][] another =arr; // 또다른 2차원 배열 선언
		int [] rowSum = new int [3]; // 행 단위 합계를 저장할 1차원 배열
		int [] colSum = new int [10]; // 열 단위 합계를 저장할 1차원 배열
		
		for (int i=0; i<another.length; i++) {
			for (int n=0; n<another[i].length; n++) {
				System.out.print(another[i][n]+"  ");
				rowSum[i] += another[i][n]; 
				colSum[n] += another[i][n];
			} //중첩 반복문을 통해 값 저장
			System.out.print(" "+rowSum[i]); // 행 단위 합계 배열 출력
			System.out.println();
		}
		for(int m=0; m<colSum.length; m++) {
			if(colSum[m]>=10) {
				System.out.print(colSum[m]+" ");
			} else {
				System.out.print(colSum[m]+"  ");
			}
		} // for문을 통해 열 단위 합계 배열 출력
	} // 프로그램 종료

}
