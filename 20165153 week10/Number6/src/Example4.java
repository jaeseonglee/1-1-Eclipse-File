
public class Example4 {
	public static void main(String [] args) {
		Coord4 crd = new Coord4(); // 객체 생성
		
		crd.setPos_x(10);
		crd.setPos_y(20);
		
		System.out.println( crd.toString() ); // 객체 변수값 출력
		
		crd.moveTo(20, 30); // 좌표 이동?
		
		System.out.println( crd ); // 객체 변수값 출력
	}

}
