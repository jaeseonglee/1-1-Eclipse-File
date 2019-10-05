// 실습7. 다음의 멤버 변수를 가지는 Student 클래스를 작성하시오.
import java.io.*;
public class Student {
	
	private String studentNo; // 학번 좌표 변수 , 정보은닉
	private String studentName; // 이름 좌표 변수 , 정보은닉
	private int grade; // 학년 좌표 변수 , 정보은닉
	private String dept; // 학과 좌표 변수 , 정보은닉
	
	public String getStudentNo() { // 학번 좌표 접근 메서드
		return studentNo;
	}
	public String getStudentName() {  // 이름 좌표 접근 메서드
		return studentName;
	}
	public int getGrade() { // 학년 좌표 접근 메서드
		return grade;
	}
	public String getDept() { // 학과 좌표 접근 메서드
		return dept;
	}
	public void setStudentNo(String a) {  // 학번 좌표 수정 메서드
		studentNo = a;
	}
	public void setStudntName(String a) { // 이름 좌표 수정 메서드
		studentName = a;
	}
	public void setGrade(int a) { // 학년 좌표 수정 메서드
		grade = a;
	}
	public void setDept(String a) { // 학과 좌표 수정 메서드
		dept = a;
	}
	public String toString() { // 학생정보를 출력할 toString 메서드
		return "학번: " + studentNo + " 이름: " + studentName + " 학년: " +grade +" 학과: " +dept;
	}
	public void moveTo(String a , String b , int c , String d) {
		studentNo = a;
		studentName = b;
		grade = c;
		dept = d;
	}

}
