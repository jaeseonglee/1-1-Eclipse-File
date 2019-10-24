/* �й�: 20165153 �̸� : ���缺  �ǽ� 13���� 
 * �ǽ� 1. ������ ���� 1���� �迭�� ������ �� �ִ� MyArray Ŭ������ �ۼ��ϰ� �迭�� ���� �޼��带 �ۼ��Ͻÿ�. 
 */
import java.io.*;
public class MyArray {
	private int [] arr; // �迭 ���� , ���� ����
	private int index; // index ���� , ���� ����
	public int length; // length ���� 
	
	public MyArray() { // ������ MyArrary , �迭�� ���� 10���� ����, length�� 10���� �ʱ�ȭ
		arr = new int[10];
		length = 10;
	}
	public MyArray(int size) { // size�� �־����� ����� ������ MyArray 
		arr = new int[size];
		length = size;
	}
	public int getSize() { // length�� ����
		return length;
	}
	public boolean isEmpty() {  // index�� ���� ���� true, false ����
		if (index == 0) {
			return true;
		} else {
			return false;
		}
	}
	public boolean isFull() { // index �� length�� ���� �񱳿� ���� true�� false ����
		if (index == length) {
			return true;
		} else if (index < length) {
			return false;
		}
		return false;
	}
	public int getTop() { // index �� ����
		return index;
	}
	public void printArray() { // �迭�� ����ϴ� printArray �޼ҵ�
		System.out.print("�迭 : ");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public void insertArray(int value) { 
		if( isFull() == false ) {
			arr[index++] = value;
		} else {
			System.out.print("�迭�� �� �̻� �Է��� �� �����ϴ�.");
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
	public void clearArray() {  // index�� 0���� �ʱ�ȭ�ϰ�  �ݺ������� �迭�� ��� ���Ҹ� 0���� �ʱ�ȭ�ϴ� �޼ҵ�
		index =0;
		for (int i=0; i<arr.length; i++) {
			arr[i] = 0;
		}
	}
	public void sortArray(int aord) { // aord�� 1�̸� ���� ����, 2�� ������������ ���� 
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
