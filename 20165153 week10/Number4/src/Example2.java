
public class Example2 {
	public static void main(String [] args) {
		Coord2 crd = new Coord2(); // 객체 생성
		
		crd.setPos_x(10); 
		crd.setPos_y(20);
		
		System.out.println("X:" + crd.getPos_x()+" Y:"+ crd.getPos_y() ); // 객체 변수 값 출력
	}

}
