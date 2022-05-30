package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		/*
		Map
		- 키와 값으로 하나의 쌍으로 이루어져 있다.
		- 순서는 유지되지 않으며, 키의 중복은 허용하지 않는다. 
		 */
		HashMap map = new HashMap();
		map.put("선풍기", "100만원"); //(키, 값)
		map.put("에어컨", "50만원");
		map.put("자동차", "10만원");
		
		map.put("선풍기", "1000만원"); //키에 대한 중복은 허용하지 않는다.
		System.out.println(map); //키값은 중복되지 않는 값만 처리가 가능하다.
		
		System.out.println( map.get("선풍기") ); //키를 통해서 해당 값을 꺼내온다.
		System.out.println( map.get("자동차") );
		System.out.println( map.get("없는값") ); //해당 키가 존재하지 않으면 null이 나온다.
		System.out.println();
		
		System.out.println( map.containsKey("자동차")); //해당하는 키가 존재하는지 유무
		System.out.println( map.containsKey("aaa")); //해당하는 키가 존하면: true / 존재하지 않으면: false
		System.out.println();
		
		map.remove("선풍기"); //해당하는 키와 값 제거
		System.out.println( map );
		
		System.out.println( map.keySet() ); //해당하는 키만 가져온다.
		System.out.println();
		
		//Set set = map.keySet();
		//Iterator it = set.iterator();
		Iterator it = map.keySet().iterator(); // . . : 순차적으로 하나씩 해석하면 된다.
		// it = [bof, 자동차, 선풍기, eof]
		// map = {자동차:10만원, 선풍기:100만원}
		while( it.hasNext() ) {//다음 값이 있는지 확인
			String s = (String)it.next(); //해당 값을 꺼내와서 저장
			System.out.println( s + " : " + map.get(s) ); //해당 키와 값을 꺼내옴
		}
		System.out.println();
		
		
		String k ="우리집", v="종로 3가";
		map.put(k, v);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 값 입력 : ");
		String search = sc.next();
		if(map.get(search) == null) {
			System.out.println("존재하지 않는 주소");
		}else {
			System.out.println(search + " : " + map.get(search));
		}
	}
}
