
public class EmployeeTest {
	public static void main (String [] args) { // ���α׷� ����
		Employee eArr[] = new Employee[5]; // ��ü ����
		eArr[0] = new Employee();
		eArr[1] = new Employee();
		eArr[2] = new Employee();
		eArr[3] = new Employee();
		eArr[4] = new Employee();
		System.out.println("��� ���� : "); // ��� ���� ���
		eArr[0].display("�� ��" , 1000000 , "010-0000-0000");
		eArr[1].display("�� ��" , 2000000 , "010-1111-1111");
		eArr[2].display("�� ��" , 1500000 , "010-2222-2222");
		eArr[3].display("�� ��" , 3000000 , "010-3333-3333");
		eArr[4].display("�� ��" , 5000000 , "010-4444-4444");
		
		eArr[0].setData(1234567); // �޿��� ���Ƿ� ����
		eArr[1].setData(1111111);
		eArr[2].setData(9876543);
		eArr[3].setData(1212121);
		eArr[4].setData(3434343);
		
		System.out.println();
		for ( int i =0; i<eArr.length; i++) {
			System.out.println(eArr[i].toString());
		} // toString �޼���� �̸�,�޿�,��ȭ��ȣ,���� ���
		System.out.println();
		for (int n = 0; n <eArr.length; n++) {
			System.out.println(eArr[n].getName()+"�� �޿��� "+eArr[n].getPay() +" �Դϴ�." );
		} // ������� �ٲ� �޿� ��� 
		System.out.println();
		
		eArr[0].setData(1353113, "010-7856-3515"); // setData�� ������ �� ����
		eArr[1].setData("010-2135-4332", 1351313);
		eArr[2].setData(7531361);
		eArr[3].setData("010-8863-1254");
		eArr[4].setData(1258357, "010-7856-3695");
		
		for (int m = 0; m <eArr.length; m++) {
			System.out.println(eArr[m].toString());
		} // ������� setData �� ���� �ٲ� ���� ��� 
	} // ���α׷� ���� 

}
