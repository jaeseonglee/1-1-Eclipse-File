/* 실습 8 . 다음 제시된 클래스를 작성하시오. 
 * 사용자로부터 키와 몸무게를 입력받아 표준 체중을 계산한 후 비만도를 계산하고 비만 정도에 따라 비만여부를 출력하는 클래스를 작성하고
 * 아래 코드로 테스트하시오. 표준체중과 비만도의 계산식은 다음과 같아.
 * 표준체중 = (키 -100) *0.9  
 * 비만도 =(몸무게 -표준체중) / 표준체중 *100 
 * 
 * 비만도 : -20 미만 -> 저체중
 * 비만도 : -20~20 -> 정상
 * 비만도 : 20~30 -> 경도비만
 * 비만도 : 30~50 -> 중증 비만
 * 비만도 : 50 이상 -> 고도비만
 */
import java.io.*;
import java.util.Scanner;
public class Obesity {
	
	private double height; // 키 좌표 변수 ,정보은닉
	private double weight; // 몸무게 좌표 변수 , 정보 은닉
	private double bmi; // 비만도 좌표 변수 , 정보 은닉
	private double standardWeight; // 표준체중 좌표 변수 , 정보 은닉
	
	Scanner input = new Scanner(System.in); // Scanner 를 통해 키와 몸무게 입력받을 준비
	
	public double getHeight() { // 키 좌표 접근 메서드
		return height;
	}
	public double getWeight() { // 몸무게 좌표 접근 메서드
		return weight;
	}
	public double getBmi() { // 비만도 좌표 접근 메서드 
		return bmi;
	}
	public double grtStandardWeight() { // 표준체중 좌표 접근 메서드
		return standardWeight;
	}
	public void setHeight(double h) { // 키 좌표 수정 메서드
		System.out.print("당신의 키 : "); // 키보드로부터 키 입력받기
		h = input.nextDouble();
		height = h;
	}
	public void setWeight(double w) { // 몸무게 좌표 수정 메서드
		System.out.print("당신의 몸무게 : "); // 키보드로부터 몸무게 입력받기
		w = input.nextDouble();
		weight = w;
	}
	public void calcStandardWeight() { // 표준 체중 계산
		standardWeight = (height - 100) * 0.9;
	}
	public double calcBmi() { // 비만도 계산 및 결과 리턴
		bmi = (weight - standardWeight) / standardWeight * 100;
		return bmi;
	}
	public String printBmi() { // 비만정도에 따라 문자열로 비만도 리턴
		if ( bmi < -20) {
			return "저체중";
		} else if ( bmi < 20 ) {
			return "정상";
		} else if ( bmi < 30) {
			return "경도비만";
		} else if ( bmi < 50) {
			return "중증 비만";
		} else if (50 <= bmi ) {
			return "고도비만";
		} // 조건문에 따라 비만도 리턴
		return "비만도";
	}
	
	

}
