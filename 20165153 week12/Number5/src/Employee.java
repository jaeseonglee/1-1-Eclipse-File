// �ǽ� 5. ������ ��Ÿ���� Employee Ŭ������ �ۼ��Ͻÿ�. 
public class Employee {
	private String name; // �̸� ���� , ���� ����
	private int pay;  // �޿� ���� , ���� ����
	private String telNo; // ��ȭ��ȣ ���� ��������
	
	public String getName() {
		return name;
	}
	public int getPay() {
		return pay;
	}
	public String getTelNo() {
		return telNo;
	}
	public void setName(String name) {
		name = name;
	}
	public void setPay(int pay) {
		pay = pay;
	}
	public void setTelNo(String telno) {
		telNo = telno;
	}
	public int calcIncome() { // ������ ����Ͽ� ��ȯ�ϴ� �޼��� 
		return pay * 12;
	}
	public void setData(int money , String tel) {
		pay = money;
		telNo = tel;
	}
	public void setData(String tel , int money) {
		telNo = tel;
		pay = money;
	}
	public void setData(int money) {
		pay = money;
	}
	public void setData(String tel) {
		telNo = tel;
	}
	public String toString() { // �̸� , �޿�, ��ȭ��ȣ , ������ ���ڿ��� ����ϴ� �޼���
		return "�̸�: "+name+ " �޿�: " +pay+" ��ȭ��ȣ: "+telNo+" ����: " +pay*12;
	}
	public void display(String name , int pay, String telNo) { // �̸�, �޿�, ��ȭ��ȣ�� ����ϴ� display �޼���
		this.name = name;
		this.pay =pay;
		this.telNo = telNo;
		System.out.println("�̸�: "+this.name+ " �޿�: " +this.pay+" ��ȭ��ȣ: "+this.telNo);
	}
	
	
}
