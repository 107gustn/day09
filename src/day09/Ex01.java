package day09;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*
		set
		- ������ �������� �ʴ´�.
		- �ߺ��� ���� ������� ����
		*/
		ArrayList arr = new ArrayList();
		arr.add("ȫ�浿");
		arr.add("ȫ�浿");
		System.out.println("arr : " + arr);
		
		//set : �ߺ��� ���� ������� �ʴ´�. ������ �������� �ʾƼ� �ε����� ������ �Ұ�
		HashSet hs = new HashSet();
		hs.add("ȫ�浿");
		hs.add("�谳��");
		hs.add("ȫ�浿");
		System.out.println(hs.remove("ȫ�浿")); //������ ����� �Ǹ� true ���� ���´�.
		System.out.println("hs : " + hs);
		
		hs.add("ȫ�浿");
		//������ ��� get���� �ε��� ������ �Ұ�
		System.out.println();
		
		//it=[bof ,'ȫ�浿', 'ȫ�浿', eof] //iterator(�ݺ���): ���� �� ���� ���� bof(������), ���� �� ���� ���� eof(����: �����Ͱ� ����)�� ����.
		//    it -hasNext()
		//           it -next(),hasNext()
		//                    it -next()
		Iterator it = arr.iterator(); //it �������� arr�� ���� ���������� ����
		while(it.hasNext() == true) {
			System.out.println(it.next());
		}
		/*
		System.out.println( it.hasNext() ); //it�� ��ġ���� �������� �����ϴ��� ����
		System.out.println( it.next() ); //next�� ������ it�� ������ġ�� �̵��Ͽ� ���� ������
		
		System.out.println( it.hasNext() );
		System.out.println( it.next() );
		
		System.out.println( it.hasNext() ); //false�� ������ �������� �����Ƿ� next ����� �Ұ����ϴ�.
		System.out.println( it.next() );
		*/
		System.out.println();
		
		it = hs.iterator();
		while(it.hasNext()) {
			Object s = it.next(); //next()�� ObjectŸ���̿��� �����ϱ� ���� Object Ÿ������ �޾��ش�.
			String st = (String)s; //�� ��ȯ - ���� Ÿ���� �ٸ��� �� ��ȯ�� ���� Ÿ���� �����ϰ� �����ؼ� ����//String Ÿ������ ����ȯ
			System.out.println( s );
		}
		// ( �޼ҵ� ) : Ư���� ����� �������ִ�. �����ϰ��� �ϴ� ���� ���� Ÿ���� ����������Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next(); //����� ���� �� ����� ������ �����ϱ� ���ؼ��� ��ɿ��� �˷��ִ� �ش� Ÿ������ �������ش�.
		System.out.println(s1);
		
	}

}
