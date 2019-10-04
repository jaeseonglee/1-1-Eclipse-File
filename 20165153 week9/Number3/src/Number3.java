// 실습 3. 다음의 값을 가지는 2차원 배열을 선언하고 초기화하고 출력을 위한 printTwoDim메서드를 만들고 이 메서드를 이용해 출력하시오. 
public class Number3 {
	public static void main(String [] args) { //프로그램 시작
		int [][] arr ={
				{4,2,1,2,3,4,5,6,7,8},
				{1,2,4,3,5,2,6,7,8,9},
				{3,2,4,5,2,3,4,5,3,1}
		};  // 2차원 배열 선언 및 초기화 
		
		printTwoDim(arr); // 메서드 호출
	}
	
	public static void printTwoDim(int[][] arr) { // 출력을 위한 메서드
		for(int i=0; i<arr.length;i++) {
			for(int n=0; n<arr[i].length; n++) {
				System.out.print(i+"행 "+n+"열 :" +arr[i][n]+" ");
			} // 중첩 반복문으로 2차원 배열 출력
			System.out.println(); 
		}
	} // 프로그램  종료

}
