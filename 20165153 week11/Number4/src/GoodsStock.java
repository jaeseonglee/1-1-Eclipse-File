// 실습 4. 상품재고를 관리하는 GoodsStock 클래스를 작성하시오. 
import java.io.*;
public class GoodsStock {
	private String goodsName; // 상품명 변수 입력 , 정보은닉
	private int stockNumber; //재고수량 변수 입력 , 정보은닉
	
	public String getGoodsName() { // 상품명 접근 메서드
		return goodsName;
	}
	public int getStockNumber() { // 재고수량 접근 메서드
		return stockNumber;
	}
	public void setGoodsName(String a) { // 상품명 수정 메서드
		goodsName = a;
	}
	public void setStocNumber(int a) { // 재고수량 수정 메서드
		stockNumber = a;
	}
	public String toString() { // 정보를 출력하는 toString 메서드
		return "상품명: " + goodsName + " 재고수량: " +stockNumber; 
	}
	public int releaseStock(int rel) { // 재고수량에서 일정량을 출고하기 위한 releaseStock 메서드
		if (rel > stockNumber) {
			System.out.println("출고량이 재고량보다 많습니다. "); // 출고량이 재고량보다 작은 경우만 출고하도록 제어
		} else {
			stockNumber -= rel;
		}
		return stockNumber;
	}
	
}
