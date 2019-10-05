
public class StudentEx {
	public static void main(String [] args) {
		Student st = new Student(); // 객체 생성
		
		st.setStudentNo("20165199");
		st.setStudntName("김 씨");
		st.setGrade(1);
		st.setDept("컴퓨터공학과"); //첫번째 학생 개체
		
		System.out.println(st.toString()); //객체 변수값 출력
		
		st.moveTo("20165198", "이 씨", 1, "컴퓨터공학과"); // 두번째 학생 개체
		
		System.out.println(st.toString()); // 객체 변수값 출력
		
		st.moveTo("20165197", "박 씨", 1, "컴퓨터공학과"); // 세번째 학생 개체
		
		System.out.println(st); // 객체 변수값 출력
		
	}

}
