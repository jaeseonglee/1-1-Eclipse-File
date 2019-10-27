
public class PixelTest {
	public static void main (String [] args) {
		Point p1 = new Point();   //  객체 생성 - Point 
		Point p2 = new Point(100,100);  //  객체 생성 - Point 
		Pixel pixel1 = new Pixel(); // 객체 생성 - Pixel
		Pixel pixel2 = new Pixel(p2,100,100,100);  // 객체 생성 - Pixel
		Pixel pixel3 = new Pixel(p2,150,150,150);  // 객체 생성 - Pixel
		
		System.out.println(p1.toString());  // 각 객체에 대한 정보 출력 
		System.out.println(p2.toString());
		System.out.println(pixel1.toString());
		System.out.println(pixel2.toString());
		System.out.println(pixel3.toString());
		
		p1.moveBy(200, 200);  // x좌표와 y좌표 이동
		p2.moveBy(-150, 50); // x좌표와 y좌표 이동
		System.out.println();
		System.out.println("p1.x의 좌표 " + p1.getX()); // 현재 x좌표 출력
		System.out.println("p2.y의 좌표 " +p2.getY());  // 현재 y좌표 출력
		System.out.println(p1.toString());  // 바뀐 정보 출력 
		System.out.println(p2.toString());
		System.out.println(p1.equals(p1));  // 객체끼리 같은지 확인
		System.out.println(p1.equals(p2));
		System.out.println("Point 객체가 생성된 횟수 : " + p2.getCount());  // Point count 확인
		
		pixel1.setRGB(123, 231, 132); // pixel1 의 r,g,b를 변경
		System.out.println(pixel1.toString()); // pixel1 정보 출력
		System.out.println("Pixel 객체가 생성된 횟수 : " +pixel3.getCount());  // Pixel count 확인
	} // 프로그램 종료 

}
