// 실습 2. 다음과 같은 배열이 있을 때 값을 오름차순으로 정렬하는 프로그램을 작성하시오.
public class Number2 {
	public static void main(String [] args) { // 프로그램 시작
		int min,number; // 변수 선언
		int [] arr = {5,10,3,4,1,8,7,6,9,2}; // 배열 선언 및 초기화
		
		System.out.print("처음의 배열 : ");
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j] +" ");
		} // 처음의 배열 출력
		
		for (int i=0; i<arr.length-1;i++) {
			min =i;
			for (int n=i+1; n<arr.length; n++) {
				if (arr[min] > arr[n]) {
					min=n;
				} 
			}
			number= arr[min];
			arr[min]=arr[i];
			arr[i]=number;
		} // 중첩 반복문을 통해 배열을 오름차순으로 정렬
		
	    System.out.println();
		System.out.print("오름차순으로 정렬한 배열 : ");
		for (int m=0; m<arr.length;m++) {
			System.out.print(arr[m]+" ");
		} // 오름차순으로 정렬한 배열 출력
		
	} // 프로그램 종료

}
