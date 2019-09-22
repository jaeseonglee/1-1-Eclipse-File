
import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int r;
         double area = 0.0;
         Scanner in = new Scanner(System.in);
         System.out.print("반지름을 입력하세요 : ");
         
         r = in.nextInt();
         
        
         area = r * r * 3.14;
         
         System.out.println("반지름 " + r + "를 가지는 원의 면적은 " + area + "입니다.");
         
		
		
		
	}

}
