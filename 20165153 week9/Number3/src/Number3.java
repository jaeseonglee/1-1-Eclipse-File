// �ǽ� 3. ������ ���� ������ 2���� �迭�� �����ϰ� �ʱ�ȭ�ϰ� ����� ���� printTwoDim�޼��带 ����� �� �޼��带 �̿��� ����Ͻÿ�. 
public class Number3 {
	public static void main(String [] args) { //���α׷� ����
		int [][] arr ={
				{4,2,1,2,3,4,5,6,7,8},
				{1,2,4,3,5,2,6,7,8,9},
				{3,2,4,5,2,3,4,5,3,1}
		};  // 2���� �迭 ���� �� �ʱ�ȭ 
		
		printTwoDim(arr); // �޼��� ȣ��
	}
	
	public static void printTwoDim(int[][] arr) { // ����� ���� �޼���
		for(int i=0; i<arr.length;i++) {
			for(int n=0; n<arr[i].length; n++) {
				System.out.print(i+"�� "+n+"�� :" +arr[i][n]+" ");
			} // ��ø �ݺ������� 2���� �迭 ���
			System.out.println(); 
		}
	} // ���α׷�  ����

}
