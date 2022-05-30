package day09;

import test.Member; //import: 내 프로젝트에 기능을 가지고 올때 사용

//클래스 객체 메소드
//반복적으로 사용이 된다면 클래스(틀)를 만들어서 사용한다.
//클래스 - 하나의 자료형
//클래스 형태 = 객체
/*
접근 제한자
- public : 클래스 내부, 외부에서 접근 가능
- private : 클래스 내부에서만 접근 가능 , 외부접근 허용하지 않음
- protected : 상속받은 자식 또는 내부에서 접근 가능
- default : 같은 패키지 안에서 접근 가능
*/
//( 메소드 ) = 기능, 클래스가 있는 기능 = 메소드, 클래스가 없는 기능 = 함수
public class MainClass01 {
	public static void main(String[] args) {
		Member m = new Member();
		m.name = "홍길동";
		
		
		TestClass01 t = new TestClass01(); //TestClass01(자료형) t(변수)
		t.name = "홍길동"; //. : 멤버접근 연산자
		t.age = 20;
		System.out.println(t.name + t.age);
		
		
	}
}
