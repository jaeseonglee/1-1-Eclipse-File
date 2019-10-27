import java.util.GregorianCalendar;
public class EmployeeTest {
	public static void main(String [] args) { // 프로그램 시작
		Employee em1 = new Employee("e001" ,"김 씨"); // 객체 생성
		Employee em2 = new Employee("e002" ,"박 씨", "p001");
		Employee em3 = new Employee("m033" ,"이 씨", "m001" , new GregorianCalendar(2015,5-1,1) ,500000);
		Employee em4 = new Employee("d055" ,"최 씨", "s011" ,new GregorianCalendar(2010, 4-1, 25) ,1000000);
		Employee em5 = new Employee("m099" ,"강 씨", "p033" ,new GregorianCalendar(2008, 11-1, 7) ,500000);
		
		System.out.println(em1.toString()); // 각 객체의 정보를 출력
		System.out.println(em2.toString());
		System.out.println(em3.toString());
		System.out.println(em4.toString());
		System.out.println(em5.toString());
		
		System.out.println(em1.equals(em2));  // 객체끼리의 이름과 사번이 같은지를 판단하는 equals
		System.out.println(em1.equals(em1));
		
		em1.changeDept("e011"); // 사번이 없는 em1 객체에 지정된 코드로 변경
		System.out.println(em1.toString()); // em1 객체 출력
	System.out.println(em5.getDirectorCount());  // 해당 직급 인원수 출력
		System.out.println(em3.getEmpoloyeeCount());  // 해당 직급 인원수 출력
		System.out.println(em1.getManagerCount());  // 해당 직급 인원수 출력
		
	}  // 프로그램 종료 

}
