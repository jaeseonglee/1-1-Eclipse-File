
public class StudentEx {
	public static void main(String [] args) {
		Student st = new Student(); // ��ü ����
		
		st.setStudentNo("20165199");
		st.setStudntName("�� ��");
		st.setGrade(1);
		st.setDept("��ǻ�Ͱ��а�"); //ù��° �л� ��ü
		
		System.out.println(st.toString()); //��ü ������ ���
		
		st.moveTo("20165198", "�� ��", 1, "��ǻ�Ͱ��а�"); // �ι�° �л� ��ü
		
		System.out.println(st.toString()); // ��ü ������ ���
		
		st.moveTo("20165197", "�� ��", 1, "��ǻ�Ͱ��а�"); // ����° �л� ��ü
		
		System.out.println(st); // ��ü ������ ���
		
	}

}
