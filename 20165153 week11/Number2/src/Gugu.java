// 실습 2. 다음 제시된 클래스를 작성하시오. (Gugu)
import java.io.*;
public class Gugu {
	
    private int dan; // 정수형 변수 dan, 정보은닉
	
	public int getDan() { // dan 접근 메서드
		return dan;
	}
	public void setDan(int a) { // dan 수정 메서드
		dan =a;
	}
	public void printGugu() { // dan을 출력하는 메서드
		for (int i =1; i<10; i++) {
			System.out.println(dan +" * "+i +" = "+dan*i); 
		}	
	}

}
