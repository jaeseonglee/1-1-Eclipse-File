import java.util.Scanner;
public class ObesityTest {
	public static void main (String [] args) { //프로그램 시작
		double bmi; // 변수 선언
		Obesity ob =new Obesity(); //객체 생성
		ob.setHeight(0); // 객체변수에 Scanner로 키 입력받은 값을 할당?
		ob.setWeight(0); // 객체변수에 Scanner로 몸무게 입력받은 값을 할당?
		ob.calcStandardWeight();
		bmi = ob.calcBmi(); // 문자열로 비만도를 리턴받은 값 저장?
		System.out.println("비만도는 " + bmi+" 로 " +ob.printBmi() + "입니다."); //비만도 및 비만도에 따른 비만정도 출력
	} // 프로그램 종료

}
