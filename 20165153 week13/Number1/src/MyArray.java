/* 학번: 20165153 이름 : 이재성  실습 13주차 
 * 실습 1. 다음과 같이 1차원 배열을 저장할 수 있는 MyArray 클래스를 작성하고 배열에 대한 메서드를 작성하시오. 
 */
import java.io.*;
public class MyArray {
	private int [] arr; // 배열 변수 , 정보 은닉
	private int index; // index 변수 , 정보 은닉
	public int length; // length 변수 
	
	public MyArray() { // 생성자 MyArrary , 배열을 개본 10개로 생성, length는 10으로 초기화
		arr = new int[10];
		length = 10;
	}
	public MyArray(int size) { // size가 주어지는 경우의 생성자 MyArray 
		arr = new int[size];
		length = size;
	}
	public int getSize() { // length를 리턴
		return length;
	}
	public boolean isEmpty() {  // index의 값에 따라 true, false 리턴
		if (index == 0) {
			return true;
		} else {
			return false;
		}
	}
	public boolean isFull() { // index 와 length의 값의 비교에 따라 true와 false 리턴
		if (index == length) {
			return true;
		} else if (index < length) {
			return false;
		}
		return false;
	}
	public int getTop() { // index 값 리턴
		return index;
	}
	public void printArray() { // 배열을 출력하는 printArray 메소드
		System.out.print("배열 : ");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public void insertArray(int value) { 
		if( isFull() == false ) {
			arr[index++] = value;
		} else {
			System.out.print("배열에 더 이상 입력할 수 없습니다.");
		}
	}
	public int getArray(int index) { 
		if ( isEmpty() == false) {
			if(this.index >index) {
				return arr[index];
			} 
		}
		return -1;
	}
	public void clearArray() {  // index를 0으로 초기화하고  반복문으로 배열의 모든 원소를 0으로 초기화하는 메소드
		index =0;
		for (int i=0; i<arr.length; i++) {
			arr[i] = 0;
		}
	}
	public void sortArray(int aord) { // aord가 1이면 오름 차순, 2면 내림차순으로 정렬 
		if(aord ==1) {
			for(int i=0; i<arr.length-1; i++) {
				int min =i;
				for (int n=i+1; n<arr.length; n++) {
					if( arr[min] > arr[n] ) {
						min = n;
					}
					int num;
					num = arr[min];
					arr[min] = arr[i];
					arr[i] = num;
				}
			}
		} else if (aord == 2) {
			for (int i=0; i<arr.length-1; i++) {
				int max =i;
				for (int n=i+1; n<arr.length; n++) {
					if (arr[max] < arr[n] ) {
						max = n;
					}
					int num;
					num = arr[max];
					arr[max] = arr[i];
					arr[i] = num;
				}
			}
		}
	}
	public int findArray(int key) {
		for (int i=0; i<arr.length; i++) {
			if (key == arr[i]) {
				return i;
			}
		}
		return -1;
	}
}
