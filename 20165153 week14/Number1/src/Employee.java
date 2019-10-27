/* �й� : 20165153  �̸�  : ���缺 �ǽ� 14����
 *  �ǽ� 1. ������ ���� ��������� ������ �� �ִ� Employee Ŭ������ �ۼ��ϰ� 
 *  ��������� ���� ó�� �޼��带 �ۼ��Ͻÿ�. (������ static ���) 
 */
import java.util.GregorianCalendar;
public class Employee {
	private String identificationNumber; // ��� ���� , ��������
	private String name; // �̸� ���� , ��������
	private String dept; // �μ� ���� , ��������
	private GregorianCalendar join;  // �Ի��� ���� , ��������
	private int annualIncome;  // ���� ���� , ��������
	private int extraPay; //  ���� ���� , ��������
	private static int employeeCount;  
	private static int managerCount;
	private static int directorCount;
	
	public Employee (String identificationNumber , String name ) { // ������ (���,�̸�)
		this.identificationNumber = identificationNumber;
		this.name = name;
		this.join = new GregorianCalendar();
		if(extraPay ==0) {
			employeeCount++;
		} else if (extraPay ==500000) {
			managerCount++;
		} else if (extraPay ==1000000) {
			directorCount++;
		}
	}
	public Employee (String identificationNumber , String name , String dept ) { // ������ (���,�̸�,�μ�)
		this.identificationNumber = identificationNumber;
		this.name = name;
		this.dept = dept;
		this.join = new GregorianCalendar();
		if(extraPay ==0) {
			employeeCount++;
		} else if (extraPay ==500000) {
			managerCount++;
		} else if (extraPay ==1000000) {
			directorCount++;
		}
	}
	public Employee (String identificationNumber , String name , String dept ,GregorianCalendar join ) { //������ (���,�̸�,�μ�,�Ի���)
		this.identificationNumber = identificationNumber;
		this.name = name;
		this.dept = dept;
		this.join = join;
		if(extraPay ==0) {
			employeeCount++;
		} else if (extraPay ==500000) {
			managerCount++;
		} else if (extraPay ==1000000) {
			directorCount++;
		}
	}
	public Employee (String identificationNumber , String name , String dept ,GregorianCalendar join ,int extraPay ) { // ������ (���,�̸�,�μ�,�Ի���,����)
		this.identificationNumber = identificationNumber;
		this.name = name;
		this.dept = dept;
		this.join = join;
		this.extraPay = extraPay;
		if(extraPay ==0) {
			employeeCount++;
		} else if (extraPay ==500000) {
			managerCount++;
		} else if (extraPay ==1000000) {
			directorCount++;
		}
	}
	public String toString() { // ���,�̸�,�μ��ڵ�,�Ի糯¥,���� �׸��� ���ڿ��� �����ϴ� �޼ҵ�
		return "���: " + identificationNumber +" �̸�: " + name +" �μ��ڵ� : " + dept +" �Ի糯¥: " +join.getTime() +" ����: " + extraPay*12 ;
	}
	public boolean equals(Employee o ) {  // ����� �̸��� ������ ���ϴ� equals �޼ҵ�
		if(this.identificationNumber.equals(o.identificationNumber) && this.name.equals(o.name) ) {
			return true;
		} else {
			return false;
		}
	}
	public void changeDept(String newDept) { // �μ��ڵ带 ������ �μ��ڵ�� �����ϴ� �޼ҵ�
		dept = newDept;
	}
	public static int getEmpoloyeeCount() { // �ش� ���� �ο����� �����ϴ� �޼ҵ�
		return employeeCount;
	}
	public static int getManagerCount() { // �ش� ���� �ο����� �����ϴ� �޼ҵ�
		return managerCount;
	}
	public static int getDirectorCount() { // �ش� ���� �ο����� �����ϴ� �޼ҵ�
		return directorCount;
	}
}
