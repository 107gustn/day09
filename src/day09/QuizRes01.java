package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class QuizRes01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num;
		HashMap map = new HashMap();
		String name = null, price = null;
		while (true) {
			System.out.println("1.메뉴 등록");
			System.out.println("2.메뉴별 가격 보기");
			System.out.println("3.종료");
			System.out.print(">>> : ");
			num = input.nextInt();
			switch (num) {
			case 1:
				while (true) {
					System.out.println("메뉴 입력");
					name = input.next();
					if (map.containsKey(name) == false) {
						break;
					}
					System.out.println("존재하는 메뉴. 다시 입력");
				}
				System.out.println("가격 입력");
				price = input.next();
				map.put(name, price);
				break;
			case 2:
				// System.out.println(map);
				Iterator it = map.keySet().iterator();
				while (it.hasNext()) {
					String key = (String) it.next();
					System.out.println(key + " : " + map.get(key));
				}
				System.out.println("1.수정 2.삭제 3.나가기");
				num = input.nextInt();
				if (num == 1) {
					while (true) {
						System.out.println("수정 메뉴 입력");
						name = input.next();
						if (map.containsKey(name) == true) {
							break;
						}
						System.out.println("존재하지 않은 메뉴. 다시 입력");
					}
					System.out.println("수정 가격 입력");
					price = input.next();
					map.put(name, price);
					System.out.println("수정 되었습니다!!!");
				} else if (num == 2) {
					while (true) {
						System.out.println("삭제 메뉴 입력");
						name = input.next();
						if (map.containsKey(name) == true) {
							map.remove(name);
							System.out.println(name + "은 삭제되었습니다");
							break;
						}
						System.out.println("존재하지 않은 메뉴. 다시 입력");
					}
				}
				break;
			case 3:
				System.exit(1);
			}
		}

	}

}
