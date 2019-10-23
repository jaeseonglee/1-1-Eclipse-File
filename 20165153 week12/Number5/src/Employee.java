// 실습 5. 직원을 나타내는 Employee 클래스를 작성하시오. 
public class Employee {
	private String name; // 이름 변수 , 정보 은닉
	private int pay;  // 급여 변수 , 정보 은닉
	private String telNo; // 전화번호 변수 정보은닉
	
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
	public int calcIncome() { // 연봉을 계산하여 반환하는 메서드 
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
	public String toString() { // 이름 , 급여, 전화번호 , 연봉을 문자열로 출력하는 메서드
		return "이름: "+name+ " 급여: " +pay+" 전화번호: "+telNo+" 연봉: " +pay*12;
	}
	public void display(String name , int pay, String telNo) { // 이름, 급여, 전화번호를 출력하는 display 메서드
		this.name = name;
		this.pay =pay;
		this.telNo = telNo;
		System.out.println("이름: "+this.name+ " 급여: " +this.pay+" 전화번호: "+this.telNo);
	}
	
	
}
