
public class BoxTest {
	public static void main(String [] args ) {
		Box box1 = new Box(); // 객체 생성
		Box box2 = new Box(); // 객체 생성
		
		box1.setWidth(10); // box1의 가로,세로,높이를 가각 10,10,10으로 설정
		box1.setLength(10);
		box1.setHeight(10);
		
		box2.setWidth(5); // box2의 가로,세로,높이를 가각 5,5,5로 설정
		box2.setLength(5);
		box2.setHeight(5);
		
		System.out.println(box1.getVolume()); // box1 부피 출력
		System.out.println(box2.getVolume()); // box2 부피 출력
		System.out.println(box1.toString()); // box1의 정보 출력
		System.out.println(box2); // box2의 정보 출력
		
		
	}

}
