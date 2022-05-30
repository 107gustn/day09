package day09;

public class MainClass02 {//첫번재 글자는 대문자, 중간에 합쳐지는 글자도 대문자
	public static void main(String[] args) {
		TestClass02 t01 = new TestClass02(); //클래스형태 객체(참조형변수)
		System.out.println("main 시작");
		t01.test(); //메소드 호출을 하면 해당 메소드 지역으로 이동
		System.out.println("main 종료");
	}

}
