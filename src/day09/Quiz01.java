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
			System.out.println("1.�޴� ���");
			System.out.println("2.�޴��� ���� ����");
			System.out.println("3.�� ��");
			System.out.print(">>> ");
			sNum = sc.nextInt();
			
			switch(sNum) {
			case 1:
				System.out.print("����� �޴� : ");
				im = sc.next();
				System.out.print("�޴� ���� : ");
				ik = sc.nextInt();
				if(map.containsKey(im) == false) {
					map.put(im, ik);
					System.out.println("�޴��� ��ϵǾ����ϴ�.\n");					
				}else {
					System.out.println("������ �޴��� �����մϴ�.\n");
				}
				break;
			case 2:
				while(sflag) {
					System.out.println("����� �޴� ��� �Դϴ�.");
					Iterator it = map.keySet().iterator();
					while( it.hasNext() ) {
						String s = (String)it.next();
						System.out.println("[" + s + "]" + " : " + map.get(s) + "��");
					}
					System.out.println("1.���� 2.���� 3.������");
					System.out.print(">>> ");
					sNum = sc.nextInt();
					switch(sNum){
					case 1:
						System.out.print("������ �޴��� �Է��ϼ��� : ");
						um = sc.next();
						if(map.containsKey(um) == true) {
							System.out.print("������ �޴� ���� : ");
							uk = sc.nextInt();
							map.put(um, uk);
							System.out.println("�޴��� �����Ǿ����ϴ�.\n");					
						}else {
							System.out.println("�ش� �޴��� ���� �޴� �Դϴ�.\n");
						}
						break;
					case 2:
						System.out.print("�����Ϸ��� �޴��� �Է��ϼ��� : ");
						rm = sc.next();
						if(map.containsKey(rm) == true) {
							map.remove(rm);
							System.out.println("�޴��� �����Ǿ����ϴ�.\n");					
						}else {
							System.out.println("�ش� �޴��� ���� �޴� �Դϴ�.\n");
						}
						break;
					case 3:
						System.out.println("�����ϴ�.");
						sflag = false;
						break;
					default:
						System.out.println("�ٽ� �����ϼ���.\n");
					}
				}
				sflag = true;
				System.out.println();
				break;
			case 3:
				System.out.println("�����մϴ�.");
				fflag = false;
				break;
			default:
				System.out.println("�ٽ� �����ϼ���.\n");
			}
		}

	}

}
