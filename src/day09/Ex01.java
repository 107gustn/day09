package day09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*
		set
		- 순서를 유지하지 않는다.
		- 중복된 값은 허용하지 않음
		*/
		ArrayList arr = new ArrayList();
		arr.add("홍길동");
		arr.add("홍길동");
		System.out.println("arr : " + arr);
		
		//set : 중복된 값은 허용하지 않는다. 순서를 유지하지 않아서 인덱스로 접근이 불가
		HashSet hs = new HashSet();
		hs.add("홍길동");
		hs.add("김개똥");
		hs.add("홍길동");
		System.out.println(hs.remove("홍길동")); //삭제가 제대로 되면 true 값이 나온다.
		System.out.println("hs : " + hs);
		
		hs.add("홍길동");
		//순서가 없어서 get으로 인덱스 접근이 불가
		System.out.println();
		
		//it=[bof ,'홍길동', '홍길동', eof] //iterator(반복자): 제일 맨 앞의 값엔 bof(시작점), 제일 맨 뒤의 값엔 eof(끝점: 데이터가 없음)가 들어간다.
		//    it -hasNext()
		//           it -next(),hasNext()
		//                    it -next()
		Iterator it = arr.iterator(); //it 변수에는 arr의 값이 순차적으로 저장
		while(it.hasNext() == true) {
			System.out.println(it.next());
		}
		/*
		System.out.println( it.hasNext() ); //it의 위치에서 다음값이 존재하는지 여부
		System.out.println( it.next() ); //next를 만나면 it가 다음위치로 이동하여 값을 꺼내옴
		
		System.out.println( it.hasNext() );
		System.out.println( it.next() );
		
		System.out.println( it.hasNext() ); //false가 나오면 다음값이 없으므로 next 사용이 불가능하다.
		System.out.println( it.next() );
		*/
		System.out.println();
		
		it = hs.iterator();
		while(it.hasNext()) {
			Object s = it.next(); //next()가 Object타입이여서 저장하기 위해 Object 타입으로 받아준다.
			String st = (String)s; //형 변환 - 서로 타입이 다를때 형 변환을 통해 타입을 동일하게 변경해서 저장//String 타입으로 형변환
			System.out.println( s );
		}
		// ( 메소드 ) : 특수한 기능을 가지고있다. 저장하고자 하는 값에 대한 타입을 지정해줘야한다.
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next(); //기능을 쓰고 그 결과를 변수에 저장하기 위해서는 기능에서 알려주는 해당 타입으로 저장해준다.
		System.out.println(s1);
		
	}

}
