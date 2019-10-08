import java.util.Scanner;
public class GuguTest {
	public static void main(String [] args) {
		Gugu dan2 = new Gugu(); // dan2 객체 생성
		int dan; // 구구단의 단을 입력받을 변수 
		
		Scanner input =new Scanner(System.in);
		
		System.out.print("구구단의 단을 입력해주세요 : ");
		dan = input.nextInt(); // 사용자로부터 단 입력받기
		
		dan2.setDan(dan); // 메서드를 통해 입력받은 dan 설정
		dan2.printGugu(); // 입력받은 단 출력
		System.out.println();
		dan2.setDan(8); // 메서드를 통해 8단으로  설정
		dan2.printGugu(); // 8단으로 설정된 단 출력
	}

}
