package day09;

public class TestClass02 {
//  ���������� ��ȯŸ�� �޼ҵ� ��(�Ű�����(argument))
	public   void  test   (     ) {//��ɿ� �����ϴ� �̸����� �������ش�.
		test2();
		System.out.println("test �޼ҵ� ����");
	}
	public   void  test1   (     ) {
		System.out.println("test1 �޼ҵ� ����");
	} //�޼ҵ尡 ������ �޼ҵ带 ȣ���ߴ� �������� �ٽ� �̵�
	public   void  test2   (     ) {
		test1();
		System.out.println("test2 �޼ҵ� ����");
	}

}
