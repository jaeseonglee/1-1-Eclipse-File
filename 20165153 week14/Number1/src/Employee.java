/* 학번 : 20165153  이름  : 이재성 실습 14주차
 *  실습 1. 다음과 같이 사원정보를 저장할 수 있는 Employee 클래스를 작성하고 
 *  멤버변수에 대한 처리 메서드를 작성하시오. (밑줄은 static 멤버) 
 */
import java.util.GregorianCalendar;
public class Employee {
	private String identificationNumber; // 사번 변수 , 정보은닉
	private String name; // 이름 변수 , 정보은닉
	private String dept; // 부서 변수 , 정보은닉
	private GregorianCalendar join;  // 입사일 변수 , 정보은닉
	private int annualIncome;  // 연봉 변수 , 정보은닉
	private int extraPay; //  수당 변수 , 정보은닉
	private static int employeeCount;  
	private static int managerCount;
	private static int directorCount;
	
	public Employee (String identificationNumber , String name ) { // 생성자 (사번,이름)
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
	public Employee (String identificationNumber , String name , String dept ) { // 생성자 (사번,이름,부서)
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
	public Employee (String identificationNumber , String name , String dept ,GregorianCalendar join ) { //생성자 (사번,이름,부서,입사일)
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
	public Employee (String identificationNumber , String name , String dept ,GregorianCalendar join ,int extraPay ) { // 생성자 (사번,이름,부서,입사일,수당)
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
	public String toString() { // 사번,이름,부서코드,입사날짜,연봉 항목을 문자열로 리턴하는 메소드
		return "사번: " + identificationNumber +" 이름: " + name +" 부서코드 : " + dept +" 입사날짜: " +join.getTime() +" 연봉: " + extraPay*12 ;
	}
	public boolean equals(Employee o ) {  // 사번과 이름이 같은지 비교하는 equals 메소드
		if(this.identificationNumber.equals(o.identificationNumber) && this.name.equals(o.name) ) {
			return true;
		} else {
			return false;
		}
	}
	public void changeDept(String newDept) { // 부서코드를 지정한 부서코드로 변경하는 메소드
		dept = newDept;
	}
	public static int getEmpoloyeeCount() { // 해당 직급 인원수를 변경하는 메소드
		return employeeCount;
	}
	public static int getManagerCount() { // 해당 직급 인원수를 변경하는 메소드
		return managerCount;
	}
	public static int getDirectorCount() { // 해당 직급 인원수를 변경하는 메소드
		return directorCount;
	}
}
