import java.util.Scanner;
public class StockTest {
	public static void main(String [] args) { // 프로그램 시작
		String goods; // 변수 입력
		int number;
		Scanner input = new Scanner(System.in);
		
		GoodsStock goods1 = new GoodsStock(); // goods1 객체 생성
		GoodsStock goods2 = new GoodsStock(); // goods2 객체 생성
		
		goods1.setGoodsName("상품A");
		goods1.setStocNumber(10);  // goods1 객체에 지정
		
		goods2.setGoodsName("상품B");
		goods2.setStocNumber(20); // goods2 객체에 지정
		
		System.out.println(goods1.toString()); // goods1,goods2 객체 정보 출력
		System.out.println(goods2.toString());
		
		if (goods1.getStockNumber() < goods2.getStockNumber() ) {
			System.out.println("상품재고가 더 많은 상품의 정보 -> "+goods2.toString());
		} else {
			System.out.println("재고가 더 많은 상품의 정보 -> "+goods1.toString());
		} // 재고가 더 많은 상품의 정보 출력
		
		System.out.println("어떤 상품의 재고를 출고하시겠습니까 (예시 : 상품A 또는 상품B): ");
		goods = input.next(); // 둘 중 하나의 상춤에 대해 출고할 것인지 입력받기
		
		switch(goods) {
		case "상품A" :
			System.out.print("얼마만큼 출고하시겠습니까 : ");
			number = input.nextInt(); // 출고할 수 입력받기
			goods1.releaseStock(number); // releaseStock메서드를 통해 출고
			System.out.println(goods1.toString()); // 출고 이후 상품 정보 출력
			break;
			
		case "상품B" :
			System.out.print("얼마만큼 출고하시겠습니까 : ");
			number = input.nextInt(); // 출고할 수 입력받기
			goods2.releaseStock(number); // releaseStock메서드를 통해 출고
			System.out.println(goods2.toString()); //출고 이후 상품 정보 출력
			break;
			
		default :
			System.out.println("메뉴선택오류"); // 상품A 또는 상품B라고 입력되지 않았다면 출력
			break;
		}
		
	} // 프로그램 종료 

}
