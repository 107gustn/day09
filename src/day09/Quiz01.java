package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		HashMap map = new HashMap();
		Scanner sc = new Scanner(System.in);

		boolean fflag = true, sflag = true;
		int sNum=0, ik = 0, uk = 0;
		String im = null, um = null, rm = null;
		
		while(fflag) {
			System.out.println("1.메뉴 등록");
			System.out.println("2.메뉴별 가격 보기");
			System.out.println("3.종 료");
			System.out.print(">>> ");
			sNum = sc.nextInt();
			
			switch(sNum) {
			case 1:
				System.out.print("등록할 메뉴 : ");
				im = sc.next();
				System.out.print("메뉴 가격 : ");
				ik = sc.nextInt();
				if(map.containsKey(im) == false) {
					map.put(im, ik);
					System.out.println("메뉴가 등록되었습니다.\n");					
				}else {
					System.out.println("동일한 메뉴가 존재합니다.\n");
				}
				break;
			case 2:
				while(sflag) {
					System.out.println("등록한 메뉴 목록 입니다.");
					Iterator it = map.keySet().iterator();
					while( it.hasNext() ) {
						String s = (String)it.next();
						System.out.println("[" + s + "]" + " : " + map.get(s) + "원");
					}
					System.out.println("1.수정 2.삭제 3.나가기");
					System.out.print(">>> ");
					sNum = sc.nextInt();
					switch(sNum){
					case 1:
						System.out.print("수정할 메뉴를 입려하세요 : ");
						um = sc.next();
						if(map.containsKey(um) == true) {
							System.out.print("수정될 메뉴 가격 : ");
							uk = sc.nextInt();
							map.put(um, uk);
							System.out.println("메뉴가 수정되었습니다.\n");					
						}else {
							System.out.println("해당 메뉴는 없는 메뉴 입니다.\n");
						}
						break;
					case 2:
						System.out.print("삭제하려는 메뉴룰 입력하세요 : ");
						rm = sc.next();
						if(map.containsKey(rm) == true) {
							map.remove(rm);
							System.out.println("메뉴가 삭제되었습니다.\n");					
						}else {
							System.out.println("해당 메뉴는 없는 메뉴 입니다.\n");
						}
						break;
					case 3:
						System.out.println("나갑니다.");
						sflag = false;
						break;
					default:
						System.out.println("다시 선택하세요.\n");
					}
				}
				sflag = true;
				System.out.println();
				break;
			case 3:
				System.out.println("종료합니다.");
				fflag = false;
				break;
			default:
				System.out.println("다시 선택하세요.\n");
			}
		}

	}

}
