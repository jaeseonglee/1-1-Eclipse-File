// �ǽ�7. ������ ��� ������ ������ Student Ŭ������ �ۼ��Ͻÿ�.
import java.io.*;
public class Student {
	
	private String studentNo; // �й� ��ǥ ���� , ��������
	private String studentName; // �̸� ��ǥ ���� , ��������
	private int grade; // �г� ��ǥ ���� , ��������
	private String dept; // �а� ��ǥ ���� , ��������
	
	public String getStudentNo() { // �й� ��ǥ ���� �޼���
		return studentNo;
	}
	public String getStudentName() {  // �̸� ��ǥ ���� �޼���
		return studentName;
	}
	public int getGrade() { // �г� ��ǥ ���� �޼���
		return grade;
	}
	public String getDept() { // �а� ��ǥ ���� �޼���
		return dept;
	}
	public void setStudentNo(String a) {  // �й� ��ǥ ���� �޼���
		studentNo = a;
	}
	public void setStudntName(String a) { // �̸� ��ǥ ���� �޼���
		studentName = a;
	}
	public void setGrade(int a) { // �г� ��ǥ ���� �޼���
		grade = a;
	}
	public void setDept(String a) { // �а� ��ǥ ���� �޼���
		dept = a;
	}
	public String toString() { // �л������� ����� toString �޼���
		return "�й�: " + studentNo + " �̸�: " + studentName + " �г�: " +grade +" �а�: " +dept;
	}
	public void moveTo(String a , String b , int c , String d) {
		studentNo = a;
		studentName = b;
		grade = c;
		dept = d;
	}

}
