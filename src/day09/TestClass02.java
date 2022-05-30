package day09;

public class TestClass02 {
//  접근제한자 반환타입 메소드 명(매개변수(argument))
	public   void  test   (     ) {//기능에 부합하는 이름으로 설정해준다.
		test2();
		System.out.println("test 메소드 실행");
	}
	public   void  test1   (     ) {
		System.out.println("test1 메소드 실행");
	} //메소드가 끝나면 메소드를 호출했던 지역으로 다시 이동
	public   void  test2   (     ) {
		test1();
		System.out.println("test2 메소드 실행");
	}

}
