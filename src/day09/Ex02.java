package day09;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		/*
		Map
		- Ű�� ������ �ϳ��� ������ �̷���� �ִ�.
		- ������ �������� ������, Ű�� �ߺ��� ������� �ʴ´�. 
		 */
		HashMap map = new HashMap();
		map.put("��ǳ��", "100����"); //(Ű, ��)
		map.put("������", "50����");
		map.put("�ڵ���", "10����");
		
		map.put("��ǳ��", "1000����"); //Ű�� ���� �ߺ��� ������� �ʴ´�.
		System.out.println(map); //Ű���� �ߺ����� �ʴ� ���� ó���� �����ϴ�.
		
		System.out.println( map.get("��ǳ��") ); //Ű�� ���ؼ� �ش� ���� �����´�.
		System.out.println( map.get("�ڵ���") );
		System.out.println( map.get("���°�") ); //�ش� Ű�� �������� ������ null�� ���´�.
		System.out.println();
		
		System.out.println( map.containsKey("�ڵ���")); //�ش��ϴ� Ű�� �����ϴ��� ����
		System.out.println( map.containsKey("aaa")); //�ش��ϴ� Ű�� ���ϸ�: true / �������� ������: false
		System.out.println();
		
		map.remove("��ǳ��"); //�ش��ϴ� Ű�� �� ����
		System.out.println( map );
		
		System.out.println( map.keySet() ); //�ش��ϴ� Ű�� �����´�.
		System.out.println();
		
		//Set set = map.keySet();
		//Iterator it = set.iterator();
		Iterator it = map.keySet().iterator(); // . . : ���������� �ϳ��� �ؼ��ϸ� �ȴ�.
		// it = [bof, �ڵ���, ��ǳ��, eof]
		// map = {�ڵ���:10����, ��ǳ��:100����}
		while( it.hasNext() ) {//���� ���� �ִ��� Ȯ��
			String s = (String)it.next(); //�ش� ���� �����ͼ� ����
			System.out.println( s + " : " + map.get(s) ); //�ش� Ű�� ���� ������
		}
		System.out.println();
		
		
		String k ="�츮��", v="���� 3��";
		map.put(k, v);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ã�� �� �Է� : ");
		String search = sc.next();
		if(map.get(search) == null) {
			System.out.println("�������� �ʴ� �ּ�");
		}else {
			System.out.println(search + " : " + map.get(search));
		}
	}
}
