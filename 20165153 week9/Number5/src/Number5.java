// �ǽ�5. ������Ʈ : TwoDimArrayEx.java
public class Number5 {
	public static void main(String[] args) { //���α׷� ����
// 1)������ ���� ������ 2���� �迭�� �����ϰ� �ʱ�ȭ �Ͻÿ�.
		int [][] arr = {
				{4,2,1,2,3,4,5,6,7,8},
				{1,2,4,3,5,2,6,7,8,9},
				{3,2,4,5,2,3,4,5,3,1}
		}; // 2���� �迭 ���� �� �ʱ�ȭ
// 2) �迭�� ���� �� ���� ���� �����ϱ� ���� �迭�� �����ϰ� �迭�� �����ϰ� �迭�� �� ���� ���� ���Ͻÿ�.
		//(�ʿ��� �迭 : �����͸� ������ 2���� �迭, ��  ���� �հ踦 ������ 1���� �迭, �� ���� �հ踦 ������ 1���� �迭)
		int [][] another =arr; // �Ǵٸ� 2���� �迭 ����
		int [] rowSum = new int [3]; // �� ���� �հ踦 ������ 1���� �迭
		int [] colSum = new int [10]; // �� ���� �հ踦 ������ 1���� �迭
		
		for (int i=0; i<another.length; i++) {
			for (int n=0; n<another[i].length; n++) {
				System.out.print(another[i][n]+"  ");
				rowSum[i] += another[i][n]; 
				colSum[n] += another[i][n];
			} //��ø �ݺ����� ���� �� ����
			System.out.print(" "+rowSum[i]); // �� ���� �հ� �迭 ���
			System.out.println();
		}
		for(int m=0; m<colSum.length; m++) {
			if(colSum[m]>=10) {
				System.out.print(colSum[m]+" ");
			} else {
				System.out.print(colSum[m]+"  ");
			}
		} // for���� ���� �� ���� �հ� �迭 ���
	} // ���α׷� ����

}
