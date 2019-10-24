
public class ArrayTest {
	public static void main(String [] args) { // 프로그램 시작
		MyArray my = new MyArray(); // 객체 생성
		MyArray my1 = new MyArray(5); // 객체 생성
		
		if(my.isEmpty())  {
			System.out.println("비어있음"); 
		}
		System.out.println("index와 length가  같은 값인가 : " + my.isFull());
		
		my.insertArray(10); // 배열에 값 넣기
		my.insertArray(30);
		my.insertArray(50);
		my.insertArray(40);
		my.insertArray(15);
		my.insertArray(25);
		my.insertArray(35);
		my.insertArray(5);
		my.insertArray(63);
		my.insertArray(16);
		my.printArray(); // 배열 출력
		System.out.println();
		
		if(my.isEmpty()) {
			System.out.println("비어있음");
		} else {
			System.out.println("값이 있음, 개수 : " +my.getTop());
		} // 배열의 유무에 따라 출력
		
		my.sortArray(1); // 배열을 오름차순으로 정렬
		my.printArray(); // 배열 출력
		
		System.out.println();
		System.out.println(my.getArray(3)); // 배열의 index[3]에 있는 값 출력
		System.out.println(my.getArray(9)); // 배열의 index[9]에 있는 값 출력
		System.out.println(my.getArray(10)); // 배열의 index[10]에 있는 값 출력 , 없으면 -1 출력
		System.out.println(my.findArray(15)); // 배열에 15라는 값이 있으면 index출력
		System.out.println(my.findArray(33)); // 배열에 33이라는 값이 있으면 index출력 ,없으면 -1 출력
		
		my.sortArray(2); // 배열을 내림차순으로 정렬
		my.printArray(); // 배열 출력
		System.out.println();
		my.clearArray(); // 배열의 index와 length를 모두 0으로 초기화
		my.printArray(); // 배열 출력 
		
		System.out.println();
		System.out.println();

		my1.insertArray(10); // 배열에 값 넣기
		my1.insertArray(30);
		my1.insertArray(25);
		my1.insertArray(23);
		System.out.println("배열의 길이 : " + my1.getSize());
		my1.printArray(); // 배열 출력
		System.out.println();
		
		if(my1.isEmpty()) {
			System.out.println("비어있음");
		} else {
			System.out.println("값이 있음, 개수 : " +my1.getTop());
		} // 배열의 유무에 따라 출력
		
		my1.sortArray(1); // 배열을 오름차순으로 정렬
		my1.printArray(); // 배열 출력
		
		System.out.println();
		System.out.println(my1.getArray(1)); // 배열의 index[3]에 있는 값 출력
		System.out.println(my1.getArray(5)); // 배열의 index[9]에 있는 값 출력
		
		System.out.println(my1.findArray(10)); // 배열에 15라는 값이 있으면 index출력
		System.out.println(my1.findArray(50)); // 배열에 33이라는 값이 있으면 index출력 ,없으면 -1 출력
		
		my1.sortArray(2); // 배열을 내림차순으로 정렬
		my1.printArray(); // 배열 출력
		System.out.println();
		my1.clearArray(); // 배열의 index와 length를 모두 0으로 초기화
		my1.printArray(); // 배열 출력
		
	} // 프로그램 종료

}
