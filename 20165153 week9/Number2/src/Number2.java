/* 실습 2 . main 메서드에서 다음의 값을 가지는 1차원 배열을 선언과 동시에 초기화하고 출력을 위한 printOneDim메서드를
 * 만들고 이 메서드를 이용해 출력하시오.
 */

import java.util.Scanner;

public class Number2 {
// 1) 배열을 선언하고 초기화하시오.
	public static void printOneDim(int[] arr) {
		for(int i=0;i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		} // for문을 통해 배열 출력
		System.out.println();
	}
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,8,9,10}; // 배열 선언 및 초기화
		int value;
		
		printOneDim(arr); // 메서드 호출 
		value = find(arr);
		sumArray(arr);
	}
// 2) 키보드로부터 정수를 입력받아 배열에서 검색하고 배열 내의 위치를 출력하시오.
	public static int find(int[] arr) {
		int number; // 변수 선언
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		number = input.nextInt(); // 키보드로부터 정수 입력받기
		
		for (int i=0; i<arr.length;i++) {
			if (number == arr[i]) {
				System.out.println("입력하신 정수의 위치는 [" + i +"] 입니다. ");
				return i; // i를 반환하면서 종료
			} // if문을 통해 입력받은 정수의 위치를 찾는다면 출력
		}
		return -1; // for문이 끝나면 -1 값을 반환하면서 종료
	}
// 3) 1차원 배열의 합을 계산해주는 sumArray 메서드를 작성하시오.
	public static void sumArray(int [] arr) {
		int sum=0; // 변수 선언 
		for(int i =0; i< arr.length; i++) {
			sum +=arr[i]; // 배열의 합 계산
		}
		System.out.print("1차원 배열의 합은 "+sum+" 입니다.");
	} // 배열의 합 출력
}
