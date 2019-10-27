import java.util.GregorianCalendar;
public class EmployeeTest {
	public static void main(String [] args) { // ���α׷� ����
		Employee em1 = new Employee("e001" ,"�� ��"); // ��ü ����
		Employee em2 = new Employee("e002" ,"�� ��", "p001");
		Employee em3 = new Employee("m033" ,"�� ��", "m001" , new GregorianCalendar(2015,5-1,1) ,500000);
		Employee em4 = new Employee("d055" ,"�� ��", "s011" ,new GregorianCalendar(2010, 4-1, 25) ,1000000);
		Employee em5 = new Employee("m099" ,"�� ��", "p033" ,new GregorianCalendar(2008, 11-1, 7) ,500000);
		
		System.out.println(em1.toString()); // �� ��ü�� ������ ���
		System.out.println(em2.toString());
		System.out.println(em3.toString());
		System.out.println(em4.toString());
		System.out.println(em5.toString());
		
		System.out.println(em1.equals(em2));  // ��ü������ �̸��� ����� �������� �Ǵ��ϴ� equals
		System.out.println(em1.equals(em1));
		
		em1.changeDept("e011"); // ����� ���� em1 ��ü�� ������ �ڵ�� ����
		System.out.println(em1.toString()); // em1 ��ü ���
	System.out.println(em5.getDirectorCount());  // �ش� ���� �ο��� ���
		System.out.println(em3.getEmpoloyeeCount());  // �ش� ���� �ο��� ���
		System.out.println(em1.getManagerCount());  // �ش� ���� �ο��� ���
		
	}  // ���α׷� ���� 

}
