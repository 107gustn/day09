package day09;

import test.Member; //import: �� ������Ʈ�� ����� ������ �ö� ���

//Ŭ���� ��ü �޼ҵ�
//�ݺ������� ����� �ȴٸ� Ŭ����(Ʋ)�� ���� ����Ѵ�.
//Ŭ���� - �ϳ��� �ڷ���
//Ŭ���� ���� = ��ü
/*
���� ������
- public : Ŭ���� ����, �ܺο��� ���� ����
- private : Ŭ���� ���ο����� ���� ���� , �ܺ����� ������� ����
- protected : ��ӹ��� �ڽ� �Ǵ� ���ο��� ���� ����
- default : ���� ��Ű�� �ȿ��� ���� ����
*/
//( �޼ҵ� ) = ���, Ŭ������ �ִ� ��� = �޼ҵ�, Ŭ������ ���� ��� = �Լ�
public class MainClass01 {
	public static void main(String[] args) {
		Member m = new Member();
		m.name = "ȫ�浿";
		
		
		TestClass01 t = new TestClass01(); //TestClass01(�ڷ���) t(����)
		t.name = "ȫ�浿"; //. : ������� ������
		t.age = 20;
		System.out.println(t.name + t.age);
		
		
	}
}
