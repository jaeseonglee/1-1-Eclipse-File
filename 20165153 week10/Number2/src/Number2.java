// �ǽ� 2. ������ ���� �迭�� ���� �� ���� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
public class Number2 {
	public static void main(String [] args) { // ���α׷� ����
		int min,number; // ���� ����
		int [] arr = {5,10,3,4,1,8,7,6,9,2}; // �迭 ���� �� �ʱ�ȭ
		
		System.out.print("ó���� �迭 : ");
		for(int j=0;j<arr.length;j++) {
			System.out.print(arr[j] +" ");
		} // ó���� �迭 ���
		
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
		} // ��ø �ݺ����� ���� �迭�� ������������ ����
		
	    System.out.println();
		System.out.print("������������ ������ �迭 : ");
		for (int m=0; m<arr.length;m++) {
			System.out.print(arr[m]+" ");
		} // ������������ ������ �迭 ���
		
	} // ���α׷� ����

}
